package no.hib.dat100.modell;

import java.util.ArrayList;

/**
 * Basisklasse for representasjon av eiendommer.
 * @author Lars Kristensen
 * @version 1.0
 */

public abstract class Eiendom {

	private int gns;
	private int bns;

	private ArrayList<Eier> eiere;
	
	private static int MAX_NABOER = 4;
	private Eiendom[] naboer;

	/**
	 * Konstruer Eiendoms objekt.
	 * @param gns Gaardsnummer
	 * @param bns Bruksnummer
	 */
	public Eiendom(int gns, int bns) {
		this.gns = gns;
		this.bns = bns;
		naboer = new Eiendom[MAX_NABOER]; 
		eiere = new ArrayList<Eier>();
	}

	/**
	 * Hent gaardsnummer for eiendom.
	 * @return Gaardsnummer
	 */
	public int getGns() {
		return gns;
	}

	/**
	 * Hent bruksnummer for eiendom.
	 * @return Bruksnummer
	 */
	public int getBns() {
		return bns;
	}

	/**
	 * Register en ny eier paa eiendommen (legges til).
	 * @param nyeier Eier som skal registreres paa eiendom
	 */
	public void registrerEier(Eier nyeier) {
		eiere.add(nyeier);
	}

	
	/**
	 * Registrer en eiendom som nabo.
	 * @param naboeiendom eiendom som skal registreres som eiendom
	 * @return blev nabo registret (max 4 naboer per eiendom)
	 */
	public boolean registrerNabo(Eiendom naboeiendom) {
		boolean sattinn = false;

		// sjekk om nabo eiendom finnes allerede
		for (Eiendom eiendom : naboer)
			sattinn = (naboeiendom.equals(eiendom)); 

		// sett inn hvis plass - OVERVEI bruk tabell med eksplisitt antall
		if (!sattinn) {
			
			int i = 0;
			while ((!sattinn) && i < MAX_NABOER) {
				if (naboer[i] == null) {
					naboer[i] = naboeiendom;
					sattinn = true;
				}
				i++;
			}
		}

		return sattinn;
	}
	
	/**
	 * Hent eiere for eiendommen.
	 * @return listen av eiere pa eiendommen
	 */
	public ArrayList<Eier> getEiere() {
		return eiere;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bns;
		result = prime * result + gns;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eiendom other = (Eiendom) obj;
		if (bns != other.bns)
			return false;
		if (gns != other.gns)
			return false;
		return true;
	}
	
	
}
