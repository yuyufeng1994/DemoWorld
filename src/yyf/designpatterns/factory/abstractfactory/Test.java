package yyf.designpatterns.factory.abstractfactory;

import yyf.designpatterns.factory.simplefactory.Car;
/**
 * 抽象工厂模式测试
 * @author Yu Yufeng
 *
 */
public class Test {
	public static void main(String[] args) throws Exception {
		CarFactory cf = new BenzCarFactory();
		Car c = cf.createCar("benz");
		c.setName("benz");
		c.drive();
	}
}
