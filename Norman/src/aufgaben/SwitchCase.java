package aufgaben;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte den Hexadezimalwert eingeben: ");
		
		String scan = sc.next();
		
		
		char hex = scan.charAt(0);
		
		switch(hex = Character.toUpperCase(hex)) {

		case 'A':
	
			System.out.println("\nDezimal = 10");
			break;
		case 'B':
	
			System.out.println("\nDezimal = 11");
			break;
		case 'C':
			
			System.out.println("\nDezimal = 12");
			break;
		case 'D':
			
			System.out.println("\nDezimal = 13");
			break;
		case 'E':
			
			System.out.println("\nDezimal = 14");
			break;
		case 'F':
			
			System.out.println("\nDezimal = 15");
			break;
	
		default:
			System.out.println("Sie haben keinen gültigen Wert eingegeben!!!");
		
		}
		sc.nextLine();
		
		System.out.println("Bitte den Dezimalwert (1-15) eingeben: ");
		
		int dez = sc.nextInt();

		switch(dez) {
		
		case 1:
			
			System.out.println("\nHexadezimal = 1");
			
		case 2:
			
			System.out.println("\nHexadezimal = 2");
						break;
		case 3:
		
			System.out.println("\nHexadezimal = 3");
			break;
		case 4:
	
			System.out.println("\nHexadezimal = 4");
			break;
		case 5:
	
			System.out.println("\nHexadezimal = 5");
			break;
		case 6:
	
			System.out.println("\nHexadezimal = 6");
			break;
		case 7:
	
			System.out.println("\nHexadezimal = 7");
			break;
		case 8:
	
			System.out.println("\nHexadezimal = 8");
			break;
		case 9:
	
			System.out.println("\nHexadezimal = 9");
			break;
		case 10:
			
			System.out.println("\nHexadezimal = A");
			break;
		case 11:
			
			System.out.println("\nHexadezimal = B");
			break;
		case 12:
			
			System.out.println("\nHexadezimal = C");
			break;
		case 13:
			
			System.out.println("\nHexadezimal = D");
			break;
		case 14:
			
			System.out.println("\nHexadezimal = E");
			break;
		case 15:
			
			System.out.println("\nHexadezimal = F");
			break;
		default:
			System.out.println("Sie haben keinen gültigen Wert eingegeben!!!");
		}
		sc.nextLine();
		
		
		System.out.println("\nBitte den Dezimalwert für Berechnung feingeben: ");
		
		int dezBerechnung = sc.nextInt();
		int temp = dezBerechnung;
		sc.close();
		
		String hexa = "";
		
		while(dezBerechnung % 16 >= 0 && dezBerechnung > 0) {	
			switch(dezBerechnung % 16) {
			
			case 0:
				dezBerechnung/=16;
				hexa+="0";
				break;
			case 1:
				dezBerechnung/=16;
				hexa+="1";
				break;
			case 2:
				dezBerechnung/=16;
				hexa+="2";
				break;
			case 3:
				dezBerechnung/=16;
				hexa+="3";
				break;
			case 4:
				dezBerechnung/=16;
				hexa+="4";
				break;
			case 5:
				dezBerechnung/=16;
				hexa+="5";
				break;
			case 6:
				dezBerechnung/=16;
				hexa+="6";
				break;
			case 7:
				dezBerechnung/=16;
				hexa+="7";
				break;
			case 8:
				dezBerechnung/=16;
				hexa+="8";
				break;
			case 9:
				dezBerechnung/=16;
				hexa+="9";
				break;
			case 10:
				dezBerechnung/=16;
				hexa+="A";
				break;
			case 11:
				dezBerechnung/=16;
				hexa+="B";
				break;
			case 12:
				dezBerechnung/=16;
				hexa+="C";
				break;
			case 13:
				dezBerechnung/=16;
				hexa+="D";
				break;
			case 14:
				dezBerechnung/=16;
				hexa+="E";
				break;
			case 15:
				dezBerechnung/=16;
				hexa+="F";
				break;
			default:

			}
			
		}
		int laenge = hexa.length();
		String ausgabe = "\nDer Hexadezimalwert von " + temp + " = ";
		for(int i=laenge-1; i>=0; i--) {
			ausgabe+= hexa.charAt(i);
			
		}
		System.out.println(ausgabe);
	}
	//String a = Integer.toHexString(13);
}
