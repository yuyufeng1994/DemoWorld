package yyf.designpatterns.factory.abstractfactory;

import yyf.designpatterns.factory.simplefactory.Car;

public abstract class CarFactory {
	abstract Car createCar(String car) throws Exception;
}
