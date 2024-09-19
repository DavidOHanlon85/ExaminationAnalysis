/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise09_ExaminationAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] assignmentOne = new int[] { 24, 42, 29, 66, 77 };
		int[] assignmentTwo = new int[] { 79, 68, 31, 22, 42 };

		double assignmentOneAverage;
		double assignmentTwoAverage;

		assignmentOneAverage = calculateAverageMark(assignmentOne);
		System.out.printf("Average Assignment One: %.2f\n", assignmentOneAverage);

		assignmentTwoAverage = calculateAverageMark(assignmentTwo);
		System.out.printf("Average Assignment Two: %.2f\n", assignmentTwoAverage);
		
		overallAverage(assignmentOneAverage, assignmentTwoAverage);
		
		whichAssignmentHasABetterAverage(assignmentOneAverage, assignmentTwoAverage);

	}

	public static void whichAssignmentHasABetterAverage(double assignmentOneAverage, double assignmentTwoAverage) {
		if (assignmentOneAverage > assignmentTwoAverage) {
			System.out.println("Assignment One Average is better.");
		} else if (assignmentTwoAverage > assignmentOneAverage) {
			System.out.println("Assignment Two Average is better.");
		} else {
			System.out.println("Both Assignment Averages are equal.");
		}
	}

	/**
	 * This method calculate the overall average for all assignments
	 * @param assignmentOneAverage
	 * @param assignmentTwoAverage
	 */
	public static void overallAverage(double assignmentOneAverage, double assignmentTwoAverage) {
		double overallAverage;
		
		overallAverage = (assignmentOneAverage + assignmentTwoAverage) / 2.0;
		
		System.out.printf("The Overall Average for all assignments is %.2f\n", overallAverage);
	}

	/**
	 * This method calculates the average of an integer array
	 * 
	 * @param assignment - user inputed array
	 * @return - averageMark return
	 */
	public static double calculateAverageMark(int[] assignment) {

		double averageMark;
		int total = 0;

		for (int i = 0; i < assignment.length; i++) {
			total += assignment[i];
		}
		averageMark = (double) total / assignment.length;
		return averageMark;
	}

}
