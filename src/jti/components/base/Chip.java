package jti.components.base;

import java.util.HashMap;

import jti.components.base.Pin;
import jti.components.base.Wire;

public class Chip {
	private HashMap<String, Pin> pins;


	/**
	 * Create a chip
	 */
	public Chip(String pinNames[]) {
		//Initalize list of pins
		this.pins = new HashMap<String, Pin>();

		//Add all the pins
		for(String name : pinNames) {
			this.pins.put(name, new Pin(name));
		}
	}
}