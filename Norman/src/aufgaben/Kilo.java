package aufgaben;

import java.util.Scanner;

public class Kilo {

	public static void main(String[] args) {
	
		int gewicht;
		System.out.println("Geben Sie das Gewicht ein!");
		Scanner sc = new Scanner(System.in);
		gewicht = sc.nextInt();
		if(gewicht >= 235 && gewicht <= 265) {
		    System.out.println("Teilnahme ok");
		}
		else{
		System.out.println("Teilnahme verweigert!");
		}
		sc.close();
	}

}
