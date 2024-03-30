import java.util.Scanner;
//Names:Laura Omidiji.
//Overview:A program  was created for Zeller’s Algorithm, which can be used to determine the day of the week for any date 
//in the past, present, or future with the use of while loop for validation and sentinel value.
//Input:Three numbers each representing the month ,day and year.
//Output: This program outputs the day of the entered date using the Zellar's Algorithm.
//Variables: month, dayOfMonth ,year,Century,YearNumber,G,Count,dayname.

public class Zeller {

	public static void main(String[] args) {
		
				 int Month; 
				 int dayOfMonth;
				 int year; 
				 int CenturyNumber;
				 int YearNumber;
				 int G; 
				 int count = 0;
			        String dayname = null;

			        Scanner scan = new Scanner(System.in);
			        //Display title
			        System.out.println("\tZeller's Algorithm\n");
			        
			        //Ask user for month
			        //Validate the month
			        
			        System.out.print("Enter the month ( or enter 0 to exit the program):\t");
			        Month = scan.nextInt();

			        while(Month > 12){
			            System.out.println("\tPlease enter a valid month!\n");
			            System.out.print("Enter month ( or enter 0 to exit the program):\t");
			            Month = scan.nextInt();
			        }


			        while(Month != 0) {
			        	//Ask user for day
			            System.out.print("Enter day:\t");
			            dayOfMonth = scan.nextInt();


			           //Validate the date
			            while(dayOfMonth > 31){
			                System.out.println("Please enter a valid date!\n");
			                System.out.print("Enter day:\t");
			                dayOfMonth = scan.nextInt();
			            }


			            System.out.print("Enter year:\t");
			            year = scan.nextInt();

			            if(Month == 1 || Month == 2)
			            {
			                Month += 10;
			                year--;
			            }
			            else{
			                Month = Month -2;
			            }
			            
			        		
			            CenturyNumber = year / 100;
			            YearNumber = year % 100;

			            G = (( (int) (2.6*Month-.2) + dayOfMonth + YearNumber + (YearNumber/4) + (CenturyNumber/4) - (2*CenturyNumber)) % 7);

			            if(G < 0){
			                G = G + 7;
			            }

			            switch(G){
			            case 0:
			                dayname = "Sunday";
			                break;
			            case 1:
			                dayname = "Monday";
			                break;
			            case 2:
			                dayname = "Tuesday";
			                break;
			            case 3:
			                dayname = "Wednesday";
			                break;
			            case 4:
			                dayname = "Thursday";
			                break;
			            case 5:
			                dayname = "Friday";
			                break;
			            case 6:
			                dayname = "Saturday";
			                break;
			            default:
			                dayname = "Error day!!";
			            }
				
			            
			            System.out.println("\tThe Day is "+ dayname);
			            System.out.println("******************************");

			            System.out.print("\nEnter month ( or enter 0 to exit):\t");
			            Month = scan.nextInt();

			           
						++count ;
						
			        }
			        
			        System.out.println("");
			        System.out.println("Number of Entries = " + count);

	/*if(count>0)
	{
		System.out.println("Number of Entries:\t" + +count);
	}

	}*/
}
}


















