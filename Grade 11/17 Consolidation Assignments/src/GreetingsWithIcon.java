/* Omar Anwar
 * GreetingsWithIcon assignment
 * 5/28/21
 * This program displays a greeting message to the user using JOptionPane, with a icon
 */

//importing the java utilities for message box and icon
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//public class
public class GreetingsWithIcon {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the icon
		ImageIcon icon = new ImageIcon("hearts.png"); // load the image to a imageIcon
		
		Image image = icon.getImage(); // transform it 
		
		Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		
		icon = new ImageIcon(newimg);//return it to the original image
		
		//outputting the message box with icon
		JOptionPane.showMessageDialog(null, "The Phantom Theives of Hearts", "Steal Your Heart!", JOptionPane.PLAIN_MESSAGE, icon);
		
	}

}
