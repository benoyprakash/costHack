package com.irs.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
public class ApplicationConfiguration {

	@Value("${db.driverclass}")
	public String dbDriverClass;

	@Value("${db.url}")
	public String dbUrl;

	@Value("${db.username}")
	public String dbUserName;

	@Value("${db.password}")
	public String dbPassword;
	
	@Value("${hibernate.dialect}")
	public String hibernateDilect;
	
	@Value("${hibernate.hbm2ddl.auto}")
	public String hibernateHbmDdl;
	
	@Value("${hibernate.showsql}")
	public boolean hibernateShowSql;
	
	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show-sql";
	
	private static final String PROPERTY_NAME_HIBERNATE_DDL_AUTO = "hibernate.ddl-auto";

	@Bean
	public DataSource dataSource() {
		BoneCPDataSource dataSource = new BoneCPDataSource();
		
		dataSource.setDriverClass(dbDriverClass);
		dataSource.setJdbcUrl(dbUrl);
		dataSource.setUsername(dbUrl);
		dataSource.setPassword(dbPassword);
		dataSource.setIdleConnectionTestPeriodInMinutes(1L);
		dataSource.setIdleMaxAgeInMinutes(1L);
		dataSource.setMaxConnectionsPerPartition(30);
		dataSource.setMinConnectionsPerPartition(3);//10
		dataSource.setPartitionCount(3);
		dataSource.setAcquireIncrement(5);
		dataSource.setStatementsCacheSize(100);
		dataSource.setReleaseHelperThreads(3);
		return dataSource;
	}
	
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
		LocalContainerEntityManagerFactoryBean emFactory = new LocalContainerEntityManagerFactoryBean();
		emFactory.setDataSource(dataSource());
		emFactory.setJpaVendorAdapter(jpaVendorAdapter());
		return emFactory;
	}
	
	@Bean
	public JpaTransactionManager jpaTransactionManager(){
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setJpaDialect(new HibernateJpaDialect());
		manager.setEntityManagerFactory((EntityManagerFactory) localContainerEntityManagerFactoryBean());
		return manager;
	}
	
	@Bean
	JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(hibernateShowSql);
		adapter.setDatabasePlatform(hibernateDilect);
		adapter.setDatabase(Database.MYSQL);
		return adapter;
	}

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		Resource resource = new ClassPathResource("databaseConfig.properties");
		configurer.setLocation(resource);
		return configurer;
	}
}
