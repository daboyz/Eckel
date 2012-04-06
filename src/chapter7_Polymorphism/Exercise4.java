package chapter7_Polymorphism;
// Exercise 4: Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for your new type as it does in the old types.

class Polygon extends Shape1 { //I shall extend Shape1 since it has latest changes
	@Override
	public void draw() { System.out.println("Polygon.draw()"); }
	@Override
	public void erase() { System.out.println("Polygon.erase()"); }
	public void transform() { System.out.println("Polygon.transform()"); }
} 

public class Exercise4 {
	public static void main(String[] args) {
		Shape1 s = new Polygon();
			s.erase();
			s.draw();
			s.transform();
	}
}/* Output:
Polygon.erase()
Polygon.draw()
Polygon.transform()
*/