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

	public void soloMission(String model) {
		boolean jetNotFound = true;
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i).getModel().equalsIgnoreCase(model)) {
				jets.get(i).fly();
				printStars();
				jetNotFound = false;
				break;
			}
		}
		if (jetNotFound) {
			System.out.println("No such model exists. Please try again.");
		}
	}

	public void fastestJet() {
		double fastest = 0;
		for (Jet jet : jets) {
			fastest = Math.max(fastest, jet.getSpeed());
		}
		System.out.println("The fastest jet(s) are listed below:");
		printStars();
		for (Jet jet2 : jets) {
			if (jet2.getSpeed() >= fastest) {
				System.out.println(jet2);
				printStars();
			}
		}
	}

	public void longestRange() {
		int farthest = 0;
		for (Jet jet : jets) {
			farthest = Math.max(farthest, jet.getRange());
		}
		System.out.println("The jet(s) with the longest range are listed below:");
		printStars();
		for (Jet jet : jets) {
			if (jet.getRange() >= farthest) {
				System.out.println(jet);
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

	public void takeTrip() {
		for (Jet jet : jets) {
			if (jet instanceof PassengerJet) {
				((PassengerJet) jet).takeTrip();
				printStars();
			}
		}
	}

	public void addJet(String type, String model, double speed, int range, long price) {
		switch (type.toUpperCase()) {
		case "RECONNAISSANCE":
			jets.add(new SpyPlane(model, speed, range, price));
			break;
		case "FIGHTER": 
			jets.add(new Fighter(model, speed, range, price));
			break;
		case "CARGO":
			jets.add(new CargoPlane(model, speed, range, price));
			break;
		case "PASSENGER":
			jets.add(new PassengerJet(model, speed, range, price));
			break;
		default:
			System.out.println("That type of jet is not supported. Please try again.");
			break;
		}
	}

	public void removeJet(String model) {
		boolean jetNotFound = true;
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i).getModel().equalsIgnoreCase(model)) {
				jets.remove(i);
				System.out.println(model + " has been removed.");
				jetNotFound = false;
				break;
			}
		}
		if (jetNotFound) {
			System.out.println("No such model exists. Please try again.");
		}
	}

	public void printStars() {
		System.out.println("-----------------------------------------------------------------------------------------");
	}
}
