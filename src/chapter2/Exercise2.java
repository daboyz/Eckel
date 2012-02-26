package chapter2;

public class Exercise2 {
	float result;
	
	public static void main(String[] args){
		Exercise2 calc1 = new Exercise2();
		Exercise2 calc2 = new Exercise2();
		calc1.result = 22;
		calc2.result = 33;
		System.out.println("One: " + calc1.result + " Two: " + calc2.result);
		calc1.result = calc2.result;
		System.out.println("One: " + calc1.result + " Two: " + calc2.result); //The variables values are equal but objects they point to are different
		calc1.result = 686;
		System.out.println("One: " + calc1.result + " Two: " + calc2.result); //Told you
		calc1 = calc2;
		System.out.println("One: " + calc1.result + " Two: " + calc2.result); //Goodbye calc1!
	}
}
