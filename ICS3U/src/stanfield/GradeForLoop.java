/*GradeForLoop.java
 * This program takes ten marks between 0-100 and gives a letter grade for each one
 * March 30 2016
 * Brennan Stanfield
 */
package stanfield;

import java.util.Scanner;

public class GradeForLoop {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); 

		//variables
		int numMarks;
		int marks;
		
		//Input
		System.out.println("How many marks do you want to input?");
		numMarks = Integer.parseInt(myInput.nextLine());
		
		//Processing
		for (int i=0; i< numMarks; i++){
			System.out.println("What is the mark?");
			marks = Integer.parseInt(myInput.nextLine());
			
			if (marks >= 80 && marks <= 100){
				System.out.println("Wow! You got an A");
				
			}else if (marks <= 79 && marks >=70){
				System.out.println("Good Job, you get a B");
			}else if(marks <=69 && marks >=60){
				System.out.println("Try harder, you got a C");
			}else if(marks <=59 && marks >=50){
				System.out.println("You barely made it, you got a D");
			}else if(marks <=49 && marks >= 0){
				System.out.println("You failed, you get an F");
			}else{
				System.out.println("X");
			}
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
