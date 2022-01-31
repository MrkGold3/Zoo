package dedicnost;

public class Savec extends Zvire{

	Savec(int datNarozeni, String jmeno, boolean zijuVCesku, int teplotaZvirete) {
		super(datNarozeni, jmeno, zijuVCesku);
		// TODO Auto-generated constructor stub
	}

	final boolean Teplokrevnost = true;
	double teplotaZvirete;
	
	
	public void vydejZvuk (String citoslovce) {
		System.out.println("Savec dìlá zvuk " + citoslovce);
	}
	
	
}
