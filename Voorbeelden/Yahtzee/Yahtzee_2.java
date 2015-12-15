import java.util.*;

public class Yahtzee_2 {
  private Dobbelsteen dobbelsteen;  
  private ArrayList<Integer> worp;

  public Yahtzee_2() {
    dobbelsteen = new Dobbelsteen();
    worp = new ArrayList<Integer>();
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
}
