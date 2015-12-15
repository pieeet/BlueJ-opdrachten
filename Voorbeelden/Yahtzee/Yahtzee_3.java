import java.util.*;

public class Yahtzee_3 {
  private Dobbelsteen dobbelsteen;  
  private ArrayList<Integer> worp;
  private ArrayList<Integer> telling;

  public Yahtzee_3() {
    dobbelsteen = new Dobbelsteen();
    worp = new ArrayList<Integer>();
    telling = new ArrayList<Integer>();
  }

  public void gooi5() {
    worp.clear();
    for( int i = 1; i <= 5; i++ ) 
      worp.add( dobbelsteen.gooi() );
    print();
  }

  public void print() {
    for( int w : worp )
      System.out.printf( "%3d", w );
    System.out.printf( "%n" );
  }

  public int getAantalInWorp( int ogen ) {
    int aantal = 0;
    for( int w : worp ) {
      if( w == ogen )
        aantal++;
    }
    return aantal;
  }

  public void tel() {
    telling.clear();
    for( int ogen = 1; ogen <= 6; ogen++ )
      telling.add( getAantalInWorp( ogen ) );
    // Toon het resultaat op het scherm
    for( int aantal : telling )
      System.out.printf( "%3d", aantal );
    System.out.printf( "%n" );
  }
}
