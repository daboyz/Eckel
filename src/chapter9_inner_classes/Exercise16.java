package chapter9_inner_classes;
// Exercise 16: Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes.

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
	public static CycleFactory factory =
		new CycleFactory() {
			public Cycle getCycle() {
				return new Unicycle();
			}
		};
}

class Bicycle implements Cycle{
	public void ride(){
		System.out.println("Riding Bi");
	}
	public static CycleFactory factory =
			new CycleFactory() {
				public Cycle getCycle() {
					return new Bicycle();
				}
		};
}

class Tricycle implements Cycle{
	public void ride(){
		System.out.println("Riding Tri");
	}
	public static CycleFactory factory =
			new CycleFactory() {
				public Cycle getCycle() {
					return new Tricycle();
				}
		};
}


public class Exercise16 {
	public static void rideCycle(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		rideCycle(Unicycle.factory);
		rideCycle(Bicycle.factory);
		rideCycle(Tricycle.factory);
	}
}/* Output:
Riding Uni
Riding Bi
Riding Tri
*/