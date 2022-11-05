package com.skilldistillery.jets.app;

import java.util.InputMismatchException;
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
		System.out.println("**** Welcome to JetLines Enterprises! ****");
		boolean keepGoing = true;
		int userInput = 0;
		
		do {
			try {
				displayUserMenu();
				userInput = sc.nextInt();
				sc.nextLine();
				switch (userInput) {
				case 1:
					af.listFleet();
					break;
				case 2:
					af.flyJets();
					break;
				case 3:
					flySolo();
					break;
				case 4:
					af.fastestJet();
					break;
				case 5:
					af.longestRange();
					break;
				case 6:
					af.loadCargo();
					break;
				case 7:
					af.dogFight();
					break;
				case 8:
					af.spyMission();
					break;
				case 9:
					af.takeTrip();
					break;
				case 10:
					addJet();
					break;
				case 11:
					removeJet();
					break;
				case 12:
					keepGoing = false;
					break;
				default:
					invalidSelection();
					break;
				}
			} catch (InputMismatchException e) {
				invalidSelection();
				userInput = 0;
				sc.nextLine();
			}
		} while (keepGoing);

		System.out.println("Thanks for using JetLines Enterprises. Have a nice day!");
	}

	public void displayUserMenu() {
		System.out.println("**********   1. List fleet    ************");
		System.out.println("******      2. Fly all jets        *******");
		System.out.println("****      3. Fly a solo mission      *****");
		System.out.println("*****      4. View fastest jet      ******");
		System.out.println("****  5. View jet with longest range  ****");
		System.out.println("******   6. Load all Cargo Jets   ********");
		System.out.println("*******       7. Dogfight        *********");
		System.out.println("******  8. Commence intel operation  *****");
		System.out.println("*******      9. Take a trip      *********");
		System.out.println("*********    10. Add a jet    ************");
		System.out.println("**********  11. Remove a jet  ************");
		System.out.println("***********    12. Quit    ***************");
	}

	public void flySolo() {
		System.out.println("Which model of jet would you like to fly?");
		af.soloMission(sc.next());
		sc.nextLine();
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

	public void invalidSelection() {
		System.out.println("***********************************");
		System.out.println("Invalid selection, please try again");
		System.out.println("***********************************");
	}
}
