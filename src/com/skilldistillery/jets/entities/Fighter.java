package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady{

	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Pew pew");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("All I do is nyoom");
	}

}
