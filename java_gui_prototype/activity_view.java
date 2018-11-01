import javax.swing.*;
import java.awt.*;

public class activity_view extends JFrame {
      public activity_view(){
    	  JFrame frame = new JFrame("Fitness Tracker");
    	  JLabel top = new JLabel("Activities Views");
    	  
    	 
    	  top.setAlignmentX(Component.CENTER_ALIGNMENT);
    	  frame.add(top,BorderLayout.NORTH);
    	  JPanel left_panel = new JPanel();
    	  left_panel.setLayout(new GridLayout(5,1,5,10));
    	  JLabel l1=new JLabel("User Name");
    	  JButton b1 = new JButton("Act1");
    	  JButton b2 = new JButton("Act2");
    	  JButton b3 = new JButton("Act3");
    	  JButton b4 = new JButton("Act4");
    	  left_panel.add(l1);
    	  left_panel.add(b1);
    	  left_panel.add(b2);
    	  left_panel.add(b3);
    	  left_panel.add(b4);
    	  //midddle panel label
    	  JPanel middle = new JPanel();
    	  // activity level
    	  String title;
    	  title="";
    	  JLabel actTitle= new JLabel();
    	  actTitle.setText(title);
    	  JLabel heart = new JLabel("Heart rate:");
    	  JLabel dis = new JLabel("Distance travelled:");
    	  JLabel time = new JLabel("Time taken:");
    	  JLabel calorie = new JLabel("Calorie burnt");
    	  JTextField t1 = new JTextField(20);
    	  JTextField t2 = new JTextField(20);
    	  JTextField t3 = new JTextField(20);
    	  JTextField t4 = new JTextField(20);
    	  t1.setEditable(false);
    	  t2.setEditable(false);
    	  t3.setEditable(false);
    	  t4.setEditable(false);
    	  //Gridbaglayout
    	  middle.setLayout(new GridBagLayout());
    	  middle.setBorder(BorderFactory.createLineBorder(Color.black));
    	  GridBagConstraints c = new GridBagConstraints();
    	  
    	  c.weightx=0;
    	  c.weighty=0.001;    	  
    	  
    	  c.gridx=0;
    	  c.gridy=0;
    	  middle.add(actTitle,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 0;
    	  c.gridy=1;
    	  c.gridwidth=2;
    	   middle.add(heart,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 2;
    	  c.gridy=1;
    	  c.gridwidth=2;
    	  
    	  middle.add(t1,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 0;
    	  c.gridy=3;
    	  
    	  middle.add(dis,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 2;
    	  c.gridy=3;
    
    	  middle.add(t2,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 0;
    	  c.gridy=4;
    	  middle.add(time,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 2;
    	  c.gridy=4;
    	  middle.add(t3,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 0;
    	  c.gridy=5;
    	  middle.add(calorie,c);
    	  
    	  c.fill = GridBagConstraints.HORIZONTAL;
    	  c.gridx = 2;
    	  c.gridy=5;
    	  middle.add(t4,c);
    	  
    	  frame.add(middle,BorderLayout.CENTER);
    	  frame.add(left_panel, BorderLayout.WEST);
    	  frame.setVisible(true);
    	  frame.setSize(600, 500);
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  
    	  
	}

	public static void main(String arg[]){
		new activity_view();		
		}

}
