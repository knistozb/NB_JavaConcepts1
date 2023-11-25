


///// JAVA Class 4: on April 29, 2023, Saturday with Instructor AP //////


package nb_cl4_loop_pkg;

import java.util.Scanner;

public class nb_cl4_loop_classnotes {

	
	
	
	
	
	
	
	
	
	
	// ========================================================================
	
	
	
	
	public static void main(String[] args) {

		
		// loop: if you are in a situation where work/code is being repeated certain number of times (infinite). Instead of copying and pasting, we can do the loop
		// for loop: because it has for in the loop. 
		// hula hoop or jumping rope: every other time the count goes up so somebody is keeping track of it. 
		
		// formula of for loop: for(starting point or i=1 ;Range or i<=5  ; ending point or i=i+1 ){}
		for( int i=0; i <=5 ; i=i+3 ) {
		// iterator: concept of iteration: someone needs to keep track of how many times it has been done. 
			// standard letter "i" is used for short for iterator. 
			// i=0 since you start at 0. 
			// bucket is always on the left side while the value is always on the right side
			// range is how far do I want to go
			// i = 1,2,3,4,5
			// i = 0,3
		}
	}	
	
}		
		
		
		
// if you are going to be an Automation QA then you need java with looping all the time. 
		
		
		
//Exercise 12:	
//		System.out.println("Give me a string with at least 3 characters"); // oranges = 7
//		Scanner ui = new Scanner(System.in);
//		String a = ui.nextLine();		// if answer is oranges
//		
//		if(a.length()>=3) {     
//			
//			for(int i=0; i<=2; i=i+1) {		// you only want ora
////				System.out.println(a.charAt(i));    // you want ora vertically
//				System.out.print(a.charAt(i));    // you want ora horizontally
//				// println will print vertically line by line, one by one
//				// print will print horizontally if you want it that way. 
//			}
//		}
//		else {
//			
//			System.out.println("Looks like you did not give me a proper input");
//		}
//		
//	}
//}		
		
//Exercise 11:
//		System.out.println("Give me a string?"); // oranges = 7
//		Scanner ui = new Scanner(System.in);
//		String a = ui.nextLine(); // String, which is a non-primitive type, always starts with upper case
//			// all primitive like char, int, double, boolean, etc. are lower case	
//			// this line gives us chance to input or type our answers then save it under a.
		
//		char[] x = a.toCharArray();	
//			// use to charArray() if I want to convert/break down my variables into individual character
//				
//		for(int i=0; i<=x.length-1; i=i+1) {	// length will start from 1,2,3,4,.... 
////		for(int i=0; i<x.length; i=i+1) {	// x.length will give 7 because length counts from 1,2,3,....
//			// to get to 7, you can either do i < x.length or i <= x.length-1 to get to 6 since it runs from 0 to 6 using the index number rule 
//			System.out.println(x[i]);	
//		}
//		for(int i=0; i<=2; i=i+1) {	// length will start from 1,2,3,4,.... 
//				// to get to 7, you can either do i < x.length or i <= x.length-1 to get to 6 since it runs from 0to 6 using the index number rule 
//				// index always starts at 0,1,2,3,.... and array uses index numbers Vs length or natural counting starts at 1,2,3,4...
//			System.out.println(x[i]);	
//			}
//		System.out.println("done");
//		for(int i=x.length-1; i>=0; i=i-1) {		// you have to use i=x.length-1		 
//			System.out.println(x[i]);	// you want answer in reverse order 
//		}
//	}
//}		
		
//Exercise 10:
//		String a = "apple";
//		
//		char[] x = a.toCharArray();
//		// use to charArray() if I want to convert/break down my variables into individual character
//		
//		System.out.println(x[0]);    // a
//		System.out.println(x[1]);    // p
//		System.out.println(x[2]);    // p
//		System.out.println(x[3]);	 // l
//		System.out.println(x[4]);	 // e
//
//		for(int i=0; i<=4; i=i+1) {		 
//			System.out.println(x[i]);	// you want answer as a,p,p,l,e.... set as i so it will start from 0 place for a and keep going until it hits the 4th place for e and then stop. 
//		}
//		System.out.println("=====================");
//		
//		for(int i=4; i>=0; i=i-1) {		 
//			System.out.println(x[i]);	// you want answer as e,l,p,p,a...basically apple in reverse order 
//		}
		
		
// Exercise 9:
//		for(int i=5; i>=1 ;i=i-1) {  //// you want answer as 5,4,3,2,1					
//			System.out.println(i); 
//		}
//		System.out.println("done");			
		
		
// Exercise 8:
//		for(int i=5; i>=1 ;i=i-1) {  //// you want answer as 5,4,3,2,1					
//			System.out.println(i); 
//		}
//		System.out.println("done");		
		
		
//Exercise 1 replacement but 7:
//		for( int i=1; i<=5 ; i=i+1) {
//			System.out.println("Wash");
//			System.out.println("Rinse");
//			System.out.println("Dry");
//		}
//		System.out.println("done");
			
		
// Exercise 6
//		for(int i=1; i<=5 ;i=i+1) {  //// you want answer as *,*,*,*,*
//									
//			System.out.println("*"); 
//		}
//		System.out.println("done");
		
		
// Exercise 5
//		for(int i=2; i<=20 ;i=i+2) {  //// you want answer as 2,4,6,8,...20
//							
//			System.out.println(i); 
//		}
//		System.out.println("done");	
		
		
// Exercise 4
//		for(int i=5; i<=15 ;i=i+1) {   // you want answer as 5,6,7,8,....15
//					
//			System.out.println(i); 
//			// it is going to keep going up until the value of i is less than or equal to 5. It stops once it is over 5. 
//		}
//		System.out.println("done");	
		
			
// Exercise 3
//		for(int i=1; i<=3 ;i=i+1) {
//			
//			System.out.println(i); 
//			// it is going to keep going up until the value of i is less than or equal to 3. It stops once it is over 3. 
//		}
//			System.out.println("done");
		
		
// Exercise 2
//		for(int i=1; i<=5 ;i=i+1) {
			
//			System.out.println(i); 
			// it is going to keep going up until the value of i is less than or equal to 5. It stops once it is over 5. 
//		}	
//	}		
//}		
		
		
// Exercise 1	
//		System.out.println("Wash");
//		System.out.println("Rinse");
//		System.out.println("Dry");
//
//		System.out.println("Wash");
//		System.out.println("Rinse");
//		System.out.println("Dry");
//		
//		System.out.println("Wash");
//		System.out.println("Rinse");
//		System.out.println("Dry");
//		
//		System.out.println("Wash");
//		System.out.println("Rinse");
//		System.out.println("Dry");
//		
//		System.out.println("Wash");
//		System.out.println("Rinse");
//		System.out.println("Dry");
//				
//	}

//}
