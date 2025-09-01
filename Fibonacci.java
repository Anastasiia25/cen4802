/** 
Author Name: Anastasiia Mikhailova
CEN 4802 Class 71965
Date: 08/31/2025
Purpose:Implement a Java class that contains two methods:
A recursive static method that returns the nth term in the Fibonacci sequence. 
The method should accept n as a parameter. Do not include javadoc code in your 
implementation (yet).
A main method that calls the first method. Pass in 10 as an argument. Output 
the 10th term of the Fibonacci sequence along with some descriptive text, e.g. 
"The nth term of the Fibonacci sequence is y." Don't hard-code the results; 
output the appropriate variables.
*/


import java.util.Scanner;

public class Fibonacci {

	/**
	* Recursively computes the nth term of the Fibonacci sequence.
	* @return nth term of the Fibonacci sequence.
 	* @param n Index of the sequence term to compute.
	*/
		
    public static int fibonacci(int n) {
    	
    	// The recursive method
        if (n <= 1) {
            return n;
        }       
        // Recursive step
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
    
     public static void main(String[] args) {
    	
    	// Main method
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	
        // Prompt the user to enter an integer to compute the Fibonacci sequence
    	System.out.print("Enter the index of the sequence term to compute: ");
		int n = input.nextInt();
			
		       
        // Call the recursive method
        int nextInt = fibonacci(n);
        
        // Print result after the method is called
        System.out.println("\nThe " + n + "th term of the Fibonacci sequence is  " + nextInt);
    }

}
