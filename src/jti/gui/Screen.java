package jti.gui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

public class Screen extends JPanel {
	/**
	 * Fields
	 */
	public int width;
	public int height;
	public Pixel pixelData[][];

	/**
	 * Constructors
	 */
	public Screen(int width, int height) {
		//Initalize JPanel
		super();

		//Set fields to arguments
		this.width = width;
		this.height = height;
		this.pixelData = new Pixel[this.width][this.height];

		//Set JPanel size and visibility to force painting
		this.setPreferredSize(new Dimension(this.width, this.height));
	}

	/**
	 * Methods
	 */
	/**
	 * 565 binary format
	 * rrrrrggg gggbbbbb
	 */
	//Expects a 565 formatted number
	public void paintPixel(int x, int y, int hexCode) {
		//Do a bitwise AND to mask only the important bits, bitwise shift to align to correct place, and divide by the max value to get a percent
		float red = (float)((hexCode & 0b11111_000000_00000) >> (6+5)) / 0b11111;
		float green = (float)((hexCode & 0b00000_111111_00000) >> 5) / 0b111111;
		float blue = (float)(hexCode & 0b00000_000000_11111) / 0b11111;

		//Set pixel color
		this.pixelData[x][y] = new Pixel(x, y, red, green, blue);

		return;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Variables
		Pixel currentPixel;

		//Draw every stored Pixel
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y++) {
				currentPixel = this.pixelData[x][y];
				g.setColor(new Color(currentPixel.red, currentPixel.green, currentPixel.blue));
				g.fillRect(currentPixel.x, currentPixel.y, 1, 1);
			}
		}
	}

	//Temporary: use the OS'es builtin functions later
	public void init() {
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y++) {
				paintPixel(x, y, 0b11111_111111_11111);
			}
		}
	}

	//Pixel class
	class Pixel {
		/**
		 * Fields
		 */
		public int x;
		public int y;
		public float red;
		public float green;
		public float blue;

		/**
		 * Constructors
		 */
		Pixel(int x, int y, float red, float green, float blue) {
			this.x = x;
			this.y = y;
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
	}
}