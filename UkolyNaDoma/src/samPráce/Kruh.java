package samPráce;

public class Kruh {
	public double obsah;
	public double obvod;
	public double r;
	public double pi;
	public double d;
	
	public void vypoctiObvod () {
		d = 2*r;
		obvod = pi*d;
		System.out.println("Obvod kruhu je " + obvod + "cm.");
	}
	public void vypoctiObsah () {
		obsah = pi*(r*r);
		System.out.println ("Obsah kruhu je " + obsah + "cm.");
	}
}
