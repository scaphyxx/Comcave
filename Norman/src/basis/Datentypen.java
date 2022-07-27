package basis;

public class Datentypen {
	
//	class variablen							sind der Klasse zugehörig und geben den Status
										//	der Klasse wieder. Sie können je nach Sichbarkeit
										//	über den Namen der Klasse erreicht werden.
										//	Sind in static Methoden erreichbar und veränderbar
										//	keyword: static
	public static int wert;
	private static long stempel;
	static char zeichen;
	
// instance variablen						gehören zu einem erzeugten Objekt (Instanz) der Klasse
										//	geben den Status des Objektes wieder
										//	können nur in Instanz Methoden (Objekt) erreicht und verändert werden
										//	keyword: keines - static wird weggelassen und somit non-static
	public char id;
	boolean chekStatus;

	public static void main(String[] args) {
		
		// 8 Primitive/ elementare Datentypen
		
		// Ganzzahlig --> 4
		
		byte einByte = 127;					// Größe = 1 Byte
		
		short einshort = 2500;				// Größe = 2 Byte
			
		int einInt = 1_250_000;				// Größe = 4 Byte
		
		long einLong = 333_999_888_777L;	// Größe = 8 Byte
		
		// Gleitkommadatentypen --> 2
		
		float einFloat = 2.5F;				// Größe = 4 Byte
		
		double einDouble = 135.95;			// Größe = 8 Byte
		
		//Zeichendatentyp --> 1				 
		
		char einChar = '1';					// Größe = 2 Byte
		
		// id = '\u0021';					// das ist eine Instanz Variable die NICHT in einer static Methode
											// verwendet werden darf OHNE Bezug zu einem Objekt
		
		Datentypen dT = new Datentypen();	// Erzeugen eines Objektes
		dT.id = '\u0021';					// Nutzen des Objektes und Ändern der Objektvariablen
		
		zeichen = '\u00bf';					// spanische umgedrehte ?
				
		
		// boolschen Datentyp --> 1
		
		boolean isTrue = false; 			// Größe = 1 Byte
											// Er hat NUR 2 Werte!!! NUR true und false
		isTrue = true;
		
		isTrue = (4 *2 -3) > 4;				// Wertzuweisung kann man auch mit einer boolschen Expression
		
		System.out.println(isTrue);
		
	}

}
