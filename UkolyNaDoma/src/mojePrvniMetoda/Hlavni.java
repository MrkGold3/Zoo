package mojePrvniMetoda;

public class Hlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto mojeAuto = new Auto();
		mojeAuto.znacka = "Audi";
		mojeAuto.rokVyroby = 2016;
		mojeAuto.palivo = 80;
		mojeAuto.prumernaSpotrebaPalivaNa100Kilometru = 2.8;
		mojeAuto.pocetBouracek = 0;
		mojeAuto.bouram();
		mojeAuto.bouram();
		mojeAuto.zjistiKolikUjeduKilometru();
		mojeAuto.vypisInformace();
		
	}

}
