import javax.swing.*;
import java.awt.*;

public class activity_view {
      public activity_view(){
		JFrame main_frame = new JFrame();
 		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setSize(500,600);
		JPanel main_panel = new JPanel();
		main_panel.setLayout(new GridLayout(1,3,5,5));
		main_panel.add(Box.createRigidArea(new Dimension(0,25)));
		JPanel act1 = new JPanel();
		JPanel act2 = new JPanel();
		JPanel act3= new JPanel();
		JLabel l1 = new JLabel("Activity1");
		JLabel l2 = new JLabel("Activity2");
		JLabel l3 = new JLabel("Activity3");
		act1.add(l1);
		act1.setBorder(BorderFactory.createLineBorder(Color.black));
		act2.add(l2);
		act2.setBorder(BorderFactory.createLineBorder(Color.black));
		act3.add(l3);
		act3.setBorder(BorderFactory.createLineBorder(Color.black));
		main_panel.add(act1);
		main_panel.add(act2);
		main_panel.add(act3);
		main_frame.add(main_panel);
		main_frame.setVisible(true);
	}

	public static void main(String arg[]){
		new activity_view();		
		}

}
