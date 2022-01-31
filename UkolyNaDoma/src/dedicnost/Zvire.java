package dedicnost;

public class Zvire {

	double datNarozeni;
	int casKrmeni;
	int pocetKrmeniZaDen;
	String jmeno;
	boolean zijuVCesku;
	
	Zvire (int datNarozeni, String jmeno, boolean zijuVCesku) {
		this.datNarozeni = datNarozeni;
		this.jmeno = jmeno;
		this.zijuVCesku = zijuVCesku;
	}
	
	public void vypisInfo() {
		System.out.println("Zvíøe se narodilo " + datNarozeni + ", jmenuje se " + jmeno + ", žije v èesku: " + zijuVCesku);
	}

	public double getDatNarozeni() {
		return datNarozeni;
	}

	public int getCasKrmeni() {
		return casKrmeni;
	}

	public void setCasKrmeni(int casKrmeni) {
		this.casKrmeni = casKrmeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}
	
}
