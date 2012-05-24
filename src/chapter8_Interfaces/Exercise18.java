package chapter8_Interfaces;
// Exercise 18: Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
interface Cycle{
	void ride();
}
interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(){
		System.out.println("Riding Uni");
	}
}
class UniFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}

class Bicycle implements Cycle{
	public void ride(){
		System.out.println("Riding Bi");
	}
}
class BiFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class Tricycle implements Cycle{
	public void ride(){
		System.out.println("Riding Tri");
	}
}
class TriFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}

public class Exercise18 {
	public static void rideCycle(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		rideCycle(new UniFactory());
		rideCycle(new BiFactory());
		rideCycle(new TriFactory());
	}
}/* Output:
Riding Uni
Riding Bi
Riding Tri
*/