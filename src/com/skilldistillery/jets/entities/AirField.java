package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> jets = new ArrayList<>();

	public AirField() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] splitLine = line.split(",");
				String type = splitLine[0];
				String model = splitLine[1];
				double speed = Double.parseDouble(splitLine[2]);
				int range = Integer.parseInt(splitLine[3]);
				long price = Long.parseLong(splitLine[4]);
				addJet(type, model,speed, range, price);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	public void menu() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Commence intel operation");
		System.out.println("8. Add a jet");
		System.out.println("9. Remove a jet");
		System.out.println("10. Quit");	
	}

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}
	
	public void flyJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}
	
	public void addJet(String type, String model, double speed, int range, long price) {
		if (type.equalsIgnoreCase("Spy")) {
			jets.add(new SpyPlane(model, speed, range, price));
		} else if (type.equalsIgnoreCase("Fighter")) {
			jets.add(new Fighter(model, speed, range, price));
		} else if (type.equalsIgnoreCase("Cargo")) {
			jets.add(new CargoPlane(model, speed, range, price));
		} else if (type.equalsIgnoreCase("Passenger")) {
			jets.add(new JetImpl(model, speed, range, price));
		}
	}
	
	
}
