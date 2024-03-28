import java.util.Scanner;
/*Name:Mofopefoluwa Omidiji
* Overview:This program asists a technician in the process of checking a substance's temperature.
* Input: various temperature readings
* Output:feedback on thecsubstance if it is too hot or it is ok
* Variables:temperature,MAX_TEMP .
*/
public class moCheckTemprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		final double MAX_TEMP = 102.5;
		double temperature;
		
		System.out.print("Enter the substance's Celsius temperature: ");
	    temperature = input.nextDouble();
	    
	    while (temperature > MAX_TEMP)
	    {
	         System.out.println("The temperature is too high. Turn the thermostat down and wait 5 minutes.");
	         System.out.println("Then, take the Celsius temperature again and enter it here: ");
	         temperature = input.nextDouble();
	        }
	    System.out.println("The temperature is ok, check the temperatue again in 15 minutes.");
	}

}
