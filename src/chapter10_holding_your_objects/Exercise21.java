package chapter10_holding_your_objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;

/* Exercise 21: Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program 
 * that counts the occurrence of words in a file. Sort the results using Collections.sort( ) with a 
 * second argument of String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.
 */

class WordCounter {
	HashMap<String, Integer> words = new HashMap<String, Integer>();
	static String file = "C:\\UniqueWords.txt";

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

	public void wordCounter() throws IOException {
		int totalcountintext;
		for(String s : readFile().split(" ")){
				if (this.words.containsKey(s)){
					totalcountintext = words.get(s);
					words.remove(s);
					words.put(s, ++totalcountintext);
					} else{
						words.put(s, 1);
					}
		}
		System.out.println("The count for each word in file \"" + file + "\" is " + words);
	}
}


public class Exercise21 {
	public static void main(String[] args) throws IOException{
		WordCounter wc = new WordCounter();
		wc.wordCounter();
	}
}/*Output:
The count for each word in file "C:\UniqueWords.txt" is {cut,=1, they=3, shapely,=1, for=5, no=4, blemish=1, colour=1, of=2, ancient=1, on=1, green,=1, others=1, heart=1, once=1, endured=1, or=3, he=4, them=2, saw=2, language=1, upon=3, A=1, moment=1, made=1, clear=1, deformity=1, The=1, could=2, grew=1, ever.=1, spring.=1, gold=1, stood=1, stepped=1, a=2, seen=1, No=1, new=1, On=1, down=1, to=1, but=4, All=1, him=1, conceived=1, been=1, were=1, fragrant=1, his=2, light=1, He=1, had=5, be=1, white=1, here=1, world.=1, stain.=1, wonderful.=1, shapes=1, and=8, that=5, awhile=1, winter=1, window=1, cast=1, names=1, Lorien,=1, sickness=1, lost=1, In=1, land=1, grass,=1, through=1, perceived=1, It=1, was=3, vanished=1, fresh=1, if=3, seemed=2, uncovering=1, knew,=1, drawn=1, those=1, it=1, poignant,=1, at=3, as=3, still=1, mourn=1, the=5, earth.=1, in=2, Frodo=1, eyes,=1, anything=1, which=1, looked=1, blue=1, there=1, name.=1, summer=1, high=1, wonder.=1, themselves=1, first=2}
*/