// LENA

public class Journals {
	
	private Reader input; 
	
	public Journals(String inputFile) {
		input= new Reader(inputFile);
	}
	
	public Reader getInput() {
		return input;
	}
	
	public String[] parseLine(String line) { // TODO Cette fonction peut etre amelioree!
		
		String[] parseLine = new String[8]; 

		int i;
		for (i=0; i<7;i++) {
			
			int index1 = line.indexOf('"');
			int index2 = line.indexOf(',');
			
			if (index1 < index2 && index1 >= 0) { //TODO
				
				parseLine[i] = line.substring(0,index1 + 1);
				line = line.substring(index1 + 1);
				
				if (line.indexOf('"') < index2) { // Exemple: ...,"Text""Text",...
					// TODO
					index2 = line.indexOf(',');
					parseLine[i] = parseLine[i].concat(line.substring(0,index2));
					line = line.substring(index2+1);
				}
				
				else { // Exemple: ...,"Text,Text",...
					index1 = line.indexOf('"');
					parseLine[i]= parseLine[i].concat(line.substring(0,index1+1));
					line = line.substring(index1+2);
				}

			}
			else {
				if (index2 == -1) { // Moins de 8 champs
					for (;i<8;i++)
						parseLine[i] = "";
					return parseLine;
				}
				
				parseLine[i] = line.substring(0,index2); 
				line = line.substring(index2+1);
			}
		}
		
		parseLine[7] = line;
		
		return parseLine;
	}
}
