package chapter3;
/* Exercise 10: A vampire number has an even number of digits and is formed by multiplying a
 * pair of numbers containing half the number of digits of the result. 
 * The digits are taken from the original number in any order. Pairs of trailing zeroes are not allowed. Examples include:
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers.
 */
public class Exercise10 {
	public static void main(String[] args){
		for (int i=100; i<10000; i++){
				int i1 = i/1000, i2 = (i%1000)/100, i3 = (i%1000)%100/10, i4 = ((i%1000)%100)%10;
				if ((i1*10+i2)*(i3*10+i4)==i) System.out.println(i + " = " + i1 + i2 + " * " + i3 + i4);
				else if ((i2*10+i1)*(i3*10+i4)==i) System.out.println(i + " = " + i1 + i2 + " * " + i3 + i4);
				else if ((i2*10+i1)*(i3*10+i4)==i) System.out.println(i + " = " + i2 + i1 + " * " + i3 + i4);
				else if ((i1*10+i2)*(i4*10+i3)==i) System.out.println(i + " = " + i1 + i2 + " * " + i4 + i3);
				else if ((i2*10+i1)*(i4*10+i3)==i) System.out.println(i + " = " + i2 + i1 + " * " + i4 + i3);
				else if ((i2*10+i1)*(i4*10+i3)==i) System.out.println(i + " = " + i2 + i1 + " * " + i3 + i4);
				else if ((i3*10+i2)*(i1*10+i4)==i) System.out.println(i + " = " + i3 + i2 + " * " + i1 + i4);
				else if ((i3*10+i2)*(i1*10+i4)==i) System.out.println(i + " = " + i3 + i2 + " * " + i1 + i4);
				else if ((i3*10+i1)*(i2*10+i4)==i) System.out.println(i + " = " + i3 + i1 + " * " + i2 + i4);
				else if ((i3*10+i1)*(i4*10+i2)==i) System.out.println(i + " = " + i3 + i1 + " * " + i4 + i2);
				else if ((i4*10+i3)*(i2*10+i1)==i) System.out.println(i + " = " + i4 + i3 + " * " + i2 + i1);
				else if ((i4*10+i3)*(i1*10+i2)==i) System.out.println(i + " = " + i4 + i3 + " * " + i1 + i2);
				else if ((i3*10+i4)*(i1*10+i2)==i) System.out.println(i + " = " + i3 + i4 + " * " + i1 + i2);
				else if ((i3*10+i4)*(i2*10+i1)==i) System.out.println(i + " = " + i3 + i4 + " * " + i2 + i1);
				}
		 } 
	} 