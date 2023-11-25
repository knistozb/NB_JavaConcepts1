package nb_cl4_hw4_pkg;

import java.util.Scanner;

public class NB_cl4_hw4 {

	public static void main(String[] args) {
			
		//Assignment:
			// Question 1:	Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
		
		int N1 = 21;
		if (N1>=1) {
			System.out.println(1);
		}
			for (int i=4; i<=N1; i=i+4) {
			
			System.out.println(i);
		}
//			
		// Alternative way to solve this:
		
		int N2 = 21;
		for(int i=1; i<=N2; i=i+4) {
			if(i==1) {
				System.out.println(1);
				i=4;
			}
			System.out.println(i);
		}
		
		System.out.println("====================================");
		
		//Question 2: Given N --- Print backward to 0. 
			// (Ask user for a number and let's assume N is 5 so if the user input 5  
			// then the program should print: 5 4 3 2 1 0)
		
			System.out.println("Give me a number?"); 
			Scanner q2 = new Scanner(System.in);
			int a = q2.nextInt();					// use .nextInt for integers (Primitive)
		
			for(int i=5; i>=0; i=i-1) {
				System.out.println(i);
			}
			
		System.out.println("====================================");
		
		// Question 3: Ask the user for a word and then print each character out one by one.
		// Example: user enters: hello; your program will print out: h e l l o
		
		System.out.println("Give me a word?"); 
		Scanner q3 = new Scanner(System.in);
		String b = q3.nextLine(); 			// use .nextLine for String (Non-primitive)
		
		char[] y = b.toCharArray();
		
		for(int i=0; i<=4; i=i+1) {
			System.out.print(y[i]);
//			System.out.println(y[i]);
			
		}
		
		System.out.println("=================THE END=====================");
	}

}
