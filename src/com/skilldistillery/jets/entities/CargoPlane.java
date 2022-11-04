package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	
	
	
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("What do you want me to carry?");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I may be slow but I'll get there eventually");
	}
	
	

}
