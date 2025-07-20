package in.sp.main.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import in.sp.main.config.HibernateConfig;
import in.sp.main.entities.User;

@Repository
public class DBOperationsImpl implements DBOperation {

	@Override
	public User getUserDetails(int id) {
		
		User user = null;
		
		try( 
				Session session = HibernateConfig.getSessionFactory().openSession();
				)
	
		{
			user = session.get(User.class, id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return user;
	}

}
