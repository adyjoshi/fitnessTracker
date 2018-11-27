import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class mainGUI extends JFrame implements ActionListener {
	static final String APP_NAME = "Activity Tracker";
	JPanel cardManager;
	panelLogin cardLogin = new panelLogin();
	panelRegister cardRegister = new panelRegister();
	panelForgotPassword cardForgotPassword = new panelForgotPassword();

	mainGUI(){
		super(APP_NAME);

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
		
		cardRegister.getButtonRegister().addActionListener(this);
		cardRegister.getButtonRegister().setActionCommand("showCardReg");
		cardRegister.getButtonBack().addActionListener(this);
		cardRegister.getButtonBack().setActionCommand("showCardLogin");
		cardForgotPassword.getButtonBack().addActionListener(this);
		cardForgotPassword.getButtonBack().setActionCommand("showCardLogin");
		this.getContentPane().add(cardManager);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 650);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("showCardRegister")){
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "register");
		}
		if(e.getActionCommand().equals("showCardReg")){
			try {
				saveusername();
				//savepassword();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "login");
		}
		if(e.getActionCommand().equals("showCardLogin")){

			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "login");
		}
		if(e.getActionCommand().equals("showCardForgotPassword")){
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "forgotpassword");
		}
		if(e.getActionCommand().equals("showCardStatistics")){
			/*
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "forgotpassword");
			*/
		}
	}
	public void saveusername() throws IOException {
		FileWriter usernamefile = new FileWriter("C:\\Users\\Dilesh\\Documents\\Assignments$\\FitnessTracker\\src\\database.txt",true);
		String containp = cardRegister.getPass();
		String contain = cardRegister.gettext(); 
		String conpassw = cardRegister.getConpass();
		if (containp.equals(conpassw)) {
		usernamefile.write(System.lineSeparator()+contain+","+containp);}
		else {System.out.println("Different password");}
		System.out.println("*****");
		
		usernamefile.close();
		
	}
//	public void savepassword() throws IOException {
//		FileWriter passwordfile = new FileWriter("C:\\Users\\Dilesh\\Documents\\Assignments$\\FitnessTracker\\src\\password.txt",true);
//		String containp = cardRegister.getpass(); 
//		passwordfile.write(System.lineSeparator()+containp);
//		System.out.println("*****");
//		passwordfile.close();
//		
//	}

	public static void main(String args[]){
		new mainGUI();
	}
}
