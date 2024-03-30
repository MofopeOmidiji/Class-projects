import javax.swing.JOptionPane;
/*Name:Mofopefoluwa Omidiji
* Overview:This program demonstrates using dialogs with JOptionPane
* Input: user's first and lastname
* Output:a dialog box showing a message 
* Variables:firstname,lastname .
*/
public class moNameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Name Dialog");
		
		String firstname;
		String lastname;
		
		firstname=JOptionPane.showInputDialog("Enter your first name");
		lastname =JOptionPane.showInputDialog("Enter your last name");
		
		JOptionPane.showMessageDialog(null,"Hello "+ firstname +" " + lastname + " !");
		
		System.exit(0);
	}

}
