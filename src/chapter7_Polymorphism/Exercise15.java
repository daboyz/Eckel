package chapter7_Polymorphism;
// Exercise 15: Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.

class Glyph {
	void draw() { System.out.println("Glyph.draw()"); }
	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
class RectangularGlyph extends Glyph {
	private int a = 1, b = 1;
	RectangularGlyph(int a, int b) {
		this.a = a; this.b = b;
		System.out.println("RectangularGlyph.RectangularGlyph(), a = " + a + " b = " + b);
	}
	void draw() {
		System.out.println("RectangularGlyph.draw(), a = " + a + " b = " + b);
	}
}
public class Exercise15 {
	public static void main(String[] args) {
		new RectangularGlyph(5, 3);
	}
} /* Output:
Glyph() before draw()
RectangularGlyph.draw(), a = 0 b = 0          //Voila!
Glyph() after draw()
RectangularGlyph.RectangularGlyph(), a = 5 b = 3
*/