package mojePrvniMetoda;

public class Auto {
	String znacka;
	int rokVyroby;
	int palivo;
	double prumernaSpotrebaPalivaNa100Kilometru;
	int pocetBouracek;
	public void bouram() {
		pocetBouracek++;
	}
	public void zjistiKolikUjeduKilometru(){
		System.out.println("Auto má ještì " + palivo + " litrù paliva a zbývá mu ujet " + palivo * prumernaSpotrebaPalivaNa100Kilometru + " km.");
	}
	public void vypisInformace() {
		System.out.println("Znaèka vozu je " + znacka + ", rok výroby je " + rokVyroby + " a poèet bouraèek vozu je " + pocetBouracek); 
		}
}
