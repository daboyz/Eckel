package chapter7_Polymorphism;
// Exercise 2: Add the @Override annotation to the shapes example.
import java.util.*;
class Shape {
	public void draw() {}
	public void erase() {}
} 

class Circle extends Shape {
	@Override
	public void draw() { System.out.println("Circle.draw()"); } //No warning occurs
	@Override
	public void erase() { System.out.println("Circle.erase()"); }
} 

class Square extends Shape {
	@Override
	public void draw() { System.out.println("Square.draw()"); }
	@Override
	public void erase() { System.out.println("Square.erase()"); }
} 

class Triangle extends Shape {
	@Override
	public void draw() { System.out.println("Triangle.draw()"); }
	@Override
	public void erase() { System.out.println("Triangle.erase()"); }
}

class RandomShapeGenerator {
	private Random rand = new Random(47);
	public Shape next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
}

public class Exercise2 {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for(Shape shp : s)
			shp.draw();
	}
}