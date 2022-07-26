package com.scaphyxx;

public class Datentypen {

//	class variablen										sind der Klasse zugehoerig und geben den Status
													//  der Klasse wieder. Sie konnen je nach sichtbarkeit 
													//  ueber den Namen der Klasse erreicht werden.
													// sind in static methoden erreichbar und veraenderbar
													// keyword: static
	public static  int wert ;
	private static long stempel;
	static char zeichen;
	
//	instance variablen									gehoeren zu einem erzeugten Objekt (Instanz) der klasse
													//	geben den Status des Objektes wieder 
													//  koennen nur in Instanz Methoden (Objekt) erreicht und veraendert 
													//  werden
													//  keyword : keines - static wird weggelassen und ist somit non-static
	public char id ;				
	boolean chekStatus;
	
	public static void main(String[] args) {
		
		// 8 Primitive/ elementare Datentypen
		
		// Ganzzahligen --> 4 
		byte einByte = 127;							// Groesse = 1 Byte 
		
		short einShort = 2500;						// Groesse = 2 Byte
		
		int einInt = 1_250_000;						// Groesse = 4 Byte
		
		long einLong = 333_888_777_222L;			// Groesse = 8 Byte 
			
		
		// Gleitkommadatentypen --> 2
		
		float einFloat = 2.5F;						// Groesse = 4 Byte
		
		double einDouble = 135.95;					// Groesse = 8 Byte
		
		// Zeichendatentyp --> 1					
		
		char einChar = '1';							// Groesse = 2 Byte
	
		//id = '\u0021';							// das ist eine Instanz Variable die NICHT in einer static Methode
													// verwendet werden darf OHNE Bezug zu einem Objekt
		Datentypen dT = new Datentypen();			// Erzeugen eines Objektes 
		dT.id = '\u0021'; 							// Nutzen des Objektes und aendern der Objektvariablen
		
		zeichen = '\u00bf';							// Spanische Umgedrehte ? 
		
		System.out.println(zeichen);
		
		zeichen = '!';
		
		
		// boolschen Datentyp --> 1
		boolean isTrue = false;						// Groesse = 1 Byte
													// Er hat NUR 2 Werte !!!! NUR true und false 
		isTrue = true ;
		
		isTrue = (4 *2 -3)  >  5;					// Wertzuweisung kann auch mit einer boolschen Expression
		
		System.out.println(isTrue);

	}

}

