package Niederschlagsmenge;

/** Month */
public class Month {

  private String name;
  private int ns;

  public Month(String name, int ns) {
    this.name = name;
    this.ns = ns;
  }

  public String getName() {
    return name;
  }

  public int getNs() {
    return ns;
  }
}
