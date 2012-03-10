package chapter3;
/* Exercise 7: Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.
 * 
 * public static void main(String[] args){
 *		for (int i=1; i<101; i++)
 *			System.out.println(i);
 */

public class Exercise7 {
	public static void cycle(){
		int i=1;
		while (true){
			System.out.println(i);
			if (i==99) break;
			i++;
		    }
		}
	public static void cycleRet(){
		int i=1;
		while (true){
			System.out.println(i);
			if (i==99) return;
			i++;
		    }
		}
	public static void main(String[] args){
		cycle();
		cycleRet();
	}
}
