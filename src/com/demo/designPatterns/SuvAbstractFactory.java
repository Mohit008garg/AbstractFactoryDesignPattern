package com.demo.designPatterns;

import com.demo.designPatterns.suv.hyundai.Creta;
import com.demo.designPatterns.suv.maruti.Breeza;
import com.demo.designPatterns.suv.tata.Nexon;

public class SuvAbstractFactory extends AbstractFactory{

	Vehicle getVehicle(String vehicleCompanyName) {
		if(vehicleCompanyName.equalsIgnoreCase("Tata")){
			return new Nexon();
		}else if(vehicleCompanyName.equalsIgnoreCase("Hyundai")){
			return new Creta();
		}else if(vehicleCompanyName.equalsIgnoreCase("Maruti")){
			return new Breeza();
		}else{
			return null;
		}
	}
}
