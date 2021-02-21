package com.exploringmars.model;

public class Mars {

	private boolean[][] terreno;

	public Mars() {
		terreno = new boolean[5][5];

	}
	
	public boolean[][] getTerreno() {
		return terreno;
	}
}
