package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + ", " + toString() + ", Max Flight Time: " + (getRange() / getSpeed()) + " hours");	
		}
	
	public void takeTrip() {
		System.out.println(getModel() + " here, what's our destination? Please tell me it's Bermuda.");
	}

}
