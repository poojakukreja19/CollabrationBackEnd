package com.niit.collabration.Config;

	import java.util.Properties;

	import javax.sql.DataSource;

	import org.hibernate.SessionFactory;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	import org.springframework.orm.hibernate4.HibernateTransactionManager;
	import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
	import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.collabration.Model.Blog;
import com.niit.collabration.Model.Event;
import com.niit.collabration.Model.Forum;
import com.niit.collabration.Model.Job;
import com.niit.collabration.Model.Userdetail;


	@Configuration
	@ComponentScan("com.niit.collaboration")
	@EnableTransactionManagement
	public class ApplicationContextConfig {
		
		@Bean(name="datasource")
		public DataSource getOracleDataSource(){
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			dataSource.setUsername("sys as sysdba");
			dataSource.setPassword("pooja");
			return dataSource;
		}
			
			private Properties getHibernateProperties()
			{
				Properties properties =new Properties();
			    properties.put("hibernate dialect","org.hibernate.dialect.Oracle10gDialect");
			    properties.put("hibernate.show_sql", "true");
			    properties.put("hibernate.hbm2ddl.auto", "update");

			    return properties;
				
			}
		

		@Autowired
		@Bean(name = "sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource) {

			System.out.println("=====================================session Factory Establish==============================");

			LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			
			sessionBuilder.addProperties(getHibernateProperties());
			sessionBuilder.addAnnotatedClass(Userdetail.class);
			sessionBuilder.addAnnotatedClass(Blog.class);
    		sessionBuilder.addAnnotatedClass(Event.class);
			sessionBuilder.addAnnotatedClass(Forum.class);
        	sessionBuilder.addAnnotatedClass(Job.class);
			return sessionBuilder.buildSessionFactory();
		}

		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {

			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			return transactionManager;
		}


	}
