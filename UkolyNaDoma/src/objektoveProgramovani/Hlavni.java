package objektoveProgramovani;

public class Hlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Skola informace = new Skola(); 
		
		informace.NazevMesta = "Rokycany";
		informace.NazevSkoly = "Gymn�zium a St�edn� odborn� �kola";
		informace.RokZalozeniSkoly = 1873;
	
		System.out.println("Na�e �kola se nach�z� ve m�st� " + " " + informace.NazevMesta + ", jmenuje se " + informace.NazevSkoly + " a byla zalo�ena roku " + informace.RokZalozeniSkoly + ".");
		
		String pismena = "Gymn�zium a St�edn� odborn� �kola";
			pismena = pismena.substring(1);
		System.out.println(pismena);
		
		double odmocnina = Math.sqrt(1873);
		
		System.out.println(odmocnina);
	    System.out.println(Math.pow(odmocnina, 2)); // v�sledek je stejn�, ale nedok�u ��ct pro�. Asi zkr�tka proto�e kdy� n�co odmocn�m druhou mocninou a pak zp�tky umocn�m, tak z�klad ��sla z�stane stejn�
		
	}

}
