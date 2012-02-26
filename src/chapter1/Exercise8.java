package chapter1;

public class Exercise8 {
	static int i;
	
	public void main (String[] args){
		Exercise8 ex8_1 = new Exercise8();
		Exercise8 ex8_2 = new Exercise8();
		Exercise8 ex8_3 = new Exercise8();
		ex8_1.i=50;
		System.out.println("First instance equals " + ex8_1 + " now.");
		System.out.println("Next move");
		ex8_2.i=686;
		System.out.println("First instance equals " + ex8_1 + " now.");
		System.out.println("Second instance equals " + ex8_2 + " now.");
		System.out.println("Whoa");
		System.out.println("Last move");
		ex8_3.i=999;
		System.out.println("First instance equals " + ex8_1 + " now.");
		System.out.println("Second instance equals " + ex8_2 + " now.");
		System.out.println("Third instance equals " + ex8_3 + " now.");
	}
	
}
