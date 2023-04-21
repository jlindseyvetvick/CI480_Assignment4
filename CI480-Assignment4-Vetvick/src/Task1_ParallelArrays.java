//Solution to Assignment #4: Task 1 - Write an improved gradebook program
//which stores user input (names & grades) into two arrays, then uses the stored
//data to calculate and print student averages.
//Lindsey Vetvick

import java.util.Arrays;
import java.util.Scanner;

public class Task1_ParallelArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// get input from user on how many instances of student data will be collected
		System.out.println("For how many students would you like to enter grades? ");
		int studentTotal = scan.nextInt();
		scan.nextLine();
		System.out.println();

		// initialize arrays for student data
		String[] studentNames = new String[studentTotal];
		double[] studentAvgs = new double[studentTotal];

		// create variables to store data while calculating grade averages
		double sum = 0;
		double avg = 0.0;

		// create for loop to store student names
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("Enter the name of Student #" + (i + 1) + ": ");
			studentNames[i] = scan.nextLine();
			System.out.println();

			//determine how many scores will be entered per student
			System.out.println("How many grades would you like to enter for " + studentNames[i] + "? ");
			int gradeCount = scan.nextInt();
			System.out.println();
			
			//create for loop to calculate the average scores based on user input
			for (int j = 0; j < gradeCount; j++) {
				System.out.println("Enter Grade #" + (j + 1) + ":");
				sum = sum + scan.nextDouble();
				avg = sum / gradeCount;
				System.out.println();
			}

			// store calculated average in appropriate index
			studentAvgs[i] = avg;
			scan.nextLine();

			// reset sum and avg variables to 0.00
			sum = 0.00;
			avg = 0.00;

		}
		
		//print out arrays
		System.out.println("The arrays for student names and their corresponding average scores are listed below: ");
		System.out.println(Arrays.toString(studentNames));
		System.out.println(Arrays.toString(studentAvgs));
	}
}
