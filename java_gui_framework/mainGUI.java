import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class mainGUI extends JFrame implements ActionListener {
	static final String APP_NAME = "Activity Tracker";
	JPanel cardManager;
	JFrame frame = new JFrame();
	importdata cardLogin1 = new importdata();
	panelLogin cardLogin = new panelLogin();
	panelRegister cardRegister = new panelRegister();
	panelForgotPassword cardForgotPassword = new panelForgotPassword();
	String [] name = new String[100];
	String [] password = new String [100];
	String location = "C:\\Users\\Dilesh\\Documents\\Assignments$\\FitnessTracker\\src\\database.txt";
	mainGUI(){
		super(APP_NAME);

	    
		
		cardManager = new JPanel(new CardLayout());
		cardManager.add(cardLogin, "login");
		cardManager.add(cardRegister, "register");
		cardManager.add(cardForgotPassword, "forgotpassword");
		cardManager.add(cardLogin1,"login1");
		
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
		boolean exist;
		File tryfile = new File(location);
		exist = tryfile.exists();
		if(exist)	{loadfile();}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750,650);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("showCardRegister")){
			
			CardLayout cards = (CardLayout)(cardManager.getLayout());
			cards.show(cardManager, "register");
		}
		if(e.getActionCommand().equals("showCardReg")){
			try {
				if (saveusername()) {
				loadfile();
				CardLayout cards = (CardLayout)(cardManager.getLayout());
				cards.show(cardManager, "login");}
				else {System.out.println(); }
				//savepassword();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
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
			int indexpass=43, indexuser=66;
			boolean ispass=false, isuser=false, isindex=false;
			int i =0;
			while (name[i]!=(null)) {
				if (name[i].equals(cardLogin.getfielduser())){isuser=true; indexuser=i;}
				if (password[i].equals(cardLogin.getpassword())) {ispass=true;indexpass=i;}
				i=i+1;
			}
			if (indexpass==indexuser) {isindex = true;}
			if (isuser && ispass && isindex) {
				CardLayout cards = (CardLayout)(cardManager.getLayout());
				cards.show(cardManager, "login1");
				}
			else {
				//pop up message
				frame.setSize(50,50);
				
				JOptionPane.showMessageDialog(frame,
                        "Wrong password or user name",
                        "Error Message",
                        JOptionPane.INFORMATION_MESSAGE);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				System.out.println("wrong username or password");
			}
			/* CardLayout cards = (CardLayout)(cardManager.getLayout());	
				cards.show(cardManager, "forgotpassword");*/
			

		}
	}
	public  boolean saveusername() throws IOException {
		FileWriter usernamefile = new FileWriter("C:\\Users\\Dilesh\\Documents\\Assignments$\\FitnessTracker\\src\\database.txt",true);
		String containp = cardRegister.getPass();
		String contain = cardRegister.gettext(); 
		String conpassw = cardRegister.getConpass();
		if (!containp.equals("") && !conpassw.equals("")) {
		if (containp.equals(conpassw)) {
		usernamefile.write(System.lineSeparator()+contain+","+containp);
		System.out.println("*****");
		usernamefile.close();
		return true;}
		else {System.out.println("Different password"); 
		JOptionPane.showMessageDialog(frame,
                "Password Does not match",
                "Error Message",
                JOptionPane.INFORMATION_MESSAGE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		usernamefile.close();
		return false;}}
		else {return false;
		}
	}
	public void loadfile() {
		//importing the user name and password
		
				String line="";
				int i =0;
				
				try (BufferedReader br = new BufferedReader(new FileReader(location))){
					while ((line = br.readLine())!= null) {
						String [] data = line.split(",");
						name[i] = data[0];
						password[i] = data[1];
						System.out.println("username: "+name[i] +"\t password: "+password[i]);
						i = i +1;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

	{//	public void savepassword() throws IOException {
//		FileWriter passwordfile = new FileWriter("C:\\Users\\Dilesh\\Documents\\Assignments$\\FitnessTracker\\src\\password.txt",true);
//		String containp = cardRegister.getpass(); 
//		passwordfile.write(System.lineSeparator()+containp);
//		System.out.println("*****");
//		passwordfile.close();
//		
//	}
	}
	public static void main(String args[]){
		new mainGUI();
	}
}
