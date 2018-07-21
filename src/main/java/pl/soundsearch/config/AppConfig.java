package pl.soundsearch.config;

import javax.persistence.EntityManagerFactory;
import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import pl.soundsearch.converter.BandUserConverter;
import pl.soundsearch.converter.InstrumentConverter;
import pl.soundsearch.converter.MusicGenreConverter;
import pl.soundsearch.converter.SingleUserConverter;
import org.springframework.context.annotation.Import;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pl.soundsearch")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "pl.soundsearch.repository")
@Import(SecurityConfiguration.class)

public class AppConfig extends WebMvcConfigurerAdapter {

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
		emfb.setPersistenceUnitName("soundsearchdbPersistenceUnit");
		return emfb;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/static/");
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager tm = new JpaTransactionManager(emf);
		return tm;
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public Validator validator() {
		return new LocalValidatorFactoryBean();
	}

	/*********************************/
	/*********** CONVERTERS **********/
	/*********************************/

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(getMusicGenreConverter());
		registry.addConverter(getInstrumentConverter());
		registry.addConverter(getSingleUserConverter());
		registry.addConverter(getBandUserConverter());
	}

	@Bean
	public MusicGenreConverter getMusicGenreConverter() {
		return new MusicGenreConverter();
	}

	@Bean
	public InstrumentConverter getInstrumentConverter() {
		return new InstrumentConverter();
	}

	@Bean
	public SingleUserConverter getSingleUserConverter() {
		return new SingleUserConverter();
	}
	
	@Bean
	public BandUserConverter getBandUserConverter() { 
		return new BandUserConverter(); 
		
	}
	

}
