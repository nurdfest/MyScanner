import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jess Cade
 *
 */
public class MyScanner {

	/**
	 * 
	 */
	private ArrayList<String> ids;
	private ArrayList<String> ints;
	private ArrayList<String> floats;
	private ArrayList<String> relOps;
	private String inputString;
	
	/**
	 * @param input
	 */
	public MyScanner(String s) {
		
		inputString = s;
		processInput();
	}

	public void processInput() {
		
		checkIds();
	}
	
	public void checkIds() {
		int startIndex = 0;
		int endIndex = 0;
		String dummyString;
		
		ids = new ArrayList<String>();
		
		Pattern readIds = Pattern.compile("\\b[a-zA-Z]+\\b");
		Matcher m = readIds.matcher(inputString);
		
		while (m.find()) {
			startIndex = m.start();
			endIndex = m.end();
			
			dummyString = inputString.substring(startIndex, endIndex);
			ids.add(dummyString);
		}
	}
	
	/**
	 * @return the ids
	 */
	public String getIds() {
		String idString = null;
		
		return idString;
	}

	/**
	 * @return the ints
	 */
	public String getInts() {
		String intString = null;
		
		return intString;
	}

	/**
	 * @return the floats
	 */
	public String getFloats() {
		String floatString = null;
		
		return floatString;
	}

	/**
	 * @return the relOps
	 */
	public String getRelOps() {
		String relString = null;
		
		return relString;
	}
}
