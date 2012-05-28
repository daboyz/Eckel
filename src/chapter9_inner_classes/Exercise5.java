package chapter9_inner_classes;
// Exercise 5: Create a class with an inner class. In a separate class, make an instance of the inner class.
class BigBox{
	class SmallBox{
	}
}

public class Exercise5 {
	public static void main(String[] args) {
		BigBox bb = new BigBox();
		BigBox.SmallBox sb = bb.new SmallBox();	//Done
	}
}
