import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainGUI extends JFrame implements ActionListener {
	static final String APP_NAME = "Activity Tracker";
	JPanel cardManager;

	mainGUI(){
		super(APP_NAME);

		panelLogin cardLogin = new panelLogin();
		panelRegister cardRegister = new panelRegister();
		panelForgotPassword cardForgotPassword = new panelForgotPassword();
		cardManager = new JPanel(new CardLayout());

		cardManager.add(cardLogin, "login");
		cardManager.add(cardRegister, "register");
		cardManager.add(cardForgotPassword, "forgotpassword");

		cardLogin.getButtonLogin().addActionListener(this);
		cardLogin.getButtonLogin().setActionCommand("showCardStatistics");
		cardLogin.getButtonRegister().addActionListener(this);
		cardLogin.getButtonRegister().setActionCommand("showCardRegister");
		cardLogin.getButtonForgotPassword().addActionListener(this);
		cardLogin.getButtonForgotPassword().setActionCommand("showCardForgotPassword");
		cardRegister.getButtonBack().addActionListener(this);
		cardRegister.getButtonBack().setActionCommand("showCardLogin");
		cardForgotPassword.getButtonBack().addActionListener(this);
		cardForgotPassword.getButtonBack().setActionCommand("showCardLogin");

		this.getContentPane().add(cardManager);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 650);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("showCardRegister")){
			setSize(450, 650);
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "register");
		}
		if(e.getActionCommand().equals("showCardLogin")){
			setSize(450, 650);
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "login");
		}
		if(e.getActionCommand().equals("showCardForgotPassword")){
			setSize(450, 650);
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "forgotpassword");
		}
		if(e.getActionCommand().equals("showCardStatistics")){
			/*
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "forgotpassword");
			*/
			setSize(800, 800);
		}
	}

	public static void main(String args[]){
		new mainGUI();
	}
}
