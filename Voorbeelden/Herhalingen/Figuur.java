public class Figuur {
  private Schildpad schildpad;
  private int x, y;

  /**
  * Maakt een nieuw figuur object
  * (x,y) is de posititie waard het tekenen van de figuur begint
  */

  public Figuur( int x, int y ) {
    schildpad = new Schildpad();
    this.x = x;
    this.y = y;
    schildpad.gaNaar( x, y );
    schildpad.penNeer();
  }


  public Schildpad getSchildpad() {
    return schildpad;
  }

  public void tekenVierkant( int zijde ) {
    for ( int i = 1; i <= 4; i++ ) {
      schildpad.vooruit( zijde );
      schildpad.draaiRechts( 90 );
    }
  }

  public void herhaalVierkant( int zijde ) {
    for ( int i = 1; i <= 36; i++ ) {
      tekenVierkant( zijde );
      schildpad.draaiRechts( 10 );
    }
  }

  public void tekenVeelhoek( int aantalHoeken, int zijde ) {
    for( int i = 1; i <= aantalHoeken; i++ ) {
      schildpad.vooruit( zijde );
      schildpad.draaiLinks( 360.0 / aantalHoeken );
    }
  }

  public void herhaalVeelhoek( int aantalHoeken, int zijde ) {
    for ( int i = 1; i <= 36; i++ ) {
      tekenVeelhoek( aantalHoeken, zijde );
      schildpad.draaiRechts( 10 );
    }
  }

  public void herhaalFiguur( int aantalHoeken, int zijde ) {
    for ( int i = 1; i <= aantalHoeken; i++ ) {
      tekenVeelhoek( aantalHoeken, zijde );
      schildpad.draaiRechts( 360.0 / aantalHoeken );
    }
  }

  public void wisTekening() {
    schildpad.wisTekening();
  }

}
