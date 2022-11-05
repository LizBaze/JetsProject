package com.skilldistillery.jets.entities;

public class SpyPlane extends Jet implements SpyClass{

	public SpyPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void spy() {
		// TODO Auto-generated method stub
		System.out.println(getModel() + " reporting in. Hey what do you think they're doing down there? What do you mean that's *my* job!?");
		
	}

	@Override
	public void fly() {
		System.out.println(toString() + ", Max Flight Time: " + (getRange() / getSpeed()) + " hours");	}
	
	

}
