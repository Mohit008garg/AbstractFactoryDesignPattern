package com.demo.designPatterns;


public class FactoryProducer {

	public static AbstractFactory getFactory(String vehicleType){
		if(vehicleType.equalsIgnoreCase("SUV")){
			return new SuvAbstractFactory();
		}else if(vehicleType.equalsIgnoreCase("Seedan")){
			return new SeedanFactory();
		}else if(vehicleType.equalsIgnoreCase("HatchBack")){
			return new HatchBackFactory();
		}else{
			return null;
		}
	}
}
