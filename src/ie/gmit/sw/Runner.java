package ie.gmit.sw;
import java.util.Scanner;
public class Runner {

	public static void main(String[] args) throws Exception {
		
		//Methods and classes called and instantiated	
		Parser parser = new Parser();
		parser.readInGoogle("./google-1000.txt");
		parser.readInThesaurus("./MobyThesaurus2.txt");
		new Menu(parser.getMap());
	}
}