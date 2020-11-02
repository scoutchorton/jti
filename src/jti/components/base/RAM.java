package jti.components.base;

import jti.components.base.Chip;

public class RAM extends Chip {
	Byte data[][];

	
	/**
	 * Create a modifiable memory bank
	 */
	public RAM(int addressWidth, int dataWidth) {
		//Create names for write, enable, and each address pin and data pin
		String[] pinNames = new String[addressWidth + dataWidth + 2];
		//Set write and enable
		pinNames[0] = "WR";
		pinNames[1] = "EN";
		//Set name for address lines
		for(int index = 0; index < addressWidth; index++)
			pinNames[index + 2] = "A" + index;
		//Set name for data lines
		for(int index = 0; index < dataWidth; index++)
			pinNames[index + addressWidth + 2] = "D" + index;

		//Create chip with enough pins for address, data, read enable, write enable
		this(pinNames);

		//Allocate data
		this.data = new Byte[addressWidth][dataWidth];
	}
}