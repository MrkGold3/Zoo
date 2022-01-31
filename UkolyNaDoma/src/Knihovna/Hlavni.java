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
		
		//netuším, proè mi to nevypisuje poèet knih. nevím, kde je chyba.
	}

}
