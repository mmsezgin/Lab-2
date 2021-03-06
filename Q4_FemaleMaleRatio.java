package lab2;

import java.util.Scanner;

public class Q4_FemaleMaleRatio {

	public static void main(String[] args) {
		/*
		 * Question-4
		 * 
		 * Write a program that asks user for the number of males and the number of
		 * females registered in a class. The program should display the percentage of
		 * males and females in the class.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Females: ");
		int females = scan.nextInt();

		System.out.println("Enter number of Males");
		int males = scan.nextInt();

		double percentageOfFemale = ((double) females / (females + males)) * 100;
		double percentageOfMale = ((double) males / (females + males)) * 100;

		System.out.println("Female Percentage (Registered) is: " +  percentageOfFemale);
		System.out.println("Male Percentage (Registered)  is: " +  percentageOfMale);

	}

}