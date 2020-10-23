package jti;

import javax.swing.JFrame;
import jti.gui.LabelledButton;

class JTI {
	/*
	 * Fields
	 */
	JFrame mainWindow;
	/*
	LabelledButton button1;
	LabelledButton button2;
	LabelledButton button3;
	LabelledButton button4;
	*/

	/*
	 * Methods
	 */
	static public void initalizeGUI() {
		//Initalize variables
		JFrame mainWindow = new JFrame("JTI");
		/*
		this.button1 = new LabelledButton("1");
		this.button2 = new LabelledButton("2");
		this.button3 = new LabelledButton("3");
		this.button4 = new LabelledButton("4");
		*/

		//Add LabelledButtons to window
		/*
		this.mainWindow.getContentPane().add(this.button1);
		this.mainWindow.getContentPane().add(this.button2);
		this.mainWindow.getContentPane().add(this.button3);
		this.mainWindow.getContentPane().add(this.button4);
		*/

		//Draw window
		mainWindow.pack();
		mainWindow.setVisible(true);
	}

	int main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				initalizeGUI();
			}
		});

		return 0;
	}
}
