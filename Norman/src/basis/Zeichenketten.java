package basis;

import java.util.Arrays;

public class Zeichenketten {

	public static void main(String[] args) {
		
		String text = "Prozedural";
		String text2 = "Objektorientiert";
		String text3 = text + " " + text2;
		
		System.out.println(text3);
		
		int laenge = text3.length();				// Gibt die Anzahl der Zeichen zurück
		char zeichenAnIndex = text3.charAt(26);		// Liefert genau ein Zeichen
													// MERKE Index startet von 0 bis laenge - 1
													// leange startet von 1 bis n 
		System.out.println(zeichenAnIndex);	
		System.out.println(text3.contains(text));
		System.out.println(text.contains("Prozedur"));
		
		String spruch = "Fischer's Fritze fischt";
		String woerter[] = spruch.split(" ");
		System.out.println(Arrays.toString(woerter));
		
		
	}

}
