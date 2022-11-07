package fressen;

public class Kartoffel {
  private int knollenanzahl;

  public Kartoffel(int knollenanzahl) {
    this.knollenanzahl = knollenanzahl;
  }

  public void wirdGefressen(int menge) {
    this.knollenanzahl -= menge;
  }
}
