package chapter7_Polymorphism;
/* Exercise 16: Following the example in Transmogrify.java, create a Starship class containing an 
AlertStatus reference that can indicate three different states. Include methods to change the states.
*/
class AlertStatus{
	public void display(){
	}
}
class AlertStatusIdle extends AlertStatus{
	public void display(){
		System.out.println("Idle Display");
	}
}
class AlertStatusWarning extends AlertStatus{
	public void display(){
		System.out.println("Warning Display");
	}
}
class AlertStatusActive extends AlertStatus{
	public void display(){
		System.out.println("Active Display");
	}
}
class Starship{
	AlertStatus alert = new AlertStatusIdle();
	public void switchDisplayIdle(){
		alert = new AlertStatusIdle();
	}
	public void switchDisplayWarning(){
		alert = new AlertStatusWarning();
	}
	public void switchDisplayActive(){
		alert = new AlertStatusActive();
	}
	public void showPanel(){
		alert.display();
	}
}

public class Exercise16 {
	public static void main(String[] args) {
		Starship enterprise = new Starship();
		enterprise.showPanel();
		enterprise.switchDisplayActive();
		enterprise.showPanel();
		enterprise.switchDisplayWarning();
		enterprise.showPanel();
	}
}/* Output:
Idle Display
Active Display
Warning Display
*/
