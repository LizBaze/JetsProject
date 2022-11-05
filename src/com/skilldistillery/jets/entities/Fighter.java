package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady{

	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println(getModel() + " here. Let's go get 'em! Pew pew");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(toString() + ", Max Flight Time: " + (getRange() / getSpeed()) + " hours");
	}


}
