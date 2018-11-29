import javax.swing.*;
import java.io.*;
import java.awt.*;

public class panelRegister extends JPanel {
	JTextField textfieldUsername;
	JTextField textfieldEmail;
	JPasswordField passwordfieldPassword;
	JPasswordField passwordfieldPasswordConfirm;
	JButton buttonRegister;
	JButton buttonBack;
	JLabel labelUsername;
	JLabel labelEmail;
	JLabel labelPassword;
	JLabel labelPasswordConfirm;
	JLabel labelIcon;

	panelRegister(){
		super();
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		textfieldUsername = new JTextField();
		textfieldEmail = new JTextField();
		passwordfieldPassword = new JPasswordField();
		passwordfieldPasswordConfirm = new JPasswordField();
		buttonRegister = new JButton("Register");
		buttonBack = new JButton("Back");
		labelUsername = new JLabel("Username:");
		labelEmail = new JLabel("Email:");
		labelPassword = new JLabel("Password:");
		labelPasswordConfirm = new JLabel("Confirm Password:");
		labelIcon = new JLabel(new ImageIcon("./icon.png"));

		labelIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
		textfieldEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
		textfieldUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordfieldPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelPasswordConfirm.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordfieldPasswordConfirm.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelIcon.setMaximumSize(new Dimension(256, 256));
		passwordfieldPassword.setMaximumSize(new Dimension(200, 30));
		passwordfieldPasswordConfirm.setMaximumSize(new Dimension(200, 30));
		textfieldUsername.setMaximumSize(new Dimension(200, 30));
		textfieldEmail.setMaximumSize(new Dimension(200, 30));
		passwordfieldPassword.setPreferredSize(new Dimension(200, 30));
		passwordfieldPasswordConfirm.setPreferredSize(new Dimension(200, 30));
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
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelPassword);
		this.add(passwordfieldPassword);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(labelPasswordConfirm);
		this.add(passwordfieldPasswordConfirm);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(buttonRegister);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(buttonBack);
	}

	JButton getButtonBack(){
		return buttonBack;
	}

	JButton getButtonRegister(){
		return buttonRegister;
	}

	boolean validateInfo(){
		if(textfieldUsername.getText().length() < 3){
			JOptionPane.showMessageDialog(null, "username is too short");
			return false;
		}
		if(textfieldEmail.getText().length() < 3){
			JOptionPane.showMessageDialog(null, "email is too short");
			return false;
		}
		if(passwordfieldPassword.getText().length() < 3){
			JOptionPane.showMessageDialog(null, "password is too short");
			return false;
		}

		if(passwordfieldPassword.getText().equals(passwordfieldPasswordConfirm.getText()) != true){
			JOptionPane.showMessageDialog(null, "passwords entered do not match");
			return false;
		}

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("users.dat"));
			String line = null;
			while((line = br.readLine()) != null){
				if(line.startsWith(textfieldUsername.getText())){ //TODO: implement better unique username validation
					JOptionPane.showMessageDialog(null, "username is unavailable");
					br.close();
					return false;
				}
			}
			br.close();
		}
		catch (FileNotFoundException fe){
			JOptionPane.showMessageDialog(null, "users.dat not found, a new users.dat will be created for this session");
		}
		catch (IOException e){
			e.printStackTrace();
		}

		return true;
	}
	boolean registerInfo(){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("users.dat", true));
			String line = textfieldUsername.getText() + "," + passwordfieldPassword.getText() + "," + textfieldEmail.getText();
			bw.write(line, 0, line.length());
			bw.newLine();
			bw.close();
			return true;
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return false;
	}
}
