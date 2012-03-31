package chapter6;
// Exercise 20: Show that @Override annotation solves the problem in this section.
class WithFinals {
	private final void f() { System.out.println("WithFinals.f()"); }
	private void g() { System.out.println("WithFinals.g()"); }
}
	
class OverridingPrivate extends WithFinals {
	//@Override 
	private final void f() {				//With "@Override" notation compiler warns that the method does not override super method
		System.out.println("OverridingPrivate.f()");
	}
	//@Override
	private void g() {
		System.out.println("OverridingPrivate.g()");
	} 
}
class OverridingPrivate2 extends OverridingPrivate {
	//@Override 
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	//@Override 
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}
class FinalOverridingIllusion {

} 
public class Exercise20 {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can’t call the methods:
		//! op.f();
		//! op.g();
		// Same here:
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
	}
}/* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~