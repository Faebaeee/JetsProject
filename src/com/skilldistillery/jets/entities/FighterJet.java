package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{
	public FighterJet() {
		super();
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		System.out.println(this.getModel() + " has engaged in a dogfight! ");
	}


}
