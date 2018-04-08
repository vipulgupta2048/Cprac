import javax.swing.*;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class discount extends Applet
{
	Panel lodgingPanel;
	RadioButton yes;
	RadioButton no;
	Label lodging;
	static TextField amountOfLodging;

	//constructor
	public void init()
	{
		setLayout(new GridLayout(2,2));
		//create radio buttons
		yes=new RadioButton("Yes");
		no=new RadioButton("No", true);

		//group radio buttons
		ButtonGroup bg = new ButtonGroup();
		bg.add(yes);
		bg.add(no);

		//create components
		lodging = new Label("Enter Lodging Cost: $");
		amountOfLodging = new TextField(5);

		//create Panel
		lodgingPanel=new Panel();

		//add components to panel
		add(yes);
		add(no);
		add(lodging);
		add(amountOfLodging);

		//add listener
		yes.addActionListener(new EnableListener());

		//create border around panel
		//lodgingPanel.setBorder(BorderFactory.createTitledBorder("Lodging"));
	}

	private class EnableListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(no.isSelected())
				amountOfLodging.setEnabled(false);
			else
				amountOfLodging.setEnabled(true);
		}
	}
	public static String getCharges()
	{
		return amountOfLodging.getText();
	}
}
