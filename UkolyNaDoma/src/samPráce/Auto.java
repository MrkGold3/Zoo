package samPr�ce;

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
			System.out.println("Zna�ka vozu je " + znacka + ", rok v�roby je " + rokVyroby + ", barva vozu je " + barvaVozu + " a po�et oprav vozu je " + pocetOprav); 
		}
}
