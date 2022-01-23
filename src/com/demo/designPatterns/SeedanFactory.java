package com.demo.designPatterns;

import com.demo.designPatterns.seedan.hyundai.Verna;
import com.demo.designPatterns.seedan.maruti.Ciaz;
import com.demo.designPatterns.seedan.tata.Tigor;

public class SeedanFactory extends AbstractFactory{
	Vehicle getVehicle(String vehicleCompanyName) {
		if(vehicleCompanyName.equalsIgnoreCase("Tata")){
			return new Tigor();
		}else if(vehicleCompanyName.equalsIgnoreCase("Hyundai")){
			return new Verna();
		}else if(vehicleCompanyName.equalsIgnoreCase("Maruti")){
			return new Ciaz();
		}else{
			return null;
		}
	}
}
