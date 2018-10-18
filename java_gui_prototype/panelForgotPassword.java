import javax.swing.*;
import java.awt.*;

public class panelForgotPassword extends JPanel {
	JTextField textfieldUsername;
	JTextField textfieldEmail;
	JButton buttonSubmit;
	JButton buttonBack;
	JLabel labelUsername;
	JLabel labelEmail;
	JLabel labelIcon;

	panelForgotPassword(){
		super();

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		textfieldUsername = new JTextField();
		textfieldEmail = new JTextField();
		buttonSubmit = new JButton("Submit");
		buttonBack = new JButton("Back");
		labelUsername = new JLabel("Username:");
		labelEmail = new JLabel("Email:");
		labelIcon = new JLabel(new ImageIcon("./icon.png"));

		labelIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
		textfieldEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
		textfieldUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonSubmit.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelIcon.setMaximumSize(new Dimension(256, 256));
		textfieldUsername.setMaximumSize(new Dimension(200, 30));
		textfieldEmail.setMaximumSize(new Dimension(200, 30));
		textfieldUsername.setPreferredSize(new Dimension(200, 30));
		textfieldEmail.setPreferredSize(new Dimension(200, 30));

		this.add(Box.createRigidArea(new Dimension(0, 25)));
		this.add(labelIcon);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelEmail);
		this.add(textfieldEmail);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelUsername);
		this.add(textfieldUsername);
		this.add(Box.createRigidArea(new Dimension(0, 50)));
		this.add(buttonSubmit);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(buttonBack);
	}

	JButton getButtonBack(){
		return buttonBack;
	}
}
