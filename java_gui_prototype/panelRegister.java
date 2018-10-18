import javax.swing.*;
import java.awt.*;

public class panelRegister extends JPanel {
	JTextField textfieldUsername;
	JTextField textfieldEmail;
	JPasswordField passwordfieldPassword;
	JPasswordField passwordfieldPasswordConfirm;
	JButton buttonRegister;
	JLabel labelUsername;
	JLabel labelEmail;
	JLabel labelPassword;
	JLabel labelPasswordConfirm;

	panelRegister(){
		super();

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		textfieldUsername = new JTextField();
		textfieldEmail = new JTextField();
		passwordfieldPassword = new JPasswordField();
		passwordfieldPasswordConfirm = new JPasswordField();
		buttonRegister = new JButton("Register");
		labelUsername = new JLabel("Username:");
		labelEmail = new JLabel("Email:");
		labelPassword = new JLabel("Password:");
		labelPasswordConfirm = new JLabel("Confirm Password:");

		passwordfieldPassword.setMaximumSize(new Dimension(200, 30));
		passwordfieldPasswordConfirm.setMaximumSize(new Dimension(200, 30));
		textfieldUsername.setMaximumSize(new Dimension(200, 30));
		textfieldEmail.setMaximumSize(new Dimension(200, 30));
		passwordfieldPassword.setPreferredSize(new Dimension(200, 30));
		passwordfieldPasswordConfirm.setPreferredSize(new Dimension(200, 30));
		textfieldUsername.setPreferredSize(new Dimension(200, 30));
		textfieldEmail.setPreferredSize(new Dimension(200, 30));

		this.add(labelEmail);
		this.add(textfieldEmail);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelUsername);
		this.add(textfieldUsername);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelPassword);
		this.add(passwordfieldPassword);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelPasswordConfirm);
		this.add(passwordfieldPasswordConfirm);
		this.add(Box.createRigidArea(new Dimension(0, 50)));
		this.add(buttonRegister);
	}
}
