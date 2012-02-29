package chapter2;

public class Exercise9 {
	public static void main(String[] args) {
		float expFloatmin = Float.MIN_VALUE;
		System.out.println("The smallest number for Float exponential notation is " + expFloatmin + "f"); // I'm using "f" suffix to show that it has to be a float value
		float expFloatmax = Float.MAX_VALUE;
		System.out.println("The biggest number for Float exponential notation is " + expFloatmax + "f");
		double expDoublemin = Double.MIN_VALUE;
		System.out.println("The smallest number for Double exponential notation is " + expDoublemin);
		double expDoublemax = Double.MAX_VALUE ;
		System.out.println("The biggest number for Double exponential notation is " + expDoublemax);
	}
}
