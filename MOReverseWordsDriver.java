import java.util.Scanner;
/*
 * Name: Laura Omidiji
 * Overview:This program displays the reverse of user input.
 * Input: words from the user
 * Output:REverse of the words
 * Variables:word,reverse
 */
public class MOReverseWordsDriver {
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in); 
	System.out.print("Enter a word to reverse : "); 
	String word = scan.nextLine(); 

	//print the word
	System.out.println("Original word : "+word);
	//call function to reverse and print

	System.out.println("Reversed word : "+ reverse(word));
	
	}

}
