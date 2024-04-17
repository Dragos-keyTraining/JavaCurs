package curs12;

import java.util.Scanner;

/*
 * Facem un program care cauta pe baza unui cod postal si printeaza
 * orasul aferent codului
 * avem o clasa care inca de la intializarea obiectului initializeaza o
 * serie de coduri postale si orase
 * avem o functionalitate care cauta pe baza codului si printeaza orasul:
 * daca codul postal nu exista arunc o exceptie : PostalCodeException
 * si intreb din nou utilizatorul pana primesc cod corect
 * 
 * 
 */
public class SearchPostalCode {

	public static void main(String[] args) throws PostalCodeException {
		Scanner scan = new Scanner(System.in);
		CoduriPostale cp =  new CoduriPostale();
		//System.out.println(cp.map);
		
		System.out.println("Introdu un cod postal: ");
		int codPostal =  scan.nextInt();
		
		System.out.println(cp.gasesteOras(codPostal));
		
		
	}

}
