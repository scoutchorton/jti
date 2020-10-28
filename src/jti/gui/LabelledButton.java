package jti.gui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Component;

public class LabelledButton extends JPanel {
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
	BoxLayout vBox;
	
	/*
	 * Constructors
	 */
	public LabelledButton(String buttonText, String labelText, String altLabelText) {
		//Add buttonText and labelText
		this(buttonText, labelText);

		//Create components
		this.altLabel = new JLabel(altLabelText, SwingConstants.CENTER);

		//Add components
		this.labelPanel.add(this.altLabel);
		this.altLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	}

	public LabelledButton(String buttonText, String labelText) {
		//Add labelText
		this(buttonText);

		//Create components
		this.mainLabel = new JLabel(labelText, SwingConstants.CENTER);

		//Add components
		this.labelPanel.add(this.mainLabel);
		this.mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	}

	public LabelledButton(String buttonText) {
		//Create components
		this.button = new JButton(buttonText);

		//Create panels
		this.basePanel = new JPanel();
		this.basePanel.setLayout(new BoxLayout(this.basePanel, BoxLayout.Y_AXIS));
		this.labelPanel = new JPanel();

		//Add components
		this.basePanel.add(this.labelPanel);
		this.labelPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

		this.basePanel.add(this.button);
		this.button.setAlignmentX(Component.CENTER_ALIGNMENT);

		this.add(basePanel);
	}
}