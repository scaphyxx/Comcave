package aufgaben;

import java.util.Scanner;

public class MatheLernProgramm {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Zunächst werden die Wertebereiche für die Rechenoperatoren abgefragt!\n" +
	    	"Für die Addition und Subtraktion sind Werte von 1 bis 999.999 erlaubt.\n" + 
	    	"Für die Multplikation, Division und Modulo sind Werte von 1 bis 1.000 erlaubt.\n" + 
	    	"Die Wertebereiche wurden so gewählt, da es sich um Kopfrechenaufgaben handelt.\n");
	    
	    boolean wertebereich=true;
	   
	    int summand=0;
	    int faktor1=0;
	    int faktor2=0;
	    int zaehler=0;
	    int nenner=0;
	    int moduloZaehl=0;
	    int moduloNenn=0;
	    
	    while(wertebereich) {
	    	try {
	    		
	    			System.out.print(
	    					"Bitte gibt den Wertebereich für die Addition und Subtraktion ein: \n1 bis "); 
				 	summand= scanner.nextInt();	
				 	if(summand>=1 && summand<=999999)
				 		wertebereich=false;
				 	else throw new Exception();
				    System.out.print(
						    "\nBitte gibt den Wertebereich für den ersten Faktor der Multiplikation ein: \n1 bis "); 
					faktor1= scanner.nextInt();
					if(faktor1>=1 && faktor1<=1000)
				 		wertebereich=false;
				 	else throw new Exception();
					System.out.print(
						    "\nBitte gibt den Wertebereich für den zweiten Faktor der Multiplikation ein: \n1 bis "); 
					faktor2= scanner.nextInt();
					if(faktor2>=1 && faktor2<=1000)
				 		wertebereich=false;
				 	else throw new Exception();
					System.out.print(
							"\nBitte gibt den Wertebereich für den Zähler der Division ein: \n1 bis "); 
					zaehler= scanner.nextInt();
					if(zaehler>=1 && zaehler<=1000)
				 		wertebereich=false;
				 	else throw new Exception();
					System.out.print(
							"\nBitte gibt den Wertebereich für den Nenner der Division ein: \n1 bis "); 
					nenner= scanner.nextInt();
					if(nenner>=1 && nenner<=1000)
				 		wertebereich=false;
				 	else throw new Exception();
					System.out.print(
					        "\nBitte gibt den Wertebereich für den Zähler für Modulo ein: \n1 bis "); 
					moduloZaehl= scanner.nextInt();
					if(moduloZaehl>=1 && moduloZaehl<=1000)
				 		wertebereich=false;
				 	else throw new Exception();
					System.out.print(
					        "\nBitte gibt den Wertebereich für den Nenner für Modulo ein: \n1 bis "); 
					moduloNenn= scanner.nextInt();
					if(moduloNenn>=1 && moduloNenn<=1000)
				 		wertebereich=false;
				 	else throw new Exception();
					scanner.nextLine();	
					//wertebereich = false;
	    	}
	    	catch (Exception e) {
		          System.out.println("\nFalsche Eingabe. Bitte nur Werte aus den angegebenen Wertebereich eintragen!\n");
		          wertebereich = true;
		          scanner.nextLine();}
	    }
	    
	    System.out.println("\nDie Wertebereiche wurden erfolgreich gesetzt!\n" +
	    					"Bei Bruchrechnung soll auf zwei Stellen gerundet werden.\n" + 
	    					"\nZum beenden ENTER drücken.\n" + 
	    					"\nViel Spass und Erfolg!\n");
	    
	    char[] operators = new char[] {'+', '-', '*', '/', '%'};
	    int richtig = 0;
	    int falsch = 0;
	    double avr = 0;
	    double beginn, ende;
	    beginn = System.currentTimeMillis();
	    while (true) {
	      boolean repeat = true;
	      int randOp = (int) (Math.random() * 5);
	      int rand1 = 0;
	      int rand2 = 0;

	      switch (randOp) {
	        case 0:
	        	rand1 = zahlenBis(summand);
	        	rand2 = zahlenBis(summand);
	        	break;
	        case 1:
	        	rand1 = zahlenBis(summand);
	        	rand2 = zahlenBis(summand);
	        	break;
	        case 2:
	        	rand1 = zahlenBis(faktor1);
	        	rand2 = zahlenBis(faktor2);
	        	break;
	        case 3:
	        	rand1 = zahlenBis(zaehler);
	        	rand2 = zahlenBis(nenner);
	        	break;
	        case 4:
	        	rand1 = zahlenBis(moduloZaehl);
	        	rand2 = zahlenBis(moduloNenn);
	        	break;
	      }
	      while (repeat) {
		        try {

	          System.out.print(rand1 + " " + operators[randOp] + " " + rand2 + " = ");

	          String input = scanner.nextLine();
	          if (input.toLowerCase().equals("")) {
	            System.out.println(
	                "\nIch hoffe du hattest Spass beim Rechnen!"
	                    + "\nDu hattest "
	                    + richtig
	                    + " Aufgabe(n) richtig"
	                    + " und "
	                    + falsch
	                    + " Aufgabe(n) falsch" + 
	              "\nDurchschnittliche Zeit pro Aufgabe: " + Math.round(avr/(richtig + falsch) * 100) /100.0);
	            return;
	          } else {

	            switch (randOp) {
	              case 0:
	                if (Integer.parseInt(input) == rand1 + rand2) {
	                  System.out.println("Richtig!");
	                  richtig++;
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                } else {
	                  falsch++;
	                  System.out.println("Falsch!");
	                  System.out.println("Richtig wäre: " + (rand1 + rand2));
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                }
	              case 1:
	                if (Integer.parseInt(input) == rand1 - rand2) {
	                  System.out.println("Richtig!");
	                  richtig++;
	                  break;
	                } else {
	                  falsch++;
	                  System.out.println("Falsch!");
	                  System.out.println("Richtig wäre: " + (rand1 - rand2));
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                }
	              case 2:
	                if (Integer.parseInt(input) == rand1 * rand2) {
	                  System.out.println("Richtig!");
	                  richtig++;
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                } else {
	                  falsch++;
	                  System.out.println("Falsch!");
	                  System.out.println("Richtig wäre: " + (rand1 * rand2));
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                }
	              case 3:
	                if (Double.parseDouble(input)
	                    == Math.round(((double) rand1 / rand2) * 100) / 100.0) {
	                  System.out.println("Richtig!");
	                  richtig++;
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                } else {
	                  falsch++;
	                  System.out.println("Falsch!");
	                  System.out.println(
	                      "Richtig wäre: " + Math.round(((double) rand1 / rand2) * 100) / 100.0);
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                }
	              case 4:
	                if (Integer.parseInt(input) == (rand1 % rand2)) {
	                  System.out.println("Richtig!");
	                  richtig++;
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                } else {
	                  falsch++;
	                  System.out.println("Falsch!");
	                  System.out.println("Richtig wäre: " + (rand1 % rand2));
	                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
	                  break;
	                }
	            }

	            ende = System.currentTimeMillis();
	            System.out.println("Zeit: " + Math.round(((ende - beginn) / 1000) * 100) /100.0 + " Sekunden.");
	            repeat = false;
	          }
	        } catch (Exception e) {
	          System.out.println("Falsche Eingabe!");
	          repeat = true;
	        }
	      }
	    }
	  }

	  public static int zahlenBis(int wert) {
	    return (int) (Math.random() * wert + 1);
	  }
	}
