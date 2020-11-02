package jti;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.BoxLayout;

import java.awt.Component;

import jti.gui.LabelledButton;
import jti.gui.LabelledButtonGroup;
import jti.gui.Screen;

class JTI extends JPanel {
	//LabelledButton calcButtons[][];

	/**
	 */
	JTI() {}
	
	/**
	 */
	static public void initalizeGUI() {
		//Initalize variables
		JFrame mainWindow = new JFrame("JTI");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTI jti_instance = new JTI();
		jti_instance.setLayout(new BoxLayout(jti_instance, BoxLayout.Y_AXIS));
		Screen calcScreen = new Screen(320, 240);

		LabelledButtonGroup calcButtons[];

		//Initalize buttons
		calcButtons = new LabelledButtonGroup[10];

		//Row 1
		calcButtons[0] = new LabelledButtonGroup();
		calcButtons[0].add(new LabelledButton("y=", "stat plot", "f1"));
		calcButtons[0].add(new LabelledButton("window", "tblset", "f2"));
		calcButtons[0].add(new LabelledButton("zoom", "format", "f3"));
		calcButtons[0].add(new LabelledButton("trace", "calc", "f4"));
		calcButtons[0].add(new LabelledButton("graph", "table", "f5"));

		//Row 2
		calcButtons[1] = new LabelledButtonGroup();
		calcButtons[1].add(new LabelledButton("2nd"));
		calcButtons[1].add(new LabelledButton("mode", "quit"));
		calcButtons[1].add(new LabelledButton("del", "ins"));
		calcButtons[1].add(new LabelledButton("⯇"));
		calcButtons[1].add(new LabelledButton("⯅"));

		//Add calculator screen
		jti_instance.add(calcScreen);

		//Add buttons to window
		jti_instance.add(calcButtons[0]);
		jti_instance.add(calcButtons[1]);

		//Draw window
		mainWindow.setContentPane(jti_instance);
		mainWindow.pack();
		mainWindow.setVisible(true);

		//Draw pixels
		calcScreen.init();
		for(int x = 0; x < 50; x++) {
			for(int y = 0; y < 50; y++) {
				calcScreen.paintPixel(x, y, 0x0FD00);
			}
		}
	}

	/**
	 */
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				initalizeGUI();
			}
		});
	}
}
