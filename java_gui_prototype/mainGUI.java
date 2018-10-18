import javax.swing.*;

public class mainGUI extends JFrame {
	static final String APP_NAME = "Activity Tracker";
	mainGUI(){
		super(APP_NAME);

		this.getContentPane().add(new panelRegister());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 600);
		setVisible(true);
	}

	public static void main(String args[]){
		new mainGUI();
	}
}
