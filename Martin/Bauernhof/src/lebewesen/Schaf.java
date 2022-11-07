package lebewesen;

public class Schaf {
  private String name;
  private int gewicht;

  public Schaf(String name, int gewicht) {
    this.name = name;
    this.gewicht = gewicht;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGewicht() {
    return gewicht;
  }

  public void setGewicht(int gewicht) {
    this.gewicht = gewicht;
  }

public void fressen(int menge) {
    this.gewicht += menge;
  }

  public void laufen (int schritte) {
    this.gewicht-= schritte;
  }

}
