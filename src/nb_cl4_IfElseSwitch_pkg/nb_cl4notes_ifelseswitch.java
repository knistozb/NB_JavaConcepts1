

///// JAVA Class 4: on April 29, 2023, Saturday with Instructor AP //////


package nb_cl4_IfElseSwitch_pkg;

import java.util.Scanner;

public class nb_cl4notes_ifelseswitch {

	
	
	
	// Memory Leakage: sometimes there is an open bridge/object where you can continue using it to insert input parameters. 
		//	That causes the leakage. But if you want no longer to use that object, then you can just do bridgeName.close(); to stop using it so the memory leakage can be stopped. 
	
	
	
	
	// ==============================================================================================
	
	/*
//Exercise 8	
	public static void main(String[] args) {
		String a = "apple";
		
		
		if ( !(a.length() == 6) ) { // since length of a = 6 is false, then it prints hello 
//		if ( a.length() == 5 ) { // it is true so answer will be hello ....length of a = 5 is true, so it prints hello
		//	single equal sign = is used to see that a is equal to value 3. That 3 is being put in for the value of a
		//	double equal sign == is used to when you are comparing two sides. basically it is asking the question is the value of a equal to 3? yes or no question. 
		// <= to say less than or equal to. Equal to, (=) sign always has to be kept after the lesser or greater sign
		// != to say is the condition NOT equal to something? This gives the negative scenario for that statement. 	
		// (!(a.startswith("a")) --> basically you have to put the exclamation mark at the front so it is saying a not starting with a??
			
			System.out.println("hello");
		}
		else {
			System.out.println("Wrong answer!");
		}
	
	}
	*/
}
	
	
	/*
//	Exercise 8
	
	public static void main(String[] args) {
		
		
		
		System.out.println("what is the day today?");
		Scanner ui = new Scanner(System.in); // this bridge helps to give us chance to input our answer
		String day = ui.nextLine();
		
		switch(day.toLowerCase()) { // if the user puts upper case then I can convert that into lower case so it matches my answer choice
		// anything I can do using switch, I can do using if and else BUT
		// Anything done using if and else, might not be possible with switch
		// in switch you have to break out the flow
		// just type break to break out of the switch so it only runs the one you want it. 
		// the answer is super case sensitive so be careful as you want to match the answer
		
		// case can be set as integer or a String
		case "monday":
				System.out.println("wake up at 5");
				System.out.println("wake up!");
				break;
		case "tuesday":
			System.out.println("wake up at 6");
			System.out.println("wake up!");
			break;
		case "wednesday":
			System.out.println("wake up at 7");
			System.out.println("wake up!");	
			break;
		case "thursday":
			System.out.println("wake up at 8");
			System.out.println("wake up!");
			break;
		case "friday":
			System.out.println("wake up at 9");
			System.out.println("prepare for party!");
			break;
		case "saturday":
			System.out.println("wake up at 10");
			System.out.println("PARTY!");
			break;
		case "sunday":
			System.out.println("wake up at 11");
			System.out.println("rest!");
			break;
		default:
			System.out.println("Your input should only be one of these: monday, tuesday, wednesday, ....");
		// default is similar to else situation like if-else scenario. 
		// this helps to give the user the error message to tell that none of the input matches so they have to make some changes 
		
		}
	}		
}	
	*/
	
	
	/*
	public static void main(String[] args) {

		// anything like main() with small bracket, main is method while inside the small brackets are called arguments
		// anything inside the curly bracket is called its body
		// public ...blah blah is about making the method or the recipe for making the food Vs
		// BODY is about actually using the method I made or tasting the made food. 
		// Java can be done using text editor and command prompt, but it takes 2 steps for it. We use popular industry standards IDEs (Integrated Development Environment) like Eclipse or others like InterlIJ.  
		// Using IDE, we can make and run our code more efficiently, but in the back we need jdk(java development kit) for eclipse to work with. Most of the work will be done on eclipse because it is lot easier rather than doing it on jdk.  
		// jdk comes with all the packages, methods, strings, syso, etc. when we download it. You made your computer understand by downloading it that comes with everything. 
		// syntax error is basically the grammar of the coding language.
		// functional automation testing: you make and run the codes so that code will click on the button which we would have done manually. 
		
		
		
		System.out.println("what is your favorite color?");
		Scanner ui = new Scanner(System.in); // this bridge helps to give us chance to input our answer
		String answer = ui.nextLine();
		// it is taking the answer from the user, and saving it under variable answer
		// pseudo code is the look alike simplified programming code in English language but in coding format to picture it. 
		
		
		
//	Exercise 7
		if(answer.contains("r")) {
			System.out.println("outer if");
			
			if(answer.startsWith("g")) {
				System.out.println("inner if");
				// if the word satisfies the first level, but there is some other level inside of it, then it is called nested and has to satisfy that level also to give the final answer as given
			}
			else {
				System.out.println("inner else");
			}	
		}	
		else {
			System.out.println("outer else");
		// make sure to keep track of the if and else function and whether it is either inner or outer 
		}
	}	
}	
	*/
	
	/*
//	Exercise 6
	
	public static void main(String[] args) {

		System.out.println("what is your favorite color?");
		Scanner ui = new Scanner(System.in); // this bridge helps to give us chance to input our answer
		String answer = ui.nextLine();
	
		if((answer.contains("r") && answer.startsWith("g")) || answer.endsWith("e")) {
		if(answer.contains("r") && answer.startsWith("g") || answer.endsWith("e")) {
			// it has to go left to right...meaning it has to satisfy the r then g then e
		if(answer.contains("r") && answer.startsWith("g")) {
		// && (and) condition needs to satisfy both given condition, otherwise it will ignore to give nothing
		if(answer.contains("r") || answer.startsWith("g")) {	
			// this "||" is called "pipe" or used for "or" function
			// even if it does not satisfy the first condition, but satisfies the second, it still takes it since we have used the pipe (or) function
			// if none of them is true, then it ignores them
			// or function will only need to satisfy either or conditions VS & needs to satisfy both conditions
			// it will do & condition first then it will do the or || condition next
			// just put the one you want first to happen in the parenthesis. 
		}
		System.out.println("hello");
	}
}
	*/	
		
		/*
//	Exercise 5

	public static void main(String[] args) {

		System.out.println("what is your favorite color?");
		Scanner ui = new Scanner(System.in); // this bridge helps to give us chance to input our answer
		String answer = ui.nextLine();
		
		if(answer.contains("e")) {
			System.out.println("hi");
		}
		else if(answer.contains("i")) {
				System.out.println("hey");		
		}
		else if(answer.contains("n")) {
			System.out.println("whats up!");		
		}	
		else if(answer.contains("r")) {
			System.out.println("hello");		
		}
		System.out.println("done");
	}
}
	*/

