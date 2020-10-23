package jti.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class LabelledButton extends JPanel {
	/*
	 * Fields
	 */
	//Components
	JLabel mainLabel;
	JLabel altLabel;
	JButton button;

	//Panels
	JPanel basePanel;
	JPanel labelPanel;
	
	/*
	 * Constructors
	 */
	LabelledButton(String buttonText) {
		//Create components
		this.button = new JButton(buttonText);

		//Create panels
		this.basePanel = new JPanel();
		this.labelPanel = new JPanel();

		//Add components
		basePanel.add(this.labelPanel);
		basePanel.add(this.button);
	}

	LabelledButton(String buttonText, String labelText) {
		//Create components
		this.button = new JButton(buttonText);
		this.mainLabel = new JLabel(labelText, SwingConstants.CENTER);

		//Create panels
		this.basePanel = new JPanel();
		this.labelPanel = new JPanel();

		//Add components
		basePanel.add(this.labelPanel);
		basePanel.add(this.button);

		labelPanel.add(this.mainLabel);
	}
	
	LabelledButton(String buttonText, String labelText, String altLabelText) {
		//Create components
		this.button = new JButton(buttonText);
		this.mainLabel = new JLabel(labelText, SwingConstants.CENTER);
		this.altLabel = new JLabel(altLabelText, SwingConstants.CENTER);

		//Create panels
		this.basePanel = new JPanel();
		this.labelPanel = new JPanel();

		//Add components
		basePanel.add(this.labelPanel);
		basePanel.add(this.button);

		labelPanel.add(this.mainLabel);
		labelPanel.add(this.altLabel);
	}
}