package chapter4;
// Exercise 22:  Write a switch statement for the enum in the previous example. For each case, output a description of that particular currency.
import chapter4.Exercise21.Currency;
class Switcher{
	public void sw(Currency cur){
		switch(cur) {
			case ONE: System.out.println("Got one"); break;
			case TWO: System.out.println("Got two"); break;
			case FIVE: System.out.println("Got five"); break;
			case TEN: System.out.println("Got ten"); break;
			case TWENTY: System.out.println("Got twenty"); break;
			case FIFTY: System.out.println("Got fifty"); break;
			default: System.out.println("Got nothing");
		}
	}
}
public class Exercise22 {
	public static void main(String[] args){
		Switcher s = new Switcher();
		for(Currency c : Currency.values()){
			s.sw(c);
		}
	}
}