package chapter2;
class Star{
	float dist;
}
public class Exercise3 {
	
	public static void calculate(Star x){
		x.dist = x.dist*10;
	}
	public static void main (String[] args){
		Star sun = new Star();
		sun.dist = 7800000;
		System.out.println("Distance to sun is " + sun.dist + " miles");
		calculate(sun);
		System.out.println("Oh, I meant it was " + sun.dist + " miles");
	}
	
}
