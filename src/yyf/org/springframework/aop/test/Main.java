package yyf.org.springframework.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/aop/aspect.xml");
		TestBean bean = (TestBean) ac.getBean("test");
		bean.test();
	}

}
