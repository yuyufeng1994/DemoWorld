package yyf.javax.jms.activemq1;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyApplicationContextUtil implements ApplicationContextAware {

	public static ApplicationContext context;

	static{
		context = new ClassPathXmlApplicationContext(new String[] { "applicationContext-mq.xml" });
	}
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	public static ApplicationContext getContext() {
		return context;
	}
}