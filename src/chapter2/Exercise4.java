package chapter2;
class Vehicle{
	float t,d,v;
}
public class Exercise4 {
	public static void main(String[] args){
		Vehicle tdi = new Vehicle();
		tdi.d = 55;
		tdi.t = 5;
		tdi.v = tdi.d / tdi.t;
		System.out.println("Behold the velocity of " + tdi.v + " miles per hour");
	}
	
}
