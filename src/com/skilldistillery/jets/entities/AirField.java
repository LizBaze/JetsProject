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
				addJet(type, model, speed, range, price);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);
			printStars();
		}
	}

	public void flyJets() {
		for (Jet jet : jets) {
			jet.fly();
			printStars();
		}
	}

	public void fastestJet() {
		double fastest = 0;
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastest) {
				fastest = jet.getSpeed();
			}
		}
		for (Jet jet2 : jets) {
			if (jet2.getSpeed() >= fastest) {
				System.out.println("The fastest jet is the " + jet2);
				printStars();
			}
		}
	}
	
	public void longestRange() {
		int farthest = 0;
		for (Jet jet : jets) {
			if (jet.getRange() > farthest) {
				farthest = jet.getRange();
			}
		}
		for (Jet jet : jets) {
			if (jet.getRange() >= farthest) {
				System.out.println("The jet with the longest range is the " + jet);
				printStars();
			}
		}
		
	}
	
	public void loadCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
				printStars();
			}
		}
	}
	
	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof Fighter) {
				((Fighter) jet).fight();
				printStars();
			}
			
		}
	}
	
	public void spyMission() {
		for (Jet jet : jets) {
			if (jet instanceof SpyClass) {
				((SpyClass) jet).spy();
				printStars();
			}
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
	
	public void removeJet(String model) {
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i).getModel().equalsIgnoreCase(model)) {
				jets.remove(i);
				System.out.println(model + " has been removed.");
				break;
			}
			System.out.println("No such model exists. Please try again.");
		}
	}
	
	public void printStars() {
		System.out.println("-----------------------------------------------------------------------------------------");
	}
}
