package com.skilldistillery.jets.entities;

public class SpyPlane extends Jet implements SpyClass{

	public SpyPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void spy() {
		// TODO Auto-generated method stub
		System.out.println("Hey what do you think they're doing down there? What do you mean that's *my* job!?");
		
	}

	@Override
	public void fly() {
		System.out.println("Gosh it sure is high up here");
	}
	
	

}
