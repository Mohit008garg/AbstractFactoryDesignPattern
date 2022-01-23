package com.demo.designPatterns;

import com.demo.designPatterns.hatchback.hyundai.I20;
import com.demo.designPatterns.hatchback.maruti.Maruti800;
import com.demo.designPatterns.hatchback.tata.Altroz;

public class HatchBackFactory extends AbstractFactory{
	Vehicle getVehicle(String vehicleCompanyName) {
		if(vehicleCompanyName.equalsIgnoreCase("Tata")){
			return new Altroz();
		}else if(vehicleCompanyName.equalsIgnoreCase("Hyundai")){
			return new I20();
		}else if(vehicleCompanyName.equalsIgnoreCase("Maruti")){
			return new Maruti800();
		}else{
			return null;
		}
	}
}
