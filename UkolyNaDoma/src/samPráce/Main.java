package samPr�ce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obd�ln�k obdelnik = new Obd�ln�k();
		Obd�ln�k obdelnicek = new Obd�ln�k();
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
