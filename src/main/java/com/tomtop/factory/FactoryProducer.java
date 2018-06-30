package com.tomtop.factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactoryTwo();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}

}
