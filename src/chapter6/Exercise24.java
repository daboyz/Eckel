package chapter6;
// Exercise 24: In Beetle.java, inherit a specific type of beetle from class Beetle, following the same format as the existing classes. Trace and explain the output.
class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 =
			printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 =
			printInit("static Beetle.x2 initialized");
}
class Coleoptera extends Beetle{
	private int l = printInit("Coleoptera.l initialized");
	public Coleoptera() {
		System.out.println("j = " + j);
		System.out.println("l = " + l);
	}
	private static int x3 =
			printInit("static Coleoptera.x3 initialized");
}
public class Exercise24 {
	public static void main(String[] args) {
		Coleoptera c = new Coleoptera();
	}
}/* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
static Coleoptera.x3 initialized  //Calling derived class constructor loads classes and initializes static fields
i = 9, j = 0					//Insect constructor
Beetle.k initialized			//Beetle constructor initializes Beetle.k
k = 47
j = 39
Coleoptera.l initialized		//Coleoptera constructor initializes Coleoptera.l
j = 39
l = 47
*/