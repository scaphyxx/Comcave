package aufgaben;

import java.util.ArrayList;

public class Niederschlag {

	  private static ArrayList<Month> year = new ArrayList<>();

	  public static void main(String[] args) {
	    Month april = new Month("April", 14);
	    Month may = new Month("Mai", 12);
	    Month june = new Month("Juni", 8);

	    year.add(april);
	    year.add(may);
	    year.add(june);

	    double avg = 0;

	    for (Month m : year) {
	      System.out.println("Niederschlag im " + m.getName() + "\t: " + m.getNs());
	      avg += m.getNs();
	    }
	    avg /= year.size();
	    avg = Math.round(avg*100)/100.0;
	    System.out.println("Durchschnitt\t\t: " + avg);
	  }

	  // System.out.println("Niederschlag im April:\t" + April);
	  // System.out.println("Niederschlag im Mai:\t" + Mai);
	  // System.out.println("Niederschlag im Juni:\t " + Juni);
	  // System.out.println("\nDurchschnitt:\t\t" + avg);
}
