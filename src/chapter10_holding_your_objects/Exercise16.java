package chapter10_holding_your_objects;

import java.awt.List;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Exercise 16: Create a Set of the vowels. Working from UniqueWords.Java, count and display 
 * the number of vowels in each input word, and also display the total number of vowels in the input file.
 */

class VowelsChecker {
	Set<String> vowels = new HashSet<String>();
	static String file = "C:\\UniqueWords.txt";
	int totalcount = 0;
	public VowelsChecker() {
		Collections.addAll(vowels, "A E I O U Y a e i o u y".split(" "));
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
		for(String s : readFile().split(" ")){
			int inwordcount = 0;
			for (String c : s.split("")){
				if (this.vowels.contains(c)){
					inwordcount++;
				}
				
			}
			System.out.println("Vowels count in word \"" + s + "\" is " + inwordcount);
			totalcount = totalcount + inwordcount;
		}
		System.out.println("Total number of vowels in file \"" + file + "\" is " + totalcount);
	}
}

public class Exercise16 {
	public static void main(String[] args) throws IOException {
		VowelsChecker vc = new VowelsChecker();
		vc.vowelCounter();
	}
}/* Output:
Vowels count in word "The" is 1
Vowels count in word "others" is 2
Vowels count in word "cast" is 1
Vowels count in word "themselves" is 3
Vowels count in word "down" is 1
Vowels count in word "upon" is 2
Vowels count in word "the" is 1
Vowels count in word "fragrant" is 2
Vowels count in word "grass," is 1
Vowels count in word "but" is 1
Vowels count in word "Frodo" is 2
Vowels count in word "stood" is 2
Vowels count in word "awhile" is 3
Vowels count in word "still" is 1
Vowels count in word "lost" is 1
Vowels count in word "in" is 1
Vowels count in word "wonder." is 2
Vowels count in word "It" is 1
Vowels count in word "seemed" is 3
Vowels count in word "to" is 1
Vowels count in word "him" is 1
Vowels count in word "that" is 1
Vowels count in word "he" is 1
Vowels count in word "had" is 1
Vowels count in word "stepped" is 2
Vowels count in word "through" is 2
Vowels count in word "a" is 1
Vowels count in word "high" is 1
Vowels count in word "window" is 2
Vowels count in word "that" is 1
Vowels count in word "looked" is 3
Vowels count in word "on" is 1
Vowels count in word "a" is 1
Vowels count in word "vanished" is 3
Vowels count in word "world." is 1
Vowels count in word "A" is 1
Vowels count in word "light" is 1
Vowels count in word "was" is 1
Vowels count in word "upon" is 2
Vowels count in word "it" is 1
Vowels count in word "for" is 1
Vowels count in word "which" is 1
Vowels count in word "his" is 1
Vowels count in word "language" is 4
Vowels count in word "had" is 1
Vowels count in word "no" is 1
Vowels count in word "name." is 2
Vowels count in word "All" is 1
Vowels count in word "that" is 1
Vowels count in word "he" is 1
Vowels count in word "saw" is 1
Vowels count in word "was" is 1
Vowels count in word "shapely," is 3
Vowels count in word "but" is 1
Vowels count in word "the" is 1
Vowels count in word "shapes" is 2
Vowels count in word "seemed" is 3
Vowels count in word "at" is 1
Vowels count in word "once" is 2
Vowels count in word "clear" is 2
Vowels count in word "cut," is 1
Vowels count in word "as" is 1
Vowels count in word "if" is 1
Vowels count in word "they" is 2
Vowels count in word "had" is 1
Vowels count in word "been" is 2
Vowels count in word "first" is 1
Vowels count in word "conceived" is 4
Vowels count in word "and" is 1
Vowels count in word "drawn" is 1
Vowels count in word "at" is 1
Vowels count in word "the" is 1
Vowels count in word "uncovering" is 4
Vowels count in word "of" is 1
Vowels count in word "his" is 1
Vowels count in word "eyes," is 3
Vowels count in word "and" is 1
Vowels count in word "ancient" is 3
Vowels count in word "as" is 1
Vowels count in word "if" is 1
Vowels count in word "they" is 2
Vowels count in word "had" is 1
Vowels count in word "endured" is 3
Vowels count in word "for" is 1
Vowels count in word "ever." is 2
Vowels count in word "He" is 1
Vowels count in word "saw" is 1
Vowels count in word "no" is 1
Vowels count in word "colour" is 3
Vowels count in word "but" is 1
Vowels count in word "those" is 2
Vowels count in word "he" is 1
Vowels count in word "knew," is 1
Vowels count in word "gold" is 1
Vowels count in word "and" is 1
Vowels count in word "white" is 2
Vowels count in word "and" is 1
Vowels count in word "blue" is 2
Vowels count in word "and" is 1
Vowels count in word "green," is 2
Vowels count in word "but" is 1
Vowels count in word "they" is 2
Vowels count in word "were" is 2
Vowels count in word "fresh" is 1
Vowels count in word "and" is 1
Vowels count in word "poignant," is 3
Vowels count in word "as" is 1
Vowels count in word "if" is 1
Vowels count in word "he" is 1
Vowels count in word "had" is 1
Vowels count in word "at" is 1
Vowels count in word "that" is 1
Vowels count in word "moment" is 2
Vowels count in word "first" is 1
Vowels count in word "perceived" is 4
Vowels count in word "them" is 1
Vowels count in word "and" is 1
Vowels count in word "made" is 2
Vowels count in word "for" is 1
Vowels count in word "them" is 1
Vowels count in word "names" is 2
Vowels count in word "new" is 1
Vowels count in word "and" is 1
Vowels count in word "wonderful." is 3
Vowels count in word "In" is 1
Vowels count in word "winter" is 2
Vowels count in word "here" is 2
Vowels count in word "no" is 1
Vowels count in word "heart" is 2
Vowels count in word "could" is 2
Vowels count in word "mourn" is 2
Vowels count in word "for" is 1
Vowels count in word "summer" is 2
Vowels count in word "or" is 1
Vowels count in word "for" is 1
Vowels count in word "spring." is 1
Vowels count in word "No" is 1
Vowels count in word "blemish" is 2
Vowels count in word "or" is 1
Vowels count in word "sickness" is 2
Vowels count in word "or" is 1
Vowels count in word "deformity" is 4
Vowels count in word "could" is 2
Vowels count in word "be" is 1
Vowels count in word "seen" is 2
Vowels count in word "in" is 1
Vowels count in word "anything" is 3
Vowels count in word "that" is 1
Vowels count in word "grew" is 1
Vowels count in word "upon" is 2
Vowels count in word "the" is 1
Vowels count in word "earth." is 2
Vowels count in word "On" is 1
Vowels count in word "the" is 1
Vowels count in word "land" is 1
Vowels count in word "of" is 1
Vowels count in word "Lorien," is 3
Vowels count in word "there" is 2
Vowels count in word "was" is 1
Vowels count in word "no" is 1
Vowels count in word "stain." is 2
Total number of vowels in file "C:\UniqueWords.txt" is 247

*/
