package tranquanlam.Config.com;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "tranquanlam")
@PropertySource(value = { "classpath:db.properties" })
@EnableTransactionManagement

public class config extends WebMvcConfigurerAdapter {

	@Autowired
	Environment enviroment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public ViewResolver resolver() {
		InternalResourceViewResolver internalResourceView = new InternalResourceViewResolver();
		internalResourceView.setViewClass(JstlView.class);
		internalResourceView.setPrefix("/WEB-INF/views/");
		internalResourceView.setSuffix(".jsp");
		return internalResourceView;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resource/**").addResourceLocations("/recources/");
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(enviroment.getProperty("driver"));
		dataSource.setUrl(enviroment.getProperty("url"));
		dataSource.setUsername(enviroment.getProperty("user"));
		dataSource.setPassword(enviroment.getProperty("passwork"));
		return dataSource;

	}

	@Bean
	
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean(name="WebGift")
	public DataSource dataSource1() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(enviroment.getProperty("driver"));
		dataSource.setUrl(enviroment.getProperty("url1"));
		dataSource.setUsername(enviroment.getProperty("user"));
		dataSource.setPassword(enviroment.getProperty("passwork"));

		return dataSource;
	}

	@Bean(name = "template1")
	public JdbcTemplate jdbcTemplate1() {
		return new JdbcTemplate(dataSource1());
	}



	@Bean
	public LocalSessionFactoryBean factory() {
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(dataSource1());
		bean.setPackagesToScan("tranquanlam.entity.com");
		
		Properties properties=new Properties();
		properties.put("hibernate.dialect", enviroment.getProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql",true);
		
		bean.setHibernateProperties(properties);
		return  bean;
	}
	@Bean(name="transactionManager")
	@Autowired
	public HibernateTransactionManager TransactionManager (SessionFactory factory) {
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(factory);
		return hibernateTransactionManager;
	}

}
