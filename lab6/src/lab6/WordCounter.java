package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The WordCounter class have several method to add sentences and word in map
 * word to count their occurrence the prints the output.
 */
public class WordCounter {

	/**
	 * Maps words to their occurrence count.
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();

	/**
	 * to count my occurrence in wordMap
	 * 
	 * @param word occurrence
	 */
	public void addWord(String word) {
		if (wordMap.containsKey(word)) {
//			wordMap.put(word, 1);
			int count = wordMap.get(word);
			wordMap.put(word, count + 1);
		} else {
			wordMap.put(word, 1);
		}

	}
/**
 * add sentence split by ' ' and pass to addWord method
 * @param sentence store sentence pass in parameter
 */
	public void addSentence(String sentence) {

		String words[] = sentence.split(" ");
		for (String word : words) {
			addWord(word.toLowerCase());

		}

	}

	/**
	 * print the value store in wordMap
	 */
	public void outputResult() {
		for (Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
