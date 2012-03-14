package chapter4;
// Exercise 18: Complete the previous exercise by creating objects to attach to the array of references.
class Awake{
	Awake(String s){
		System.out.println(s);
	}
}
public class Exercise18 {
	public static void main(String[] args) {
		Awake[] w  = new Awake[5];
		for(int i=0; i<5; i++){
			w[i]=new Awake(Integer.toString(i)); //It actually prints the arguments!
		}
	}
}