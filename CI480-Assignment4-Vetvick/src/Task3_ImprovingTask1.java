//Solution to Assignment #4: Task 3 - Write an improved gradebook program
//which stores user input (names & grades) into two arrays, then uses the stored
//data to calculate and print student averages.
//Lindsey Vetvick

import java.util.Arrays;
import java.util.Scanner;

public class Task3_ImprovingTask1 {

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

		// create for loop to store student names
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("Enter the name of Student #" + (i + 1) + ": ");
			studentNames[i] = scan.nextLine();
			System.out.println();

			// determine how many scores will be entered per student
			System.out.println("How many grades would you like to enter for " + studentNames[i] + "? ");
			int gradeCount = scan.nextInt();
			System.out.println();

			// use custom method to calculate average, then store in appropriate index
			studentAvgs[i] = determineAvg(gradeCount);
			scan.nextLine();

		}

		printArrays(studentNames, studentAvgs);
	}

	// create custom method for printing student names and average scores
	// side by side
	public static void printArrays(String names[], double avgs[]) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "'s average score is: " + avgs[i] + ".");
		}
	}

	// create custom method for gathering scores, calculating averages, and
	// returning them to the main method
	public static double determineAvg(int scoreCount) {
		// create new instance of scanner to gather user input
		Scanner kb = new Scanner(System.in);
		
		// create local variables for sum & avg
		double sum = 0;
		double avg = 0;

		//begin for loop to determine average score
		for (int j = 0; j < scoreCount; j++) {
			System.out.println("Enter Grade #" + (j + 1) + ":");
			sum = sum + kb.nextDouble();
			avg = sum / scoreCount;
			System.out.println();
		}
		
		return avg;
	}
}
