package chapter5;
/* Exercise 9: Create the following file in the access/local directory (presumably in your CLASSPATH):
 * 
// access/local/PackagedClass.java
package access.local;
class PackagedClass {
	public PackagedClass() {
		System.out.println("Creating a packaged class");
	}
}
 *
 * Then create the following file in a directory other than access/local:
 *
// access/foreign/Foreign.java
package access.foreign;
import access.local.*;
public class Foreign {
	public static void main(String[] args) {
		PackagedClass pc = new PackagedClass();
	}
}
 *
 * Explain why the compiler generates an error. Would making the Foreign class part of the access.local package change anything?
*/
public class Exercise9 {
	public Exercise9 (){
		System.out.println("Creating a packaged class");
	}
}
//Please refer to chapter5_outer.Exercise9_outer