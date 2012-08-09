package chapter10_holding_your_objects;

/* Exercise 15: Stacks are often used to evaluate expressions in programming languages. 
 * Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push the following letter onto the stack," 
 * and ’-’ means "pop the top of the stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */

import java.util.LinkedList;

class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v) {
		storage.addFirst(v);
	}
	public T peek() {
		return storage.getFirst();
	}
	public T pop() {
		return storage.removeFirst();
	}
	public boolean empty() {
		return storage.isEmpty();
	}
	public String toString() {
		return storage.toString();
	}
}

class Evaluator{
	public void evaluate(String input){
		Stack<String> stack = new Stack<String>();
		String flag = "";
		for(String s : input.split("")){
			if (s.equals("+"))
				flag = s;
			else if (s.equals("-"))
				System.out.print(stack.pop());
			else if (flag.equals("+")){
				stack.push(s);
				flag = "";
			}
		}
	}
}

public class Exercise15 {
	private static final String expression = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-";
	public static void main(String[] args) {
		Evaluator eval = new Evaluator();
		eval.evaluate(expression);
	}
}/* Output:
ctaiy us
*/
