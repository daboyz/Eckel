package chapter9_inner_classes;
// Exercise 14: Modify interfaces/HorrorShow.java to implement DangerousMonster and Vampire using anonymous classes.

interface Monster {
	void menace();
}
interface DangerousMonster extends Monster {
	void destroy();
}
interface Lethal {
	void kill();
}
class DragonZilla{
	DangerousMonster dangerousMonster(){		//Anon class method
		return new DangerousMonster(){
			public void menace() {}
			public void destroy() {}
		};
	}
	
}
interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}
class VeryBadVampire {
	Vampire vampire(){						//Anon class method
		return new Vampire(){
			public void menace() {}
			public void destroy() {}
			public void kill() {}
			public void drinkBlood() {}
		};
	}
}

public class Exercise14 {
	static void u(Monster b) { b.menace(); }
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) { l.kill(); }
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla().dangerousMonster(); //A method call has to be added
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire().vampire();					//A method call has to be added
		u(vlad);
		v(vlad);
		w(vlad);
	}
}