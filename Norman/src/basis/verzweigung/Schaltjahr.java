package basis.verzweigung;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("welches Jahr soll geprüft werden? ");
		
		int jahr = sc.nextInt();
		
		if (jahr % 400 == 0) {
			
			System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
		}
		else {
			if(jahr % 4 == 0 && jahr % 100 !=0)
				System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
			else
				System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
		}	
	}
}
