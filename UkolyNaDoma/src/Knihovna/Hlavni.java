package Knihovna;

public class Hlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Knihovna knihovna = new Knihovna ("Habakuk", "Rokycany", "Karel", 500);
		
		knihovna.vypisInformace();
		
		knihovna.dodavkaKnih(2);
		knihovna.registraceCtenare();
		knihovna.registraceCtenare();
		knihovna.registraceCtenare();
		
		knihovna.vypisInformace();
		
		//netu��m, pro� mi to nevypisuje po�et knih. nev�m, kde je chyba.
	}

}
