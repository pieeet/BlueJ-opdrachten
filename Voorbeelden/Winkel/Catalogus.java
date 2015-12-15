import java.util.*;

public class Catalogus {
  private ArrayList<Artikel> lijst;

  public Catalogus() {
    lijst = new ArrayList<Artikel>();
    lijst.add( new Artikel( 1, "iPod-mini", 179.00 ) );
    lijst.add( new Artikel( 22, "Hoofdtelefoon", 14.50 ) );
    lijst.add( new Artikel( 333, "4 Ni-MH batterijen", 31.95 ) );
    lijst.add( new Artikel( 4444, "Batterij-oplader", 29.95 ) );
  }

  public void voegtoe( Artikel artikel ) {
    lijst.add( artikel );
  }

  public void print() {
    for( Artikel artikel : lijst ) {
      System.out.println( artikel );
    }
  } 
 
  public Artikel zoek( int nummer ) {
    Artikel gezochteArtikel = null;
    for( Artikel artikel : lijst ) {
      if( artikel.getNummer() == nummer )
        gezochteArtikel = artikel;
    }
    return gezochteArtikel;
  }
}
