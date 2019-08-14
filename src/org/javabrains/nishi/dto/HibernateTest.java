package org.javabrains.nishi.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.javabrains.nishi.dto.entity.Cis_Idea_Status_Entity;
import org.javabrains.nishi.dto.entity.Cis_User_Entity;
import org.javabrains.nishi.dto.entity.Cis_User_Idea_Entity;
import org.javabrains.nishi.dto.entity.Cis_User_Role_Entity;

public class HibernateTest  {

	public static void main(String[] args) {
		Cis_User_Entity user=new Cis_User_Entity();
		user.setUser_first_name("nishikant singh");
		user.setUser_password("1234");
		user.setUser_confirm_password("1234");
		
		Cis_User_Role_Entity user_role=new Cis_User_Role_Entity();
		user_role.setRole_description("this is a role1");
		user_role.setRole_type(0);
		user_role.setRole_user_id(user);
		
		Cis_User_Idea_Entity user_idea=new Cis_User_Idea_Entity();
		user_idea.setIdea_short_description("idea1");
		user_idea.setIdea_details("wdefewf");
		
		
		user_idea.setIdea_created_on(java.util.Calendar.getInstance().getTime());
		user_idea.setIdea_user_id(user);
		
		Cis_Idea_Status_Entity idests= new Cis_Idea_Status_Entity();
		idests.setIdea_status("fdsbfjsdbf");
		idests.setIdea_modified_date(java.util.Calendar.getInstance().getTime());
		idests.setIdests_idea_id(user_idea);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user_role);
		session.save(user_idea);
		session.save(idests);
		session.getTransaction().commit();
		session.close();
		
		/*user=null;
		session= sessionfactory.openSession();
		session.beginTransaction();
		user=(UserDetails)session.get(UserDetails.class,2 );
		System.out.println(user.getName());*/
		
	}
}