// Exercise 4: 
	/*
	public static void main(String[] args) {
		
		System.out.println("what is your favorite color?");
		Scanner ui = new Scanner(System.in); // this bridge helps to give us chance to input our answer
		String answer = ui.nextLine();

		if(answer.contains("r")) {	// if answer is red then it skips the rest since it satisfies the first condition and it can only have 1 road
			System.out.println("hello");
		}
		else if(answer.contains("e")) {
			System.out.println("hi");
		}
		else if(answer.contains("i")) {
				System.out.println("hey");		
		}
		else if(answer.contains("n")) {
			System.out.println("whats up!");		
		}	
		else {
			System.out.println("bye");
		}
		System.out.println("done");
	}	
}
		*/
	
		// if none of the condition is met then it goes to satisfy the very last else condition.
		// whatever it matches the first one, it goes with that one. IT IS NOT BASED ON THE ORDER OF ALPHABETS IN THE GIVEN ANSWER CHOICE. 
		// EVERY GROUP will have 1 output each. It always goes group by group.
		// Always count the number of If to find the total number of groups
		
//		if(answer.contains("r")) {
//			System.out.println("hello");
//		}
//		else if(answer.contains("e")) {
//			System.out.println("hi");
//		}
//		System.out.println("done");
		
		
	// IMPORTANT RULES TO REMEMBER!!!
		// if and if will allow you 2 separate groups, and give the option to walk on either one or another among those 2 roads 
		// if and else if will make you either walk this or the other, but the group remain only 1 
		// in case when both if and else if conditions are true, then you have to go with the first true condition. 
		// just count the number of if to find how many groups are in there
		// else if is not a group by itself, but is a part of the if group before it. 
		
		// if the user input has the letter 'e' >> hello
		// if the user input has the letter 'r' >> hi
		// if the user input has the letter 'i' >> bye
		// This requires you to fulfill all those 3 conditions which means the code should be 
		// code shud be: if 
						// if
						// else if
						// else if
		
		
//	Exercise 3
//		if(apple)
//			get it syso 
//		else if (pear)
//			get it syso 
//		else
//			get orange syso
		
		///  you have 1 group, but multiple roads then it will be below:
		// if
		// else if ()
		// else if ()
		// else if ()
		// else
		// if and else if will have a condition, only else won't have a condition so no small bracket ()
		// every single if will or can have 1 road or multiple roads
		// if 
		// if : these 2 are 2 different groups as it can lead us two different roads
		
		
		/*
//	Exercise 2
		if(answer.contains("ee")) {
			System.out.println("Hello");
		}
		else {
			System.out.println("bye"); // it will only print bye if the answer does not satisfy the if statement. 
		// else statement has to be followed only after if statement, but if statement can be by itself
		}
		if(answer.contains("r")) {
		System.out.println("Hello");
			// if it does not have "r" then it will ignore printing hello, and move to the next statement line.
		}
		System.out.println("done");
	}
}
		*/
		
		/*
//	Exercise 1
		String a = "apple";
		a.equalsIgnoreCase("Orange"); // False because it doesn't match with the value of a
		System.out.println(a);
		System.out.println("Before the if statement");
		// if conditions: 
		// formula is if(){}....boolean situation goes inside the small bracket..if it is true, then the code inside the curly bracket will execute
		
		if(a.equalsIgnoreCase("orange")) {
			System.out.println("Hello");
		}
		System.out.println("After the if statement");
		// since this is completely outside the if statement, it acts as an independent statement. Thus prints whatever inside the small bracket. 
	}

}
		*/