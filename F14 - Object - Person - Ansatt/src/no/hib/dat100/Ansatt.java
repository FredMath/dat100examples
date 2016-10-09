package no.hib.dat100;

public class Ansatt extends Person {
	private int ansattNr;
	private int l�nstrinn;

	public Ansatt(String namn, int fAar, int aNr, int lt) {
		super(namn, fAar);
		ansattNr = aNr;
		l�nstrinn = lt;
	}

	public void settAnsattNr(int aNr) {
		ansattNr = aNr;
	}

	public void settL�nstrinn(int lt) {
		l�nstrinn = lt;
	}

	public int hentAnsattNr() {
		return ansattNr;
	}

	public int hentL�nstrinn() {
		return l�nstrinn;
	}

	public int beregnMaanedslonn() {
		return 20000 + l�nstrinn * 200;
	}

	public String toString() {
		return super.toString() + " - " + "Ansattnr: " + ansattNr + " - " + "L�nstrinn: " + l�nstrinn;
	}
}
