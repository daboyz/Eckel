package chapter5_outer;
/* Exercise 7: Create the library according to the code fragments describing access and Widget. Create a Widget in a class that is not part of the access package.

public class Widget {

Now if the name of your library is access, any client programmer can access Widget by saying
import access.Widget;
or
import access.*;

*/
import chapter5.*;
public class Exercise7_outer {
	Exercise7 ex7 = new Exercise7(); //There you go
}
//Please refer to chapter5.Exercise7