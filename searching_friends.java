import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
public class searching_friends {
	public searching_friends() {
		JFrame main_Frame = new JFrame();
		main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_Frame.setSize(500, 600);
		
		JLabel l1 = new JLabel("Add Friend");
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel main_Panel = new JPanel();
		main_Panel.setLayout(new BoxLayout(main_Panel, BoxLayout.PAGE_AXIS));
		main_Panel.add(Box.createRigidArea(new Dimension(0, 25)));
		JPanel l2 = new JPanel();// for the text box
		JTextField tf = new JTextField(10);
		JLabel un1 = new JLabel("User Name");
		JButton search = new JButton ("Search");
		l2.add(un1);
		l2.add(tf);
		l2.add(search);
		JLabel l3 = new JLabel ("**User Image**");
		l3.setAlignmentX(Component.CENTER_ALIGNMENT);
		main_Panel.add(l1);
		main_Panel.add(Box.createRigidArea(new Dimension(0,110 )));
		main_Panel.add(l3);
		main_Panel.add(Box.createRigidArea(new Dimension(0,110 )));
		//main_panel.add(Box.createRigidArea(new Dimension(0,25)));
		main_Panel.add(l2);
	    main_Frame.add(main_Panel);
	    main_Frame.setVisible(true);
	}
	public static void main(String args[]) {
		new searching_friends();
		
	}
}
