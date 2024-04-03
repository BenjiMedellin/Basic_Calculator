/*
 * Author: Benjamin Medellin
 * Name of Project: Basic Calculator
 * Description: This program will great the user and ask them for two numbers including a 
 * operator. From there it will process the calculation. 
 */
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		// Great the user.
		System.out.println("Hello, please enter the equation you would like to solve.");
		
		Scanner input = new Scanner(System.in); // Create a scanner object that will take input from user.
		System.out.println("Enter equation"); // Prompt user to take in user input.
		
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter an operator (+, -, *, /): ");
		String operator = input.next();
		
		int answer;
		
		if (operator.equals("+")) {
			answer = num1 + num2;
			System.out.println("Answer: " + answer);
		} else if (operator.equals("-")) {
			answer = num1 - num2;
			System.out.println("Answer: " + answer);
		} else if (operator.equals("*")) {
			answer = num1 * num2;
			System.out.println("Answer: " + answer);
		} else {
			answer = num1 / num2;
			System.out.println("Answer: " + answer);
		}
		
		
		input.close();
	}

}
