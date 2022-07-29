package aufgaben;

import java.util.Scanner;

public class Grillbude {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean quit = false;
    String bestellung = "";
    System.out.println(
        "Speisekarte:"
            + "\n1. Döner"
            + "\n2. Currywurst"
            + "\n3. Pommes"
            + "\n4. Schaschlik"
            + "\n5. Hänchen "
            + "\n6. Beenden");

    while (!quit) {
      System.out.println("\nWelche Speise wollen Sie bestellen?");
      try {
        int eingabe = sc.nextInt();
        switch (eingabe) {
          case 1:
            bestellung = bestellung + "Döner ";
            break;
          case 2:
            bestellung = bestellung + "Currywurst ";
            break;
          case 3:
            bestellung = bestellung + "Pommes ";
            break;
          case 4:
            bestellung = bestellung + "Schaschlik ";
            break;
          case 5:
            bestellung = bestellung + "Hänchen ";
            break;
          case 6:
            quit = true;
            
            if (!bestellung.equals("")) {
              String[] bestellungArray = bestellung.split(" ");
              System.out.println("\n1"
              		+ "Ihre Bestellung:");
              for (int i = 0; i < bestellungArray.length; i++) {
                System.out.println(i + 1 + ". " + bestellungArray[i]);
              }
              System.out.println("\nAuf Wiedersehen!");
              break;
            } else {
              System.out.println("Du hast nichts bestellt");
              break;
            }
          default:
            System.out.println("Ungueltige Eingabe");
            break;
        }          
    }
      catch (Exception e) {
    	  String error = sc.next();
          System.out.println("\n"+ error + " ist eine ungueltige Eingabe\n");
          System.out.println(
        	        "Speisekarte:"
        	            + "\n1. Doener"
        	            + "\n2. Currywurst"
        	            + "\n3. Pommes"
        	            + "\n4. Schaschlik"
        	            + "\n5. Haenchen "
        	            + "\n6. Beenden");
         }
    }
    sc.close();
  }
}
