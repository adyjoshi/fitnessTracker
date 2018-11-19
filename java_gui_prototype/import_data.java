import java.awt.BorderLayout;
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
public class import_data extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					import_data frame = new import_data();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public import_data() {
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
				String [] data = line.split(cvsSplitby);
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{35, 28, 211, 81, 0};
		gbl_contentPane.rowHeights = new int[]{35, 0, 21, 14, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel activityDisplay = new JLabel("ACTIVITY");
		activityDisplay.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_activityDisplay_1 = new GridBagConstraints();
		gbc_activityDisplay_1.fill = GridBagConstraints.VERTICAL;
		gbc_activityDisplay_1.insets = new Insets(0, 0, 5, 5);
		gbc_activityDisplay_1.gridx = 2;
		gbc_activityDisplay_1.gridy = 1;
		contentPane.add(activityDisplay, gbc_activityDisplay_1);
		contentPane.add(activityDisplay, gbc_activityDisplay_1);
		
		JLabel timeHead = new JLabel("Time");
		GridBagConstraints gbc_timeHead = new GridBagConstraints();
		gbc_timeHead.insets = new Insets(0, 0, 5, 5);
		gbc_timeHead.gridx = 2;
		gbc_timeHead.gridy = 3;
		contentPane.add(timeHead, gbc_timeHead);
		
		JLabel timeLabel = new JLabel("Na");
		GridBagConstraints gbc_timeLabel = new GridBagConstraints();
		gbc_timeLabel.insets = new Insets(0, 0, 5, 0);
		gbc_timeLabel.anchor = GridBagConstraints.NORTH;
		gbc_timeLabel.gridx = 3;
		gbc_timeLabel.gridy = 3;
		contentPane.add(timeLabel, gbc_timeLabel);
		
		
		
		JLabel DisHead = new JLabel("Distance Covered");
		GridBagConstraints gbc_DisHead = new GridBagConstraints();
		gbc_DisHead.insets = new Insets(0, 0, 5, 5);
		gbc_DisHead.gridx = 2;
		gbc_DisHead.gridy = 4;
		contentPane.add(DisHead, gbc_DisHead);
		
		JLabel dislabel = new JLabel("Na");
		GridBagConstraints gbc_dislabel = new GridBagConstraints();
		gbc_dislabel.insets = new Insets(0, 0, 5, 0);
		gbc_dislabel.gridx = 3;
		gbc_dislabel.gridy = 4;
		contentPane.add(dislabel, gbc_dislabel);
		
		JLabel altHead = new JLabel("Altitude");
		GridBagConstraints gbc_altHead = new GridBagConstraints();
		gbc_altHead.insets = new Insets(0, 0, 5, 5);
		gbc_altHead.gridx = 2;
		gbc_altHead.gridy = 5;
		contentPane.add(altHead, gbc_altHead);
		
		JLabel altlabel = new JLabel("Na");
		GridBagConstraints gbc_altlabel = new GridBagConstraints();
		gbc_altlabel.insets = new Insets(0, 0, 5, 0);
		gbc_altlabel.gridx = 3;
		gbc_altlabel.gridy = 5;
		contentPane.add(altlabel, gbc_altlabel);
		
		JLabel dateHead = new JLabel("Date");
		GridBagConstraints gbc_dateHead = new GridBagConstraints();
		gbc_dateHead.insets = new Insets(0, 0, 5, 5);
		gbc_dateHead.gridx = 2;
		gbc_dateHead.gridy = 6;
		contentPane.add(dateHead, gbc_dateHead);
		
		JLabel datelabel = new JLabel("Na");
		GridBagConstraints gbc_datelabel = new GridBagConstraints();
		gbc_datelabel.insets = new Insets(0, 0, 5, 0);
		gbc_datelabel.gridx = 3;
		gbc_datelabel.gridy = 6;
		contentPane.add(datelabel, gbc_datelabel);
		JComboBox comboBox_1 = new JComboBox();
		for (int i=1; i<=18;i++) {
			comboBox_1.addItem(i);
		}
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> comboBox = (JComboBox<String>) event.getSource();
		        int selectedBook = (Integer) comboBox.getSelectedItem();
		        System.out.println(selectedBook);
		        datelabel.setText(date[selectedBook-1]);
		        timeLabel.setText(Integer.toString(time[selectedBook-1]));
		        altlabel.setText(Float.toString(altitude[selectedBook-1]));
		        dislabel.setText(Integer.toString(distance[selectedBook-1]));
			}
		});
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.WEST;
		gbc_comboBox_1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 7;
		contentPane.add(comboBox_1, gbc_comboBox_1);
	}

}
