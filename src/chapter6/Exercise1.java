package chapter6;
// Exercise 1: Create a simple class. Inside a second class, define a reference to an object of the first class. Use lazy initialization to instantiate this object.
class Simple{
	int i = 5;
	void alloy(){
		System.out.println(i);
	}
}

public class Exercise1 {
	 Simple smpl;
	void useSimple(){
		smpl = new Simple(); //Lazy initialization
		smpl.alloy();
	}
	public static void main(String[] args){
		Exercise1 ex1 = new Exercise1();
		ex1.useSimple();
	}
}