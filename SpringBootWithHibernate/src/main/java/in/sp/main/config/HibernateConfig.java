package in.sp.main.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;


public class HibernateConfig
{
  @Bean
  public static SessionFactory getSessionFactory() 
  {
	  Configuration cfg = new Configuration();
		cfg.configure("/in/sp/main/resources/hibernate.cfg.xml");
		return cfg.buildSessionFactory();
  }
}
