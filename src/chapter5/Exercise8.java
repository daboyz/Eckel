package chapter5;
/* Exercise 8: Following the form of the example Lunch.java, create a class called ConnectionManager that manages a fixed array of Connection objects. 
 * The client programmer must not be able to explicitly create Connection objects, but can only get them via a static method in ConnectionManager. 
 * When the ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
 *
class Soup1 {
	private Soup1() {}
	// (1) Allow creation via static method:
	public static Soup1 makeSoup() {
	return new Soup1();
	}
}
class Soup2 {
	private Soup2() {}
	// (2) Create a static object and return a reference
	// upon request.(The "Singleton" pattern):
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
	return ps1;
	}
	public void f() {}
	}
// Only one public class allowed per file:
public class Lunch {
	void testPrivate() {
	// Can’t do this! Private constructor:
	//! Soup1 soup = new Soup1();
	}
void testStatic() {
	Soup1 soup = Soup1.makeSoup();
	}
void testSingleton() {
	Soup2.access().f();
	}
}
 */
class Connection{
	private Connection(int n){
			System.out.println("Creating connection " + n);
		}
	public static Connection makeConnection(int i){ // Allow creation via static method
		return new Connection(i);
	}
	public void connect(int a){
		System.out.println("Connecting to socket " + a);
	}
}

class ConnectionManager{
	private static int conncount=0;
	private static Connection[] connmgr = new Connection[5];
	private static void connInit(){
			for (int i=0; i<5; i++)  //Creating Connection objects for the array
			connmgr[i] = Connection.makeConnection(i);
	}
	private ConnectionManager(){ //Construction calls initialization method
		connInit();
	}
	private static ConnectionManager cm = new ConnectionManager(); //Singleton pattern
	
	public static Connection access(){
		if (conncount<5){
			System.out.println("Accessing connection " + conncount);
			return connmgr[conncount++];
			}
		else return null; //I hope this is what is meant by "null reference"
	}
}
public class Exercise8 {
	public static void main(String[] args){
		for (int n=0; n<7; n++)
			ConnectionManager.access().connect(n); //You may notice "Exception in thread "main" java.lang.NullPointerException" message caused by null returned when (n>4)
	}
}
