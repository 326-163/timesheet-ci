package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
public class TimesheetApplication {

	public static void main(String[] args) 
	{SpringApplication.run(TimesheetApplication.class, args);}

	/*
	 * @Bean
	public ServletRegistrationBean servletRegistrationBean() {
		FacesServlet servlet = new FacesServlet();
		return new ServletRegistrationBean(servlet, "*.jsf"); }

	@Bean
	public FilterRegistrationBean rewriteFilter() {
		FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
		rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST, DispatcherType.ASYNC, DispatcherType.ERROR));
		rwFilter.addUrlPatterns("/*");
		return rwFilter;
	}

	@Bean
	public FilterRegistrationBean loginFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.addUrlPatterns("/pages/*");
		registration.setFilter(new LoginFilter());
		return registration;
	}
 
	 */
 
}
