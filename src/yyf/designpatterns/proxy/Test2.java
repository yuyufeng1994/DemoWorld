package yyf.designpatterns.proxy;

/**
 * 动态代理测试
 * 
 * @author Yu Yufeng
 *
 */
public class Test2 {

	public static void main(String[] args) throws Throwable {
		Subject subject = new RealSubject();
		ProxyHandler proxy = new ProxyHandler(subject);
		proxy.invoke(proxy, Subject.class.getMethod("operate"), new Object[] {});
		//从这里我们可以看出，动态代理与静态代理的区别。在我看来，就是通过反射来实现的代理
	}

}
