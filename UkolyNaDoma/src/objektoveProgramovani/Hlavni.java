package objektoveProgramovani;

public class Hlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Skola informace = new Skola(); 
		
		informace.NazevMesta = "Rokycany";
		informace.NazevSkoly = "Gymnázium a Støední odborná škola";
		informace.RokZalozeniSkoly = 1873;
	
		System.out.println("Naše škola se nachází ve mìstì " + " " + informace.NazevMesta + ", jmenuje se " + informace.NazevSkoly + " a byla založena roku " + informace.RokZalozeniSkoly + ".");
		
		String pismena = "Gymnázium a Støední odborná škola";
			pismena = pismena.substring(1);
		System.out.println(pismena);
		
		double odmocnina = Math.sqrt(1873);
		
		System.out.println(odmocnina);
	    System.out.println(Math.pow(odmocnina, 2)); // výsledek je stejný, ale nedokážu øíct proè. Asi zkrátka protože když nìco odmocním druhou mocninou a pak zpátky umocním, tak základ èísla zùstane stejný
		
	}

}
