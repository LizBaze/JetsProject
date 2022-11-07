package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady{

	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		System.out.println(getModel() + " here. Let's go get 'em! Pew pew");
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + ", " + toString() + ", Max Flight Time: " + (getRange() / getSpeed()) + " hours");	
		}
	}



