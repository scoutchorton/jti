package jti.components.base;

import java.util.HashMap;

import jti.components.base.Pin;

/**
 * A connection between pins
 */
public class Wire {
	private HashMap<String, Pin> pins;


	/**
	 * Creates a wire
	 */
	public Wire() {
		this.pins = new HashMap<String, Pin>();
	}


	/**
	 * Add a pin to the list of pins
	 */
	public void add(Pin p) {
		this.pins.put(p.name, p);
		p.connect(this);
	}

	/**
	 * Update values of all pins
	 */
	public void update(Float voltage) {
		for(Map.Entry<String, Pin> currentPin : this.pins)
			currentPin.getValue().setVoltage(voltage);
	}
}