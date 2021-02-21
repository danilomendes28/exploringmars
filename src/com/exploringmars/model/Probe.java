package com.exploringmars.model;

public class Probe {
	 private int positionX;
	 private int positionY;
	 private char direction;
	 
	 public boolean land (Mars mars, int positionX, int positionY) {
		 
		boolean[][] terreno =  mars.getTerreno(); 
		boolean isOcuppied = terreno[positionX][positionY];
		
		if (isOcuppied == true) {
			return false;
		} else {
			terreno[positionX][positionY] = true;
			this.positionX = positionX;
			this.positionY = positionY;
			return true;
		}
			
		 
	 }
	 
	public int getPositionX(){
		return positionX;
	 }
	public int getPositionY() {
		return positionY;
	}
}
