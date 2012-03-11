package chapter4;
/* Exercise 5: Create a class called Dog with an overloaded bark( ) method. 
 * This method should be overloaded based on various primitive data types, 
 * and print different types of barking, howling, etc., depending on which overloaded version is called. 
 * Write a main( ) that calls all the different versions.
 */
class Dog{
	Dog(int a){
		System.out.println("Dog barks " + a + " times");
	}
	Dog(byte a){
		System.out.println("Dog howls " + a + " times");
	}
	Dog(char a){
		System.out.println("Dog snorks " + a + " times");
	}
	Dog(float a){
		System.out.println("Dog laughs dramatically " + a + " times");
	}
	Dog(short a){
		System.out.println("Dog assumes it is a rock " + a + " times");
	}
	Dog(long a){
		System.out.println("Dog increases enthropy " + a + " times");
	}
	Dog(double a){
		System.out.println("Dog lurks beneath " + a + " times");
	}
}
public class Exercise5 {
	public static void main(String[] args){
		Dog a = new Dog((int) 4);
		Dog b = new Dog((byte) 4);
		Dog c = new Dog((char) 4);
		Dog d = new Dog((float) 4);
		Dog e = new Dog((short) 4);
		Dog f = new Dog((long) 4);
		Dog g = new Dog((double) 4);
		
	}
}
