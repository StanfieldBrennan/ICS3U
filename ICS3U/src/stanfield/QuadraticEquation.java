/*QuadraticEquation.java
 * This program calculates the two roots of a quadratic equation
 * Brennan Stanfield
 * March 21 2016
 */ 
package stanfield;

import java.util.Scanner;

public class QuadraticEquation {


	public static void main(String[] args) {
	
		Scanner myInput = new Scanner(System.in); 

		
		//Declaration of Variables
		double a;
		double b;
		double c;
		
		//Informing the user what must be done
		System.out.println("The quadratic equation is  x = -b ± √(b2 - 4ac)/2a");
		
		//input
		System.out.println("Please input a value for a");
		a = Double.parseDouble(myInput.nextLine());
		System.out.println("Please input a value for b");
		b = Double.parseDouble(myInput.nextLine());
		System.out.println("Please input a value for c");
		c = Double.parseDouble(myInput.nextLine());
		
		double r1 = 0;
        double r2 = 0;
 
        double discriminant = b * b - 4 * a * c;
 
        if (discriminant > 0){
 
            // r = -b / 2 * a;  
            r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
 
            System.out.println("The equation has two real roots " + r1 + " and " + r2);
        }
 
 
        if (discriminant == 0){
            System.out.println("The equation has one root " +r1);
 
            r1 = -b / (2 * a);
            r2 = -b / (2 * a);
 
        }
 
        if (discriminant < 0){
            System.out.println("The equation has no real root");
		


	}

	}
	}
