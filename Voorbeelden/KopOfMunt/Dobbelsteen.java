public class Dobbelsteen {
  private int worp;

  public Dobbelsteen() {
    worp = 0;
  }

  public int getWorp() {
    return worp;
  }

  public int gooi() {
    worp = (int) ( 6 * Math.random() + 1 );
    return worp;
  }
}
