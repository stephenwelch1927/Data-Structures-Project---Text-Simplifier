package ie.gmit.sw;
import java.io.IOException;
import java.util.*;

public class Menu {
	int option;
	String word;
	private Map<String, String> map;
	Scanner in = new Scanner(System.in);
	
	//class for menu options
	public Menu(Map<String, String> map) throws IOException {
		this.map = map;
		boolean isRunning = true;
		
		//Header text
		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*             Text Simplifier V0.1                *");
		System.out.println("*       (AKA Orwellian Language Compliance)       *");		
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		System.out.println(ConsoleColour.BLACK_BOLD);
		System.out.println("Enter text to Parse or Type Quit to exit: ");
		String text = "";
		
		//While loop menu option to Parse or Quit
		while(isRunning) {
		text = in.nextLine();
			if(in.equals("Quit")||in.equals("quit")) {
				isRunning = false;
			}
			else {
				String line = getLine(text);
				System.out.println(line);
			//isRunning = false;
			}
		System.out.println(ConsoleColour.RESET);
		}
	}
	
	//Getters and setters to return Map
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	//Method that checks the map and appends through the hashMap which is O(1)
	private String getLine(String words) {
		StringBuilder sb = new StringBuilder();
		String line[] = words.split(" ");
		for (String string : line) {
			if(map.containsKey(string)) {
				sb.append("\033[0;31m" + map.get(string) + " ");
			}
			else {
				System.out.println(ConsoleColour.YELLOW);
				sb.append(string + " ");
			}
		}
		
		return sb.toString();
	}
}

