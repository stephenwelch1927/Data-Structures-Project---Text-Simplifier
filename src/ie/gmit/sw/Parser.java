package ie.gmit.sw;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Parser {
	
	//Using a hashmap is O(1) takes a constant time will always perform same number of operations regardless of input size
	Map<String, String> map = new HashMap<String, String>();//Declare a map for Thesaurus
	Map<String, String> google = new HashMap<String, String>();//Declare a map for google 1000 words
	
	//Method To read in Google words and Map to itself
	public void readInGoogle(String file) {
		BufferedReader br = null;
		
		String line;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				String words[] =line.split(" ");
				String key = words[0];
				String value = words[0];
				map.put(key, value);
			}
			br.close();
		}catch (IOException e) {
			System.out.println("Sorry error reading in your file");
		}
		
	}
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	//Method to read in the thesaurus
	public void readInThesaurus(String file) throws IOException{
	
	String line;
		
	try { 
		BufferedReader mr = null;
		mr = new BufferedReader(new FileReader(file)); 
		
		while((line = mr.readLine()) != null) {
			String[] values = line.split(",");
			map.put(values[0], values[1]);
		}
		mr.close();
		
	}catch (IOException e) {
		System.out.println("Sorry error reading in your file");
	}
		
 }

	}
