package chapter5;
//Exercise 4: Show that protected methods have package access but are not public.
public class Exercise4_same_package {
	public static void show2(){
		Exercise4 ex4 = new Exercise4();
		ex4.show();                        // No warning
	}
}
//Please refer to "chapter5.Exercise4" and "chapter5_outer.Exercise4"