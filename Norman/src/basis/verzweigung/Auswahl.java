package basis.verzweigung;

public class Auswahl {

	public static void main(String[] args) {
		
		// if (expression) {..true Zweig} else {..false Zweig}
		// - expression(Bedingung) MUSS true oder false ergeben
		// - erlaubt simple true / false in die () reinzuschreiben
		// - ein if hat max ein else
		// - wenn nur eine Anweisung (keine Deklaration mit ohne Initialsierung)
		//	 nach der expression steht, dann dürfen die {} weggelassen werden

	//-------------- Wenn keyword 'true' als expression steht ---------------------		
		
		if(true) {
			System.out.println("Wird immer ausgeführt");
		}
		else {System.out.println("Wird nimals errreicht");} // Dead Code
		
	//---------------------------- Ohne { }  --------------------------------------		
		int x = 5;
		
		if(x > 5)
			System.out.println(x);
		
		else
			System.out.println("x ist zu klein");
	
	//------------- Mehrere Expressions --------------------------------------------
		
		int a = 2, b = 3, c = 0; 	   // Multiple Deklaration mit Initialisierung
		
		if ((a > c) && (b < a)) {				   // & logische UND / Bitweises UND , &&
			a++;								   // ++ / -- inkrement /dekrement Operatoren erhöht/verringert den Wert um 1
		}
		else {
			c++;
		}
		
	//-------------- geschachtelten if Anweisungen ----------------------------------
		
		if(x > 6) {
			x--;
		}
		else {
			if(x < 6) {
			x++;
			}
			else {
				System.out.println(" x passt");
			}
		}
		if(x < 6) 
			if(x < 5) 
				x = 6;
			else 
				x++;		
				
		System.out.println("Der Wert von x: " + x);
	}

}
