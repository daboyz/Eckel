package chapter8_Interfaces;
// Exercise 13: Create an interface, and inherit two new interfaces from that interface. Multiply inherit a third interface from the second two.

interface SCSI{	//A base interface
	void read();
}
interface USB extends SCSI{	//Two new interfaces derived frome base interface
	void write();
}	
interface FireWire extends SCSI {
	void check();
}
interface Thunderbolt extends USB, FireWire{
	void parse();
}	//An interface that extends two child interfaces (level three)

class Port implements Thunderbolt{	//An implementation of the level three interface
	public void read() {}
	public void write() {}
	public void check() {}
	public void parse() {}
}
public class Exercise13 {
	
	public static void main(String[] args) {
		Port rs232 = new Port();
		rs232.read();
		rs232.write();
		rs232.parse();
		rs232.check();
	}
}