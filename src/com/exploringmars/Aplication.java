package com.exploringmars;

import com.exploringmars.model.Mars;
import com.exploringmars.model.Probe;

public class Aplication {

	public static void main(String[] args) {

		Mars marte = new Mars();
		Probe probe1 = new Probe();
		Probe probe2 = new Probe();
		boolean conseguipousar = probe1.land(marte, 2, 3);
		System.out.println("Conseguiu pousar a sonda 1:" + conseguipousar);
		boolean conseguipousarsonda2 = probe2.land(marte, 2, 3);
		System.out.println("Conseguiu pousar a sonda 2:" + conseguipousarsonda2);
		System.out.println("A sonda 1 est� na posi��o:" + probe1.getPositionX() +", " +  probe1.getPositionY());
	}

}
