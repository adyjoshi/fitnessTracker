import javax.swing.*;
import java.awt.*;

public class adding_friends extends JFrame{
	public  adding_friends() {
		JFrame mainFrame = new JFrame();
		JPanel main_Panel = new JPanel();
		main_Panel.setLayout(new BoxLayout(main_Panel, BoxLayout.PAGE_AXIS));
		mainFrame.add(main_Panel);
		
		//label
		main_Panel.add(Box.createRigidArea(new Dimension(0,150)));
		//JLabel l1 = new JLabel(new ImageIcon("./icon.png"))
		JLabel l1 = new JLabel( "**User's Image**");
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel b1=new JPanel();
		main_Panel.add(l1);
		main_Panel.add(Box.createRigidArea(new Dimension(0,150)));

		JLabel l2 = new JLabel("User Name");
		l2.setAlignmentX(Component.CENTER_ALIGNMENT);
		main_Panel.add(l2);
		//Button
		main_Panel.add(Box.createRigidArea(new Dimension(0,25)));
		JButton add_F = new JButton("Send Request");
		add_F.setAlignmentX(Component.CENTER_ALIGNMENT);
		main_Panel.add(add_F);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500,700);
		mainFrame.setVisible(true);
		
		
	}
	public static void main(String args[]) {
		adding_friends go = new adding_friends();
	}
			
}