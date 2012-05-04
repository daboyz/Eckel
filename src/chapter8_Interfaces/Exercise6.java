package chapter8_Interfaces;
import chapter8_Interfaces_addendum.Chapter8_exercise5;

// Exercise 6: Prove that all the methods in an interface are automatically public.
//Please refer to chapter8_Interfaces_addendum/Chapter8_exercise5

public class Exercise6 implements Chapter8_exercise5{
	//void cry(){};		//Cannot reduce the visibility of the inherited method from Chapter8_exercise5" message appears
	//protected void dry(){};		//Cannot reduce the visibility of the inherited method from Chapter8_exercise5" message appears
	//private void pry(){};		//Cannot reduce the visibility of the inherited method from Chapter8_exercise5" message appears
	public void cry(){}
	public void dry(){}
	public void pry(){}
}