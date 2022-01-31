package samPráce;

public class Obdélník {
	public double obsah;
	public double obvod;
	public double a;
	public double b;
	
	public void vypoctiObsah () {
		obsah = a*b;
		System.out.println("Obsah obdélníku je " + obsah + "cm.");
	}
	
	public void vypoctiObvod () {
		obvod = 2*(a+b);
		System.out.println("Obvod obdélníku je " + obvod + "cm.");
	}
	
	//Zde je rozšíøení toho úkolu
	public void zjistiZdaJeObjektObdelnik () {
		if (a == b) {
			System.out.println("Ve skuteènosti je to ètverec.");
		}
		else {
			System.out.println("Je to obdélník.");
		}
	}
}
