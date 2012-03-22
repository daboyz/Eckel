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
			System.out.println("Creating connection number " + n);
		}
	public static Connection makeConnection(int i){ // Allow creation via static method
		return new Connection(i);
	}
}

class ConnectionManager{
	private static int conncount=0;
	private ConnectionManager(){
		connInit();
	}
	private static ConnectionManager cm = new ConnectionManager(); // Initialization of Connection Manager
	private static void connInit(){
		Connection[] connmgr = new Connection[5];
		for (int i=0; i<5; i++)  //Creating Connection objects for the array
			connmgr[i] = Connection.makeConnection(i);
	}
	public static Connection access(){
		if (conncount<5){
			return ConnectionManager.connmgr[conncount];
			System.out.println("Accessing connection number " + conncount);
			conncount++;}
		else return null;
	}
}
public class Exercise8 {
	public static void main(String[] args){
		for (int n=1; n<7; n++)
			ConnectionManager.access();
	}
}
