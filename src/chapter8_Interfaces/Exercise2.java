package chapter8_Interfaces;
//Exercise 2: Create a class as abstract without including any abstract methods and verify that you cannot create any instances of that class.
abstract class Thorn{
	Thorn(int i){
		
	}
	
}
public class Exercise2 {
	public static void main(String[] args) {
		//Thorn th = new Thorn();		//"Cannot instantiate the type Thorn" message appears
		//Thorn th = new Thorn(2);		//Cannot create an object via constructor either
	}
}
