package chapter1;
import java.util.Scanner;

public class Exercise10 {
	public void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Type an argument: ");
		String st1 = in.nextLine();
		System.out.print("Type an argument: ");
		String st2 = in.nextLine();
		System.out.print("Type an argument: ");
		String st3 = in.nextLine();
		System.out.print("There we go: " + st1 + st2 + st3);
	}
	
}
