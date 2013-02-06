package chapter10_holding_your_objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
// Exercise 20: Modify Exercise 16 so that you keep a count of the occurrence of each vowel.

class VowelChecker {
	HashMap<String, Integer> vowels = new HashMap<String, Integer>();
	static String file = "C:\\UniqueWords.txt";
	public VowelChecker() {
		vowels.put("A", 0);
		vowels.put("E", 0);
		vowels.put("I", 0);
		vowels.put("O", 0);
		vowels.put("U", 0);
		vowels.put("Y", 0);
		vowels.put("a", 0);
		vowels.put("e", 0);
		vowels.put("i", 0);
		vowels.put("o", 0);
		vowels.put("u", 0);
		vowels.put("y", 0);
       
	}

	private static String readFile() throws IOException {
		FileInputStream stream = new FileInputStream(file);
		try {
       	    FileChannel fc = stream.getChannel();
            MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
           return Charset.defaultCharset().decode(bb).toString();     
          }
       	  finally {
       	    stream.close();
          }	
	}

	public void vowelCounter() throws IOException {
		int totalcountintext;
		for(String s : readFile().split(" ")){
			for (String c : s.split("")){
				if (this.vowels.containsKey(c)){
					totalcountintext = vowels.get(c);
					vowels.remove(c);
					vowels.put(c, ++totalcountintext);
				}
				
			}
		}
		System.out.println("Total number of each vowel in file \"" + file + "\" is " + vowels);
	}
}

public class Exercise20 {
	public static void main(String[] args) throws IOException {
		VowelChecker vc = new VowelChecker();
		vc.vowelCounter();
	}
}/* Output:
Total number of each vowel in file "C:\UniqueWords.txt" is {U=0, E=0, u=19, e=83, A=2, a=53, o=48, O=1, Y=0, I=2, y=7, i=32}
*/