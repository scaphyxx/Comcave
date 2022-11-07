package lebewesen;

import fressen.Moehre;

public class Schwein {
  private String name;
  private int gewicht;

  public Schwein(String name, int gewicht) {
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

  @Override
  public String toString() {
    return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
  }

  public void fressen(Moehre m, int menge) {
    this.gewicht += menge;
    m.wirdGefressen(menge);
  }

  public void laufen(int schritte) {
    if (gewicht > schritte) {
      gewicht -= schritte;
    } else {
      gewicht = 0;
    }
  }
}
