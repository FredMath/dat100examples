package no.hib.dat100;

/* FinnOrdIFil.java
*
* Programmet leser inn et filnavn og et s�keord
* fra brukeren, og skriver ut alle de linjene i
* filen som inneholder s�keordet, p�f�rt linjenr.
*/
import java.io.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class FinnOrdiFil {
	
	public static void main(String[] args) {
		
		String filnavn = showInputDialog("Filnavn:");
		String s�keord = showInputDialog("S�keord:");
		
		try {
			
			BufferedReader fil = new BufferedReader(new FileReader(filnavn));
			String linje = fil.readLine();
			int linjenr = 1;
			
			while (linje != null) {
				if (linje.contains(s�keord))
					out.println(linjenr + ":" + linje);
				linje = fil.readLine();
				linjenr = linjenr + 1;
			}
			
			fil.close();
			
		} catch (Exception e) {
			out.println("Problem med " + filnavn);
		}
	}
}