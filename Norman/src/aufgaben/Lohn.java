package aufgaben;

public class Lohn {

	public static void main(String[] args) {
	    int stundenZahl = 40;
	    double stundenLohn = 9.80;
	    double steuerSatz = 0.1;
	    double bruttoLohn = stundenZahl * stundenLohn;
	    double steuer = (stundenZahl * stundenLohn) * steuerSatz;
	    double netto = bruttoLohn - steuer;

	    System.out.println("Stundenzahl: " + stundenZahl);
	    System.out.println("Stunenlohn: " + stundenLohn);
	    System.out.println("Steuersatz: " + steuerSatz);
	    System.out.println();
	    System.out.println("Bruttolohn: " + bruttoLohn);
	    System.out.println("Steuer: " + steuer);
	    System.out.println("Netto: " + netto);
	  }
}
