package chapter4;
// Exercise 21: Create an enum of the least-valuable six types of paper currency. Loop through the values( ) and print each value and its ordinal( ).
public class Exercise21 {
	public enum Currency{
		ONE, TWO, FIVE, TEN, TWENTY, FIFTY
	}
	public static void main(String[] args){
		for(Currency c : Currency.values()){
			System.out.print(c + " ");
		}
	}
}