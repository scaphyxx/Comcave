package fressen;

public class Moehre {
  private int ruebenlaenge;

  public Moehre(int ruebenlaenge) {
    this.ruebenlaenge = ruebenlaenge;
  }

  public int getRuebenlaenge() {
    return ruebenlaenge;
  }

  public void setRuebenlaenge(int ruebenlaenge) {
    this.ruebenlaenge = ruebenlaenge;
  }

  @Override
  public String toString() {
    return "Moehre [ruebenlaenge=" + ruebenlaenge + "]";
  }

  public void wirdGefressen(int menge) {
    if (ruebenlaenge > menge) {
      ruebenlaenge -= menge;
    } else {
      ruebenlaenge = 0;
    }
  }
}
