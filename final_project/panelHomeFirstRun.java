import javax.swing.*;
import java.awt.*;

public class panelHomeFirstRun extends JPanel {
	JButton buttonImport;
	JButton buttonNew;
	JLabel labelHomeMessage;
	JLabel labelUsername;
	JPanel panelContent;
	JPanel panelTop;

	panelHomeFirstRun(){
		super();

		setLayout(new BorderLayout());
		buttonImport = new JButton("Import from device");
		buttonNew = new JButton("New activity");
		labelHomeMessage = new JLabel("Create new activity or import existing activities to get started");
		labelUsername = new JLabel("username");
		panelContent = new JPanel();
		panelTop = new JPanel(new FlowLayout(FlowLayout.LEFT));

		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.PAGE_AXIS));
		panelTop.setBackground(Color.LIGHT_GRAY);
		labelHomeMessage.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelUsername.setFont(new Font("Serif", Font.BOLD, 100));
		buttonImport.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonNew.setAlignmentX(Component.CENTER_ALIGNMENT);

		this.add(panelContent, BorderLayout.CENTER);
		this.add(panelTop, BorderLayout.PAGE_START);
		panelContent.add(Box.createRigidArea(new Dimension(0, 25)));
		panelContent.add(labelHomeMessage);
		panelContent.add(Box.createRigidArea(new Dimension(0, 10)));
		panelContent.add(buttonImport);
		panelContent.add(Box.createRigidArea(new Dimension(0, 10)));
		panelContent.add(buttonNew);
		panelTop.add(labelUsername);
	}

	JButton getButtonNew(){
		return buttonNew;
	}

	JButton getButtonImport(){
		return buttonImport;
	}

	JLabel getLabelUsername(){
		return labelUsername;
	}
}
