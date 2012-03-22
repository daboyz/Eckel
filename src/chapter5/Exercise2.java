package chapter5;
/* Exercise 2: Take the code fragments in this section and turn them into a program, and verify that collisions do in fact occur.

public class Vector {
public Vector() {
System.out.println("net.mindview.simple.Vector");
}

import java.util.*;
Vector v = new Vector();
java.util.Vector v = new java.util.Vector();
*/
import java.util.*;
import chapter5_outer.*; // Please refer to chapter5_outer.Vector.java  

public class Exercise2 {
	public static void main(String[] args){ 
		// Vector v = new Vector();   //A collision does occur
		// java.util.Vector v = new java.util.Vector();
	}
}
