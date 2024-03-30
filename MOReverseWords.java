
	import java.io.*;
	import java.util.*;
	public class MOReverseWords
	{
	//method for reversing the word
	//takes string as string parameter
	public static String reverse(String str)
	{
	
	// char array of length string to store reverse string
	char[] reverse = new char[str.length()];

	// stack 
	Stack<Character> stack = new Stack<Character>();

	// Traverse the String and push into the Stack
	for (int i = 0; i < str.length(); i++) 
	{
	stack.push(str.charAt(i));
	}

	// Now, pop all element from the stack one by one
	// and add to reverse variable
	int i = 0;
	while (!stack.isEmpty()) 
	{
	reverse[i++] = stack.pop();
	}
	// convert string and return
	String rev = new String(reverse);
	return rev;
	 
	}

}
