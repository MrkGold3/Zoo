package samPráce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obdélník obdelnik = new Obdélník();
		Obdélník obdelnicek = new Obdélník();
		Kruh kruh = new Kruh();
		Kruh kruznice = new Kruh();
		
		kruh.r = 6;
		kruh.pi = 3.14;
		kruznice.r = 6;
		kruznice.pi = 3.14;
	
		kruh.vypoctiObvod();
		kruh.vypoctiObsah();
		
		obdelnik.a = 12.3;
		obdelnik.b = 4;
		obdelnicek.a = 12.3;
		obdelnicek.b = 4;
		
		obdelnik.zjistiZdaJeObjektObdelnik();
		obdelnik.vypoctiObsah();
		obdelnicek.vypoctiObvod();
		
		
		
		
	}

}
