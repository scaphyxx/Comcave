package basis.verzweigung;

public class Mehrfachauswahl {

	public static void main(String[] args) {
		
		String ampelfarbe = "blau";
		final String rot = "rot";    		// final setzt die Variable rot als eine Konstante
	//				 rot ="dunkelrot"; 		//Funktionier nicht, weil final
											// nur erlaubt ein einziges Mal den Wert zuweisen
		
		
		switch(ampelfarbe.toLowerCase()) { //toLowerCase() kurzfristige Umwandlung in Kleinbuchstaben
		
		case "rot": System.out.println("Warten!");
					break;
		case "gelb": System.out.println("Gib gas,klappt noch .....");
					break;
		case "gruen":			
		case "grün": System.out.println("Gute Fahrt!");
					break;
		default: System.out.println("Besoffen, wah?");
		}

		System.out.println("Done");
	}

}
