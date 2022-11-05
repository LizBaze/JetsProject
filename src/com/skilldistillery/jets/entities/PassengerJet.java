package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {
	
	// This was my JetImpl class, it has all the same functionality, 
	// I just added takeTrip as well, hopefully that's ok!

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + ", " + toString() + ", Max Flight Time: " + (getRange() / getSpeed()) + " hours");	
		}
	
	public void takeTrip() {
		System.out.println(getModel() + " here, what's our destination? Please tell me it's Bermuda.");
	}

}
