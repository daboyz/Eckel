package chapter1;

public class Exercise6 {
	String s;
	int storage(String s){
		return s.length()*2;
    
	}
	public void main(String[] args) {
		s = "Whoa dude!";
		System.out.println("The number of bytes required to store this string is " + storage(s));
	}
}
