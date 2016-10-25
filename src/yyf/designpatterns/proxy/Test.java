package yyf.designpatterns.proxy;

/**
 * 静态代理测试
 * 
 * @author Yu Yufeng
 *
 */
public class Test {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Proxy proxy = new Proxy(subject);
		proxy.operate();
	}
}
