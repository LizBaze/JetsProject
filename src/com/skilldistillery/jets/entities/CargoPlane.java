package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{
	
	
	
	
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("I'm a " + getModel() + " and I'll carry anything, just throw it in there");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(toString() + ", Max Flight Time: " + (getRange() / getSpeed()) + " hours");	}
	
	

}
