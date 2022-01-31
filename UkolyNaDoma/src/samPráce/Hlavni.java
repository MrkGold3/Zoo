package samPráce;

public class Hlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto mojeAuto = new Auto();
		mojeAuto.znacka = "Ferrari";
		mojeAuto.rokVyroby = 2019;
		mojeAuto.barvaVozu = "Èerná";
		mojeAuto.pocetOprav = 0;
		mojeAuto.oprava();
		mojeAuto.oprava();
		mojeAuto.oprava();
		mojeAuto.vypisInformace();
	}

}
