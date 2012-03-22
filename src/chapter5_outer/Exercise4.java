package chapter5_outer;
//Exercise 4: Show that protected methods have package access but are not public.
import chapter5.*;
public class Exercise4 {
	public static void show3(){
		chapter5.Exercise4 ex4 = new chapter5.Exercise4();
		//ex4.show();                        //  "The method show() from the type Exercise4 is not visible" warning
	}
}
//Please refer to "chapter5.Exercise4" and "chapter5.Exercise4_same_package"