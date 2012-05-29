package chapter9_inner_classes;
// Exercise 10: Repeat the previous exercise but define the inner class within a scope within a method.
interface Leg{
	void facefoot();
}
class Kick{
	Leg getLeg(int i){
		if (i>5){
			class Feet implements Leg{
				public void facefoot(){
					System.out.println("facefoot()");
				}
				Feet(int i){
					int toes = i;	
				}
			}
			return new Feet(i);
		}
		else return null;	//In case i<=5
	}
}
public class Exercise10 {
	public static void main(String[] args) {
		Kick k = new Kick();
		k.getLeg(8).facefoot();
	}
}/* Output:
facefoot()
*/