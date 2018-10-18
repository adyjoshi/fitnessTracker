import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import java.awt.Panel;
import java.awt.Color;

public class Importdata {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Importdata window = new Importdata();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Importdata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("Devices Connected");
		internalFrame.setBounds(10, 11, 194, 239);
		frame.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAddNewDevice = new JButton("Add New Device");
		btnAddNewDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInputDialog("Device is Selected");
			}
		});
		internalFrame.getContentPane().add(btnAddNewDevice);
		
		JButton btnRemoveDevice = new JButton("Remove Device");
		internalFrame.getContentPane().add(btnRemoveDevice);
		internalFrame.setVisible(true);
	}
}
