package yyf.org.springframework.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Before：方法前执行
 * @AfterReturning：运行方法后执行
 * @AfterThrowing：Throw后执行
 * @After：无论方法以何种方式结束，都会执行（类似于finally） @Around：环绕执行
 * @author yuyufeng
 *
 */
@Aspect
public class AspectJtest {
	@Pointcut("execution(* *.test(..))")
	public void test() {

	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.out.println("before1");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return o;
	}
}
