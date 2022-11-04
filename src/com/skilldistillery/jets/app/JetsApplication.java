package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	AirField test = new AirField();

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.run();
	}
	
	public void run() {
//		test.menu();
//		test.listFleet();
		test.flyJets();
	}

}
