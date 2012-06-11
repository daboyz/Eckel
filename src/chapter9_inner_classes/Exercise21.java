package chapter9_inner_classes;
/* Exercise 21: Create an interface that contains a nested class that has a static method that calls the methods of
 * your interface and displays the results. Implement your interface and pass an instance of your implementation to the method.
 */
interface SCSI{
	String add();
	static class Wire{
		static void roll(SCSI s) {
			System.out.println(s.add());
		}
	}
}
public class Exercise21 implements SCSI{
	public String add(){
		int i = 1;
		i++;
		return Integer.toString(i);
	}

	public static void main(String[] args) {
		SCSI.Wire.roll(new Exercise21());
	}
}/*
2
*/