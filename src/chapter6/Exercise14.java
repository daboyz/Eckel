package chapter6;
// Exercise 14: In Car.java add a service( ) method to Engine and call this method in main( ).
class Engine {
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service(){} //Added service() method
}
class Wheel {
	public void inflate(int psi) {}
}
class Window {
	public void rollup() {}
	public void rolldown() {}
}
class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}
class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door
		left = new Door(),
		right = new Door(); // 2-door
	public Car() {
		for(int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}
}

public class Exercise14 {
	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();  //Called car.engine.service() method in main
		}
}
