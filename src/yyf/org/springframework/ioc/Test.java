package yyf.org.springframework.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1、@Autowired与@Resource都可以用来装配bean. 都可以写在字段上,或写在setter方法上。
 * 
 * 2、@Autowired默认按类型装配（这个注解是属业spring的），默认情况下必须要求依赖对象必须存在，如果要允许null值，可以设置它的required属性为false，如：
 * 
 * @Autowired(required=false) ，如果我们想使用名称装配可以结合@Qualifier注解进行使用，如下： Java代码
 * @Autowired() @Qualifier("baseDao") private BaseDao baseDao;
      
 * @author yuyufeng
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/ioc/Application.xml");
		 MyAction ma = ac.getBean(MyAction.class);
		 ma.doAction();

//		ISpringService iss = (ISpringService) ac.getBean("iSpringService");
//		iss.hello();

//		String[] strs = ac.getBeanDefinitionNames();
//		for (String s : strs) {
//			System.out.println(s);
//		}
	}

}
