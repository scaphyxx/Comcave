package aufgaben;

public class Quadratgleichung {

	  public static void main(String[] args) {
		    System.out.println(qGleichung(4));
		    System.out.println(qGleichung(2));
		    System.out.println(qGleichung(2.0/3));
		  }

		  private static String qGleichung(double x) {
		    double quad = x * x;
		    double ergebnis = 3 * quad - 8 * x + 4;
		    return "x = " + x + ": Ergebnis = " + ergebnis;
		  }

}
