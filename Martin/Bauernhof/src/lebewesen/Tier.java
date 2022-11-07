package lebewesen;

public class Tier {
  private String name;

  public Tier(String name, int gewicht) {
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

  private int gewicht;

  public void fressen(int menge) {
    this.gewicht = +menge;
    System.out.println("Ich esse");
  }

  public void laufen(int schritte) {
    this.gewicht -= schritte;
    System.out.println("Ich laufe");
  }
}
