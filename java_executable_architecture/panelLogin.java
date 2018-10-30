import javax.swing.*;
import java.awt.*;

public class panelLogin extends JPanel {
	JButton buttonForgotPassword;
	JButton buttonLogin;
	JButton buttonLoginGoogle;
	JButton buttonRegister;
	JLabel labelIcon;
	JTextField textfieldUsername;
	JPasswordField passwordfieldPassword;

	panelLogin(){
		super();
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		buttonForgotPassword = new JButton("Forgot Password");
		buttonLogin = new JButton("Login");
		buttonLoginGoogle = new JButton("Login with Google+");
		buttonRegister = new JButton("Register");
		labelIcon = new JLabel(new ImageIcon("./icon.png"));
		textfieldUsername = new JTextField("Username");
		passwordfieldPassword = new JPasswordField("Password");

		buttonForgotPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonLoginGoogle.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		textfieldUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordfieldPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelIcon.setMaximumSize(new Dimension(256, 256));
		textfieldUsername.setMaximumSize(new Dimension(200, 30));
		passwordfieldPassword.setMaximumSize(new Dimension(200, 30));
		labelIcon.setPreferredSize(new Dimension(256, 256));
		textfieldUsername.setPreferredSize(new Dimension(200, 30));
		passwordfieldPassword.setPreferredSize(new Dimension(200, 30));

		this.add(Box.createRigidArea(new Dimension(0, 25)));
		this.add(labelIcon);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(textfieldUsername);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(passwordfieldPassword);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(buttonLogin);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(buttonLoginGoogle);
		this.add(Box.createRigidArea(new Dimension(0, 50)));
		this.add(buttonRegister);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(buttonForgotPassword);

	}

	JButton getButtonRegister(){
		return buttonRegister;
	}
	JButton getButtonForgotPassword(){
		return buttonForgotPassword;
	}
	JButton getButtonLogin(){
		return buttonLogin;
	}
}
