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
		System.out.println("Auto m� je�t� " + palivo + " litr� paliva a zb�v� mu ujet " + palivo * prumernaSpotrebaPalivaNa100Kilometru + " km.");
	}
	public void vypisInformace() {
		System.out.println("Zna�ka vozu je " + znacka + ", rok v�roby je " + rokVyroby + " a po�et boura�ek vozu je " + pocetBouracek); 
		}
}
