package chapter9_inner_classes;

import chapter9_inner_classes.BigNestBox.NestBox;

//Exercise 19: Create a class containing an inner class that itself contains an inner class. Repeat this using nested classes. Note the names of the .class files produced by the compiler.
class BigBoxx{
	class Box{
		class SmallBox{
		}
	}
}
class BigNestBox{
	static class NestBox{
		static class SmallNestBox{
			}
		}
	}

public class Exercise19 {
	public static void main(String[] args) {
		BigBoxx b = new BigBoxx();
		BigBoxx.Box bb = b.new Box();
		BigBoxx.Box.SmallBox sb = bb.new SmallBox();	//Finally got to creating instance of third level inner class
		
		BigNestBox bnb = new BigNestBox();
		NestBox nb = new NestBox();						//Direct constructor call
		NestBox.SmallNestBox snb = new NestBox.SmallNestBox();	//A direct constructor call that requires specifying full class path
	}
}