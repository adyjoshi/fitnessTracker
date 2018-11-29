import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Color;
public class importdata extends JPanel {
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public importdata() {
		String location = "C:\\Users\\Dilesh\\Documents\\Assignments$\\FitnessTracker\\java_gui_prototype\\Input Format.csv";
		//String location = "./Input Format.csv";
		String line = "";
		int[] time, distance;
		float [] altitude;
		altitude =new float[18];
		time = new int [18];
		distance = new int[18];
		
		String [] date;
		date = new String[18];
		String cvsSplitby = ",";{
		int i = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(location))){
			while ((line = br.readLine())!= null) {
				String [] data = line.split(",");
				time [i] = Integer.parseInt(data[0]);
				distance[i] = Integer.parseInt(data[1]);
				altitude[i]= Float.parseFloat(data[2]);
				date [i] = data[3];
				System.out.println("time= "+ time[i]+"\t distance= "+ distance[i]+"\t altitude= "+altitude[i] + "\t date= "+date[i]);
				i = i +1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		setLayout(new MigLayout("", "[81px][81][81][81][81px][164px]", "[21][21][21][21][21px][135px]"));
		JLabel activityDisplay = new JLabel("ACTIVITY");
		activityDisplay.setFont(new Font("Tahoma", Font.BOLD, 17));
		//this.add(activityDisplay, gbc_activityDisplay_1);
		this.add(activityDisplay, "cell 2 0,alignx center,aligny center");
		
	
		
		
//		
//		GridBagLayout gbl_this = new GridBagLayout();
//		gbl_this.columnWidths = new int[]{35, 28, 211, 81, 0};
//		gbl_this.rowHeights = new int[]{35, 0, 21, 14, 0, 0, 0, 0, 0};
//		gbl_this.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_this.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		this.setLayout(gbl_this);
		JComboBox comboBox_1 = new JComboBox();
		
		JPanel main_container = new JPanel();
		add(main_container, "cell 0 1 6 5,grow");
		main_container.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][]", "[][][][][][]"));
		
		JLabel timeHead = new JLabel("Time");
		main_container.add(timeHead, "cell 0 0");
		
		Component rigidArea1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea1.setBackground(Color.LIGHT_GRAY);
		rigidArea1.setForeground(Color.LIGHT_GRAY);
		main_container.add(rigidArea1, "cell 1 0 1 5");
		
		JLabel timeLabel = new JLabel("Na");
		main_container.add(timeLabel, "cell 2 0");
		
		Component rigidArea2 = Box.createRigidArea(new Dimension(20, 20));
		main_container.add(rigidArea2, "cell 3 0 1 5");
		
		JLabel lbltime1 = new JLabel("Na");
		main_container.add(lbltime1, "cell 4 0");
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		main_container.add(rigidArea, "cell 5 0 1 4");
		
		JLabel lbltime2 = new JLabel("na");
		main_container.add(lbltime2, "cell 6 0");
		
		JLabel lbltime3 = new JLabel("na");
		main_container.add(lbltime3, "cell 8 0");
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		main_container.add(rigidArea_2, "cell 9 0 1 4");
		
		JLabel lbltime4 = new JLabel("na");
		main_container.add(lbltime4, "cell 10 0");
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		main_container.add(rigidArea_3, "cell 11 0 1 4");
		
		JLabel lbltime5 = new JLabel("na");
		main_container.add(lbltime5, "cell 12 0");
		
		
		
		JLabel DisHead = new JLabel("Distance Covered");
		main_container.add(DisHead, "cell 0 1");
		
		JLabel lbldis1 = new JLabel("na");
		main_container.add(lbldis1, "cell 4 1");
		
		JLabel lbldis2 = new JLabel("na");
		main_container.add(lbldis2, "cell 6 1");
		
		JLabel lbldis3 = new JLabel("na");
		main_container.add(lbldis3, "cell 8 1");
		
		JLabel lbldis4 = new JLabel("na");
		main_container.add(lbldis4, "cell 10 1,alignx left");
		
		JLabel lbldis5 = new JLabel("na");
		main_container.add(lbldis5, "cell 12 1");
		
		JLabel altHead = new JLabel("Altitude");
		main_container.add(altHead, "cell 0 2");
		
		JLabel dislabel = new JLabel("Na");
		main_container.add(dislabel, "cell 2 1");
		
		JLabel lblalt1 = new JLabel("na");
		main_container.add(lblalt1, "cell 4 2");
		
		JLabel lblalt2 = new JLabel("na");
		main_container.add(lblalt2, "cell 6 2");
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		main_container.add(rigidArea_1, "cell 7 0 1 4");
		
		JLabel lblalt3 = new JLabel("na");
		main_container.add(lblalt3, "cell 8 2");
		
		JLabel lblalt4 = new JLabel("na");
		main_container.add(lblalt4, "cell 10 2");
		
		JLabel lblalt5 = new JLabel("na");
		main_container.add(lblalt5, "cell 12 2");
		
		JLabel dateHead = new JLabel("Date");
		main_container.add(dateHead, "cell 0 3");
		
		JLabel altlabel = new JLabel("Na");
		main_container.add(altlabel, "cell 2 2");
		
		JLabel lblSelectRun = new JLabel("Select Run:");
		main_container.add(lblSelectRun, "cell 0 4,alignx leading,aligny center");
		
		JLabel datelabel = new JLabel("Na");
		main_container.add(datelabel, "cell 2 3");
		
		main_container.add(comboBox_1, "cell 2 4");
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> comboBox = (JComboBox<String>) event.getSource();
		        int selectedBook = (Integer) comboBox.getSelectedItem();
		        System.out.println(selectedBook);
		        if (selectedBook==1) {
		        
		        datelabel.setText(date[0]);
		        timeLabel.setText(Integer.toString(time[0]));
		        altlabel.setText(Float.toString(altitude[0]));
		        dislabel.setText(Integer.toString(distance[0]));
		        
		        lbltime1.setText(Integer.toString(time[1]));
		        lbldis1.setText(Integer.toString(distance[1]));
		        lblalt1.setText(Float.toString(altitude[1]));
		        //lbldate1.setText(date[1]);
		        
		        lbltime2.setText(Integer.toString(time[2]));
		        lbldis2.setText(Integer.toString(distance[2]));
		        lblalt2.setText(Float.toString(altitude[2]));
		        //lbldate2.setText(date[2]);
		        
		        lbltime3.setText(Integer.toString(time[3]));
		        lbldis3.setText(Integer.toString(distance[3]));
		        lblalt3.setText(Float.toString(altitude[3]));
		        //lbldate3.setText(date[3]);
		        
		        lbltime4.setText(Integer.toString(time[4]));
		        lbldis4.setText(Integer.toString(distance[4]));
		        lblalt4.setText(Float.toString(altitude[4]));
		       // lbldate4.setText(date[4]);
		        
		        lbltime5.setText(Integer.toString(time[5]));
		        lbldis5.setText(Integer.toString(distance[5]));
		        lblalt5.setText(Float.toString(altitude[5]));
		       // lbldate5.setText(date[5]);
		       }
		        else if(selectedBook==2) 
		        {	
		        	System.out.println("**2**");
		        	datelabel.setText(date[6]);
			        timeLabel.setText(Integer.toString(time[6]));
			        altlabel.setText(Float.toString(altitude[6]));
			        dislabel.setText(Integer.toString(distance[6]));
			        
			        lbltime1.setText(Integer.toString(time[7]));
			        lbldis1.setText(Integer.toString(distance[7]));
			        lblalt1.setText(Float.toString(altitude[7]));
			       // lbldate1.setText(date[7]);
			        
			        lbltime2.setText(Integer.toString(time[8]));
			        lbldis2.setText(Integer.toString(distance[8]));
			        lblalt2.setText(Float.toString(altitude[8]));
			        //lbldate2.setText(date[8]);
			        
			        lbltime3.setText(Integer.toString(time[9]));
			        lbldis3.setText(Integer.toString(distance[9]));
			        lblalt3.setText(Float.toString(altitude[9]));
			       // lbldate3.setText(date[9]);
			        
			        lbltime4.setText(Integer.toString(time[10]));
			        lbldis4.setText(Integer.toString(distance[10]));
			        lblalt4.setText(Float.toString(altitude[10]));
			       // lbldate4.setText(date[10]);
			        
			        lbltime5.setText(Integer.toString(time[11]));
			        lbldis5.setText(Integer.toString(distance[11]));
			        lblalt5.setText(Float.toString(altitude[11]));
			       // lbldate5.setText(date[11]);
			       }
		        else 
		        {
		        	System.out.println("**3**");
		        	datelabel.setText(date[12]);
			        timeLabel.setText(Integer.toString(time[12]));
			        altlabel.setText(Float.toString(altitude[12]));
			        dislabel.setText(Integer.toString(distance[12]));
			        
			        lbltime1.setText(Integer.toString(time[13]));
			        lbldis1.setText(Integer.toString(distance[13]));
			        lblalt1.setText(Float.toString(altitude[13]));
			        //lbldate1.setText(date[13]);
			        
			        lbltime2.setText(Integer.toString(time[14]));
			        lbldis2.setText(Integer.toString(distance[14]));
			        lblalt2.setText(Float.toString(altitude[14]));
			       // lbldate2.setText(date[14]);
			        
			        lbltime3.setText(Integer.toString(time[15]));
			        lbldis3.setText(Integer.toString(distance[15]));
			        lblalt3.setText(Float.toString(altitude[15]));
			      //  lbldate3.setText(date[15]);
			        
			        lbltime4.setText(Integer.toString(time[16]));
			        lbldis4.setText(Integer.toString(distance[16]));
			        lblalt4.setText(Float.toString(altitude[16]));
			       // lbldate4.setText(date[16]);
			        
			        lbltime5.setText(Integer.toString(time[17]));
			        lbldis5.setText(Integer.toString(distance[17]));
			        lblalt5.setText(Float.toString(altitude[17]));
			       // lbldate5.setText(date[17]);
			           }
			}
		});
		for (int i=1; i<=3;i++) {
			comboBox_1.addItem(i);
		}
		GridBagConstraints gbc_timeHead = new GridBagConstraints();
		gbc_timeHead.insets = new Insets(0, 0, 5, 5);
		gbc_timeHead.gridx = 2;
		gbc_timeHead.gridy = 3;
		GridBagConstraints gbc_timeLabel = new GridBagConstraints();
		gbc_timeLabel.insets = new Insets(0, 0, 5, 0);
		gbc_timeLabel.anchor = GridBagConstraints.NORTH;
		gbc_timeLabel.gridx = 3;
		gbc_timeLabel.gridy = 3;
		GridBagConstraints gbc_DisHead = new GridBagConstraints();
		gbc_DisHead.insets = new Insets(0, 0, 5, 5);
		gbc_DisHead.gridx = 2;
		gbc_DisHead.gridy = 4;
		GridBagConstraints gbc_dislabel = new GridBagConstraints();
		gbc_dislabel.insets = new Insets(0, 0, 5, 0);
		gbc_dislabel.gridx = 3;
		gbc_dislabel.gridy = 4;
		GridBagConstraints gbc_altHead = new GridBagConstraints();
		gbc_altHead.insets = new Insets(0, 0, 5, 5);
		gbc_altHead.gridx = 2;
		gbc_altHead.gridy = 5;
		GridBagConstraints gbc_altlabel = new GridBagConstraints();
		gbc_altlabel.insets = new Insets(0, 0, 5, 0);
		gbc_altlabel.gridx = 3;
		gbc_altlabel.gridy = 5;
		GridBagConstraints gbc_dateHead = new GridBagConstraints();
		gbc_dateHead.insets = new Insets(0, 0, 5, 5);
		gbc_dateHead.gridx = 2;
		gbc_dateHead.gridy = 6;
		GridBagConstraints gbc_datelabel = new GridBagConstraints();
		gbc_datelabel.insets = new Insets(0, 0, 5, 0);
		gbc_datelabel.gridx = 3;
		gbc_datelabel.gridy = 6;
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.WEST;
		gbc_comboBox_1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 7;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//importdata r1 = new importdata();
		
	}

}
