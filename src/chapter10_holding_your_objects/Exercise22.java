package chapter10_holding_your_objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Exercise 22: Modify the previous exercise so that it uses a class containing a String and a count field 
 * to store each different word, and a Set of these objects to maintain the list of words.
 */
class WordCounterClass {
	
	private class Container{
		String word;
		int wcount;
		private Container(String s, int i){
			this.word = s;
			this.wcount = i;
		}
		public String toString(){
			return word + " = " + wcount;
		}
	}
	
	Set<Container> words = new HashSet<Container>();
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
		Iterator<Container> iterator;
		Container temp;
		for(String s : readFile().split(" ")){
			iterator = words.iterator();
			if (!iterator.hasNext())
				words.add(new Container(s, 1));
			else
			while(iterator.hasNext()){
				temp = iterator.next();
				if (temp.word.equals(s)){
					totalcountintext = temp.wcount;
					words.remove(temp);
					words.add(new Container(s, ++totalcountintext));
					}
				else 
					words.add(new Container(s, 1));
			}			
		}
		
		System.out.println("The count for each word in file \"" + file + "\" is " + words);
	}
}


public class Exercise22 {
	public static void main(String[] args) throws IOException{
		WordCounterClass wcc = new WordCounterClass();
		wcc.wordCounter();
	}
}/*Output:

*/