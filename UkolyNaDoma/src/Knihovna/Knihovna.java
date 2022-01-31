package Knihovna;

public class Knihovna {

	private int pocetKnih;
	private String mesto; 
	private String majitel;
	private int registrovani;
	private String nazev;
	private int stavKonta;
	private int cenaZaJednuKnihu = 100;
	
	
	Knihovna (String nazev, String mesto, String majitel, int stavKonta) {
		this.majitel = majitel;
		this.mesto = mesto;
		this.nazev = nazev;
		this.pocetKnih = 0;
		this.registrovani = 0;
		this.stavKonta = stavKonta;
	}
	
	Knihovna (String nazev, int stavKonta) {
		this.nazev = nazev;
		this.stavKonta = stavKonta;
	}
	
	public int getStavKonta () {
		return stavKonta;
	}
	
	public int getPocetKnih (int pocetKnih) {
		return pocetKnih;
	}
	public String getMesto (String mesto) {
		return mesto;
	}
	public String getMajitel (String majitel) {
		return majitel;
	}
	public int getRegistrovani (int registrovani) {
		return registrovani;
	}
	public String getNazev (String nazev) {
		return nazev;
	}
	
	public void dodavkaKnih (int pocetKnih) {
		this.pocetKnih = this.pocetKnih + pocetKnih;
		this.stavKonta = stavKonta - cenaZaJednuKnihu * pocetKnih;
	}
	
	public void registraceCtenare () {
		registrovani = registrovani + 1;
		stavKonta = stavKonta + 200;
	}
	
	public void vypisInformace () {
		System.out.println ("Knihovna se jmenuje " + nazev + ", je ve mìstì " + mesto + ", její majitel je " + majitel + ", je zde " + pocetKnih + " knih a ètenáøù je " + registrovani + ", stav konta je " + stavKonta);
	}
}
