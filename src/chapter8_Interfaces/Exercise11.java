package chapter8_Interfaces;
/* Exercise 11: Create a class with a method that takes a String argument and produces a result that swaps 
 * each pair of characters in that argument. Adapt the class so that it works with interfaceprocessor.Apply.process( ).
 */
class Producer {
	String toString(char[] ch){
		String s ="";
		for (int i=0; i<ch.length; i++)
			s = s + ch[i];
		return s;
	}
	String produce(String take){ 			//A method that takes a String argument and produces a result that swaps each pair of characters in that argument
		char[] tk = new char[take.length()];
		if (take.length()%2==0)				//A number of characters in string has to be even
			for (int i=0; i<take.length(); i=i+2){
				tk[i] = take.charAt(i+1);
				tk[i+1] = take.charAt(i);
			}
		else 
			for (int i=0; i<(take.length()-1); i=i+2){
				tk[i] = take.charAt(i+1);
				tk[i+1] = take.charAt(i);
			}
		return toString(tk);
	}
}

class ProducerAdapter implements Processor{
	public String name() {					//Just an implementation of interface's method that returns a name of class.
		return "ProducerAdapter"; 
		}
	Producer prod;
	public ProducerAdapter(Producer prod) {	//Constructor saves argument's Producer object into a field of Adapter 
		this.prod = prod;
	}
	public String process(Object input) {	//A Producer filed's method is called via Processor interface 
		return prod.produce((String)input);
	}	
}

public class Exercise11 {
	public static void main(String[] args) {
		String take = "It's a very nice day indeed";
		Apply.process(new ProducerAdapter(new Producer()), take);	//And here we call the static process() method with an Adapter as an argument
	}
}/*Output:
tIs'a v re yinecd yai dnee
*/