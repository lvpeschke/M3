// SYNTYCHE

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Journals journals = new Journals("Journals.csv"); // TODO Remplacer par args[0]
		Reader reader = journals.getInput();
		
		// HashMap
		HashMap<String,Magazine> hashmap = new HashMap<String,Magazine>();
		
		String line = reader.readNextLine(); // TODO La premiere ligne faut-il la lire?
		line = reader.readNextLine();
		// TODO Cas ou il n'y a pas de ligne (pas tres realiste mais bon...)
		
		while (!line.equals("")) {
			String[] parseLine = journals.parseLine(line);
			
			Magazine magazine = new Magazine(parseLine[0],parseLine[2],parseLine[3],parseLine[4],parseLine[5],parseLine[6],parseLine[7]);
			// TODO si rien d'utile a stocker dedans...
			
			hashmap.put(parseLine[1], magazine);

			line = reader.readNextLine();

			if (line == null)
				break;
			while (line.equals("")) { 
				line = reader.readNextLine();
				if (line == null)
					break;
			}
		}
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter title magazine");
		System.out.println("Enter q to stop");
		
		String title;
		title = in.nextLine();
		while (!title.equals("q")) {
			Magazine magazine = (Magazine) hashmap.get((String) title);
			if (magazine == null) {
				System.out.println("Your magazine hasn't been found");
			}
			else {
				System.out.println(magazine.toString());
			}
			title = in.nextLine();
		}
		
		in.close();
		reader.close();
	}
}
