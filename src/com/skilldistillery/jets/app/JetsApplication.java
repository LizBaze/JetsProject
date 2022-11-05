package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	Scanner sc = new Scanner(System.in);
	AirField af = new AirField();

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();
	}

	public void launch() {
		boolean keepGoing = true;

		while (keepGoing) {
			displayUserMenu();
			int userInput = sc.nextInt();
			sc.nextLine();
			switch (userInput) {
			case 1:
				af.listFleet();
				break;
			case 2:
				af.flyJets();
				break;
			case 3:
				af.fastestJet();
				break;
			case 4:
				af.longestRange();
				break;
			case 5:
				af.loadCargo();
				break;
			case 6:
				af.dogFight();
				break;
			case 7:
				af.spyMission();
				break;
			case 8:
				addJet();
				break;
			case 9:
				removeJet();
				break;
			case 10:
				keepGoing = false;
				break;
			default:
				System.out.println("Invalid selection. Please try again.");
			}
		}
		System.out.println("Thanks for using JetLines Enterprises. Have a nice day!");
	}

	public void displayUserMenu() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Commence intel operation");
		System.out.println("8. Add a jet"); // TODO
		System.out.println("9. Remove a jet"); // TODO
		System.out.println("10. Quit");
	}
	
	public void addJet() {
		System.out.println("Passenger, Cargo, Fighter, or Spyclass?");
		String type = sc.next();
		System.out.println("Please enter the model: ");
		String model = sc.next();
		System.out.println("Please enter the speed: ");
		double speed = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please enter the range: ");
		int range = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the price: ");
		long price = sc.nextLong();
		sc.nextLine();
		af.addJet(type, model, speed, range, price);
		System.out.println("Your jet has been added to the fleet.");
	}
	
	public void removeJet() {
		System.out.println("Please enter the model of the jet you would like to remove: ");
		String userInput = sc.next();
		sc.nextLine();
		af.removeJet(userInput);
		
	}

}
