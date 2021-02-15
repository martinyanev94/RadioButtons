package JRadioButtonPack;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonCass {
	private static final String numberOfItems[] = {"2 Items", "4 Items", "6 Items", "8 Items"};
	private static final String foodType[] = {"Hamburger", "Cheesburger", "Hot Dog", "French Fries"};

	public static void main(String[] args) {
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Items Grouping");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container itemContainer = RadioUnitsClass.createRadioButtonGrouping(numberOfItems, "Items Count");
				Container foodContainer = RadioUnitsClass.createRadioButtonGrouping(foodType, "Food Type");
				frame.add(itemContainer, BorderLayout.WEST);
				frame.add(foodContainer, BorderLayout.EAST);
				frame.setSize(300, 200);
				frame.setVisible(true);
			}
		};
		EventQueue.invokeLater(runner);

	}

}
