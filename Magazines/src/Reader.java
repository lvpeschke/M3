// GUILLAUME

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe permettant de lire le fichier d'entree
 * 
 * @author Group 10
 * @version October 2013
 */
public class Reader {
	
	private BufferedReader input;
	
	/**
	   * Constructeur
	   *  
	   * @pre  -
	   * @post Ouvre un fichier de sortie ou le cree s'il n'existe pas encore
	   * @exception IOException si erreur lors de l'ouverture du fichier
	   * 
	   */ 
	public Reader(String inputFile) {
		try {
			input = new BufferedReader(new FileReader(inputFile));
		} catch (IOException e) {
			System.out.print("Error related to inputfile\n");
		}
	}
	
	/**
	   * Methode permettant de lire la premiere ligne du fichier d'entree deja ouvert
	   *  
	   * @pre  ...
	   * @post ...
	   * @exception IOException ...
	   * 
	   */ 
	public String readNextLine(){
		try {
			return this.input.readLine();
		} catch (IOException e) {
			return null;
		}
	}
	
	/**
	   * Methode permettant de fermer le fichier d'entree // LE FLUX...
	   *  
	   * @pre  ...
	   * @post ...
	   * @exception IOException ...
	   * 
	   */ 
	public void close() {		
		try {
			this.input.close();
		} catch (IOException e) {
			System.out.print("Error closing inputfile\n"); // LE FLUX...
		}	
	}
}