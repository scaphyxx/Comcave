package basis.verzweigung;

import java.util.Scanner;

public class Mikrowelle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie gro� ist den Hunger? Anzahl der Portionen eintippen: ");
		
		int portionAnzahl = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Wie gro� ist die Erhitzungszeit (in Minuten) f�r eine Portion? ");
		
		double erhitzung = sc.nextDouble();
		sc.close();
		
//		if (portionAnzahl == 1) {
//			
//			System.out.println("\nDie Erhitzungsdauer betr�gt: " + erhitzung + " min");
//		}
//		if (portionAnzahl == 2) {
//			
//			erhitzung = erhitzung*1.5;
//		
//			System.out.println("\nDie Erhitzungsdauer betr�gt: " + erhitzung + " min");
//		}
//		if (portionAnzahl == 3) {
//			
//			erhitzung = erhitzung*2;
//		
//			System.out.println("\nDie Erhitzungsdauer betr�gt: " + erhitzung + " min");
//		}
//		if (portionAnzahl > 3) {
//			
//			System.out.println("\nMaximal 3 Portionen gleichzeitig erhitzen!");
//		}
//		
		
		switch (portionAnzahl)
		{
		case 1:
			System.out.println("\nDie Erhitzungsdauer betr�gt: " + erhitzung + " min");
			break;
		case 2:
			erhitzung = erhitzung*1.5;			
			System.out.println("\nDie Erhitzungsdauer betr�gt: " + erhitzung + " min");	
			break;
		case 3:
			erhitzung = erhitzung*2;			
			System.out.println("\nDie Erhitzungsdauer betr�gt: " + erhitzung + " min");	
			break;
		default:
			System.out.println("\nMaximal 3 Portionen gleichzeitig erhitzen!");
		}
	}

}
