package com.demo.designPatterns;

public class AbstractFactoryDesignPatternMain {

	public static void main(String[] args) {
		AbstractFactory suvFactory = FactoryProducer.getFactory("SUV");
		Vehicle tataSuv = suvFactory.getVehicle("Tata");
		Vehicle hyundaiSuv = suvFactory.getVehicle("Hyundai");
		Vehicle marutiSuv = suvFactory.getVehicle("Maruti");
		System.out.println(tataSuv.getVehicleName());
		System.out.println(hyundaiSuv.getVehicleName());
		System.out.println(marutiSuv.getVehicleName());

		AbstractFactory seedanFactory = FactoryProducer.getFactory("Seedan");
		Vehicle tataSeedan = seedanFactory.getVehicle("Tata");
		Vehicle hyundaiSeedan = seedanFactory.getVehicle("Hyundai");
		Vehicle marutiSeedan = seedanFactory.getVehicle("Maruti");
		System.out.println(tataSeedan.getVehicleName());
		System.out.println(hyundaiSeedan.getVehicleName());
		System.out.println(marutiSeedan.getVehicleName());

		AbstractFactory hatchBackFactory = FactoryProducer.getFactory("HatchBack");
		Vehicle tataHatchBack = hatchBackFactory.getVehicle("Tata");
		Vehicle hyundaiHatchBack = hatchBackFactory.getVehicle("Hyundai");
		Vehicle marutiHatchBack = hatchBackFactory.getVehicle("Maruti");
		System.out.println(tataHatchBack.getVehicleName());
		System.out.println(hyundaiHatchBack.getVehicleName());
		System.out.println(marutiHatchBack.getVehicleName());
	}

}
