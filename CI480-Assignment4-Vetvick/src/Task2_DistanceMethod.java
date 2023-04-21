//Lindsey Vetvick - Solution to Assignment #4: Task 2
//Write a program which includes a custom method DISTANCE
//into its integer form as well as recognize an invalid input.

public class Task2_DistanceMethod {

	public static void main(String[] args) {
		// run custom method 3 times with given test values
		distance(5, 6, 10, 12);
		distance(5, 10, 45, 65);
		distance(-10, 10, 5, -40);
	}

	// create custom method which requires 4 arguments
	public static void distance(double x1, double y1, double x2, double y2) {

		// calculate x- and y-squared
		double xSqrd = (x2 - x1) * (x2 - x1);
		double ySqrd = (y2 - y1) * (y2 - y1);

		// calculate the distance
		double distance = Math.sqrt(ySqrd + xSqrd);

		// print out distance between the two points
		System.out.println("The distance between the two listed points is: " + distance);

	}

}
