
public class Main {
	public static void main(String[] args) {
		Lindt a1 = new Lindt("ciocolata", "Olanda", 1, 1, 1);
		Lindt a2 = new Lindt("ciocolata", "Olanda", 1, 4, 7);
		Lindt a3 = new Lindt("vanilie", "Argentina", 1, 2, 3);
		
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a2));
		
		a1.printLindtDim();
	}
}
