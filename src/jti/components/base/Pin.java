package jti.components.base;

import jti.components.base.Wire;

/**
 * A pin on a component which can connect to other pins via Wires
 */
public class Pin {
	private Wire connection;
	private Float voltage;

	protected String name;


	/**
	 * Creates a pin but doesn't attach to a Wire.
	 */
	public Pin(String name) {
		this.voltage = new Float(0);
		this.name = name;
	}
	

	/**
	 * Updates connection
	 */
	public void connect(Wire connection) {
		this.connection = connection;
	}
	
	/**
	 * Updates the voltage the pin holds
	 */
	protected void setVoltage(Float voltage) {
		this.voltage = voltage;
	}

	/**
	 * Update the pin voltage output
	 */
	public void updateVoltage(Float voltage) {
		this.connection.update(voltage);
	}

	/**
	 * Get voltage of pin
	 */
	public Float getVoltage() {
		return this.voltage;
	}
}