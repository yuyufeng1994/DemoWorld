package yyf.designpatterns.factory.abstractfactory;

import yyf.designpatterns.factory.simplefactory.Benz;
import yyf.designpatterns.factory.simplefactory.Car;

public class BenzCarFactory extends CarFactory {
	@Override
	Car createCar(String car) throws Exception {
		return new Benz();
	}

}
