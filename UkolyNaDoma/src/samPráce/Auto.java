package samPráce;

public class Auto {
	String znacka;
	String barvaVozu;
	int pocetOprav;
	int rokVyroby;
	public void oprava() {
		pocetOprav++;
		System.out.println(pocetOprav);
	}
	public void vypisInformace() {
			System.out.println("Znaèka vozu je " + znacka + ", rok výroby je " + rokVyroby + ", barva vozu je " + barvaVozu + " a poèet oprav vozu je " + pocetOprav); 
		}
}
