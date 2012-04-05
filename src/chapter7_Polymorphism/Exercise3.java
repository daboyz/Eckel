package chapter7_Polymorphism;
/* Exercise 3: Add a new method in the base class of Shapes.java that prints a message, but don’t override it in the derived classes. 
 * Explain what happens. Now override it in one of the derived classes but not the others, and see what happens. Finally, override it in all the derived classes.
 */
import java.util.Random;
class Shape1 {
	public void draw() {}
	public void erase() {}
	public void transform() { System.out.println("Shape.transform()"); } //Nothing happens when an unoverriden method is present in base class; it exists in all the derived classes and will be called from them
} 

class Circle1 extends Shape1 {
	@Override
	public void draw() { System.out.println("Circle.draw()"); }
	@Override
	public void erase() { System.out.println("Circle.erase()"); }
	public void transform() { System.out.println("Circle.transform()"); } //When a method is overriden in one derived class it is called for this class only, but for other derived classes it remains a base-version
} 

class Square1 extends Shape1 {
	@Override
	public void draw() { System.out.println("Square.draw()"); }
	@Override
	public void erase() { System.out.println("Square.erase()"); }
	public void transform() { System.out.println("Square.transform()"); } //When a method is overriden in all classes it is called from them specifically
} 

class Triangle1 extends Shape1 {
	@Override
	public void draw() { System.out.println("Triangle.draw()"); }
	@Override
	public void erase() { System.out.println("Triangle.erase()"); }
	public void transform() { System.out.println("Triangle.transform()"); }
}

class RandomShapeGenerator1 {
	private Random rand = new Random(47);
	public Shape1 next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle1();
			case 1: return new Square1();
			case 2: return new Triangle1();
		}
	}
}

public class Exercise3 {
	private static RandomShapeGenerator1 gen = new RandomShapeGenerator1();
	public static void main(String[] args) {
		Shape1[] s = new Shape1[9];
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for(Shape1 shp : s){
			shp.draw();
			shp.transform();
			}
	}
} 