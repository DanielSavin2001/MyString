import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 
 * @author Danie
 *
 * @immutable
 */

public class String {
	
	/**
	 * @invar | characters != null 
	 * @representationObject
	 */
	private char[] characters;

	/**
	 * @inspect | this --> om te zegggen dat het "inspecteron" zijn (getters) een
	 *          niet standaard getter is!
	 * @creates | result
	 * @post | result != null
	 */
	public char[] toCharArray() {//REPRESENTATION EXPOSURE
		return characters.clone();//  OPLOSSING
	}

	/**
	 * @inspect | this
	 * @post | result == toCharArray().length
	 */
	public int length() {
		return characters.length;
	}

	/**
	 * @inspect | this
	 * @pre | 0 <= index && index < length()
	 * @post | result == toCharArray()[index]
	 */
	public char charAt(int index) {
		return characters[index];
	}

	/**
	 * 
	 * @pre | characters != null
	 * @post | toCharArray().length == characters.length
	 * @post | IntStream.range(0,characters.length).allMatch(i -> toCharArray()[i]== characters[i])
	 * @post | Arrays.equals(toCharArray(),characters)
	 */
	public String(char[] characters) { //REPRESENTATION EXPOSURE characters kan na afgave nog aangepast worden.
		this.characters = characters.clone(); // OPLOSSING
	}

}
