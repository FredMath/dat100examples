package no.hib.dat100;

import java.util.Calendar;

public class Person {

	// Feltvariabler deklarert i Person
	private String navn;
	private int fodselsaar;

	// Konstrukt�rer for Person
	public Person(String n, int f) {
		setNavn(n);
		setFodselsaar(f);
	}

	// Hent- og settmetoder for Person
	public String getNavn() {
		return navn;
	}

	public void setNavn(String n) {
		navn = n;
	}

	public int getFodselsaar() {
		return fodselsaar;
	}

	public void setFodselsaar(int f) {
		fodselsaar = f;
	}

	// Forretningsmetoder for Person
	public int beregnAlder() {

		Calendar naa = Calendar.getInstance();
		int iAar = naa.get(Calendar.YEAR);

		return iAar - fodselsaar;
	}

	public String info() {
		return "Navn: " + navn + " - F�dsels�r: " + fodselsaar;
	}

	// Overkj�ring av toString() og equals()

	@Override
	public String toString() {
		return "Navn: " + navn + " - F�dsels�r: " + fodselsaar;
	}

	@Override
	public boolean equals(Object other) {

		if (other == null || !(other instanceof Person)) {
			return false;
		}
		Person p = (Person) other;

		return (navn.equals(p.navn) && fodselsaar == p.fodselsaar);
	}

}
