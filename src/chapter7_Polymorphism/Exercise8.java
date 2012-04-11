package chapter7_Polymorphism;

import java.util.Random;

// Exercise 8: Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.

class RandomInstrumentGenerator {		//An instrument generator
	private Random rand = new Random(47);
	public Instrument next() {
		switch(rand.nextInt(6)) {
			default:
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Brass();
			case 4: return new Woodwind();
			case 5: return new Choir();
		}
	}
}

public class Exercise8 {
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	
	public static void main(String[] args) {
		Instrument[] inst = new Instrument[9]; //Array creation
		for(int i = 0; i < inst.length; i++)   //Array population
			inst[i] = gen.next();
		for(Instrument i : inst){				//Array manipulation :) Could be also done with tuneAll/printAll methods
			Exercise6.tune(i);
			System.out.println(i);
			}
	}
}
