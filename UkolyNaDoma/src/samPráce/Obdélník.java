package samPr�ce;

public class Obd�ln�k {
	public double obsah;
	public double obvod;
	public double a;
	public double b;
	
	public void vypoctiObsah () {
		obsah = a*b;
		System.out.println("Obsah obd�ln�ku je " + obsah + "cm.");
	}
	
	public void vypoctiObvod () {
		obvod = 2*(a+b);
		System.out.println("Obvod obd�ln�ku je " + obvod + "cm.");
	}
	
	//Zde je roz���en� toho �kolu
	public void zjistiZdaJeObjektObdelnik () {
		if (a == b) {
			System.out.println("Ve skute�nosti je to �tverec.");
		}
		else {
			System.out.println("Je to obd�ln�k.");
		}
	}
}
