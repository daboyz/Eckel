package chapter1;

public class Exercise9 {
	public void main(String[] args){
		
		Boolean bl = new Boolean(false);
		boolean b = bl;
		System.out.println(b + " and " + bl + " live happily ever after");
		
		Character ch = new Character('x');
		char c = ch;
		System.out.println(c + " and " + ch + " live happily ever after");
		
		Byte bt = new Byte((byte) 1); //Didn't know how to get rid of warning here except for using conversion of "1" into primitive
		byte bb = 1;
		System.out.println(bb + " and " + bt + " live happily ever after");
		
		Short sh = new Short((short) 2); //Didn't know how to get rid of warning here except for using conversion of "2" into primitive
		short s = sh;
		System.out.println(s + " and " + sh + " live happily ever after");
		
		Integer in = new Integer(3);
		int i = in;
		System.out.println(i + " and " + in + " live happily ever after");
		
		Long lo = new Long(686);
		long l = lo;
		System.out.println(l + " and " + lo + " live happily ever after");
		
		Float fl = new Float(2.13);
		float f = fl;
		System.out.println(f + " and " + fl + " live happily ever after");
		
		Double db = new Double('x');
		double d = db;
		System.out.println(d + " and " + db + " live happily ever after");
			
	}
}