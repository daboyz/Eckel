package chapter4;
// Exercise 11: Modify the previous exercise so that your finalize( ) will always be called.
class FinalArk{
	int i=0;
	public void errorgate(float f){ 
		i = i + (int)f;
	}
	protected void finalize() { 
		if(i==0)
		System.out.println("NO U");
		}
}
public class Exercise11 {
	public static void main(String[] args){
		FinalArk are = new  FinalArk();
		 are.errorgate((float) 3.14); 
		 System.gc();                 //Forced marking for garbage collection
		 new  FinalArk();           
		 System.gc();				  //Forced marking for garbage collection
	}
}
