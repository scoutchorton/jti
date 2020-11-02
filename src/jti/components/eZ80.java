package jti.components;

import jti.components.base.Chip;

public class eZ80 extends Chip {
	/**
	 * Create eZ80 CPU
	 */
	public eZ80() {
		String[] pinNames = {"A0", "D0"};
		super(pinNames);
	}
}