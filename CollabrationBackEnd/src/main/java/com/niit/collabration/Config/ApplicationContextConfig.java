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
		private static final Logger logger = LoggerFactory.getLogger(ApplicationContextConfig.class);

		@Bean(name = "dataSource")
		public DataSource getOracleDataSource() {
			logger.debug("Starting of the method getOracleDataSource");
			DriverManagerDataSource dataSource = new DriverManagerDataSource();

			System.out.println("=====================================Datasource Reached===============================");
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			System.out.println("=====================================Driver Manager Reached===============================");

			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			System.out.println("=====================================URL Reached===============================");

			dataSource.setUsername("system"); // Schema name
			dataSource.setPassword("pooja");
			System.out.println("=====================================Connection Establish==============================");

//			Properties connectionProperties = new Properties();
//			connectionProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
   //   		dataSource.setConnectionProperties(connectionProperties);

			logger.debug("Setting the data source :" + dataSource.getConnectionProperties());
			logger.debug("Ending of the method getOracleDataSource");
			return dataSource;
		}
			
			private Properties getHibernateProperties()
			{
				Properties properties =new Properties();
			    properties.put("hibernate dialect","org.hibernate.dialect.Oracle10gDialect");
			    properties.put("hibernate.show_sql", "true");
			    properties.put("hibernate.hbm2ddl.auto", "updtae");

			    return properties;
				
			}
		

		@Autowired
		@Bean(name = "sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource) {

			logger.debug("Starting of the method getSessionFactory");
			System.out.println("=====================================session Factory Establish==============================");

			LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			/*Properties connectionProperties = new Properties();

			connectionProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
*/
			sessionBuilder.addProperties(getHibernateProperties());
			sessionBuilder.addAnnotatedClass(Userdetail.class);
			sessionBuilder.addAnnotatedClass(Job.class);
			sessionBuilder.addAnnotatedClass(Forum.class);
			sessionBuilder.addAnnotatedClass(Event.class);
			sessionBuilder.addAnnotatedClass(Blog.class);

			logger.debug("Ending of the method getSessionFactory");
			return sessionBuilder.buildSessionFactory();
		}

		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {

			logger.debug("Starting of the method getTransactionManager");
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

			logger.debug("Ending of the method getTransactionManager");
			return transactionManager;
		}


	}
