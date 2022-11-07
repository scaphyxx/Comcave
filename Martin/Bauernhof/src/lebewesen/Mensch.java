package lebewesen;

public class Mensch {
  // Attribute bzw. Felder
  private String name;
  private int age;

  public Mensch(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void altern() {
    this.age++;
  }

  public void altern(int jahre) {
    this.age += jahre;
  }

  @Override
  public String toString() {
    return "Mensch [name=" + name + ", Alter=" + age + "]";
  }
}
