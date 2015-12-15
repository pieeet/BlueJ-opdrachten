
/**
 * Raadspelletje waarbij je een getal moet raden tussen 0 en 100.
 * 
 * @author Gertjan Laan
 * @version 3 maart 2005
 */
public class Raadspel {
  private int teRadenGetal;
  private int teller;
  
  public Raadspel() {
    teRadenGetal = (int) ( 100 * Math.random() + 1 );
    teller = 0;
  }
  
  /** Typ een getal tussen 1 en 100 */
  public String raad( int getal ) {
    String reactie;
    teller++;
    if( teRadenGetal == getal )
      reactie = "Goed geraden, in " + teller + " keer";
    else {
      if( teRadenGetal > getal ) 
        reactie = "hoger";
      else
        reactie = "lager";
    }
    return reactie;
  }
}
