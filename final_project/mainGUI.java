import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class mainGUI extends JFrame implements ActionListener {
	static final String APP_NAME = "Activity Tracker";
	JPanel cardManager;
	Account account;
	panelLogin cardLogin;
	panelRegister cardRegister;
	panelForgotPassword cardForgotPassword;
	panelHomeFirstRun cardHomeFirstRun;

	mainGUI(){
		super(APP_NAME);

		cardLogin = new panelLogin();
		cardRegister = new panelRegister();
		cardForgotPassword = new panelForgotPassword();
		cardHomeFirstRun = new panelHomeFirstRun();
		cardManager = new JPanel(new CardLayout());
		account = new Account();

		cardManager.add(cardLogin, "login");
		cardManager.add(cardRegister, "register");
		cardManager.add(cardForgotPassword, "forgotpassword");
		cardManager.add(cardHomeFirstRun, "homefirstrun");

		cardLogin.getButtonLogin().addActionListener(this);
		cardLogin.getButtonLogin().setActionCommand("login");
		cardLogin.getButtonRegister().addActionListener(this);
		cardLogin.getButtonRegister().setActionCommand("showCardRegister");
		cardLogin.getButtonForgotPassword().addActionListener(this);
		cardLogin.getButtonForgotPassword().setActionCommand("showCardForgotPassword");
		cardRegister.getButtonBack().addActionListener(this);
		cardRegister.getButtonBack().setActionCommand("showCardLogin");
		cardRegister.getButtonRegister().addActionListener(this);
		cardRegister.getButtonRegister().setActionCommand("register");
		cardForgotPassword.getButtonBack().addActionListener(this);
		cardForgotPassword.getButtonBack().setActionCommand("showCardLogin");

		this.getContentPane().add(cardManager);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 650);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("showCardRegister")){
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "register");
		}
		if(e.getActionCommand().equals("showCardLogin")){
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "login");
		}
		if(e.getActionCommand().equals("showCardForgotPassword")){
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "forgotpassword");
		}
		if(e.getActionCommand().equals("login")){
			/*
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "forgotpassword");
			*/
			if(cardLogin.validateInfo()){
				if(cardLogin.login()){
					account.setUsername(cardLogin.getTextfieldUsername().getText());
					cardHomeFirstRun.getLabelUsername().setText(account.getUsername());
					CardLayout cards = (CardLayout)(cardManager.getLayout());
					cards.show(cardManager, "homefirstrun");
					setSize(800, 800);
				}
			}
		}
		if(e.getActionCommand().equals("register")){
			if(cardRegister.validateInfo()){
				if(cardRegister.registerInfo()){
					JOptionPane.showMessageDialog(null, "account registered");
					CardLayout cards = (CardLayout)(cardManager.getLayout());
					cards.show(cardManager, "login");
				}
			}
		}
	}

	public static void main(String args[]){
		new mainGUI();
	}
}
