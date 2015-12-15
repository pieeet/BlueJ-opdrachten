import java.util.*;

public class Yahtzee_1 {
  private Dobbelsteen dobbelsteen;  
  private ArrayList<Integer> worp;

  public Yahtzee_1() {
    dobbelsteen = new Dobbelsteen();
    worp = new ArrayList<Integer>();
  }

  public void gooi5() {
    for( int i = 1; i <= 5; i++ ) 
      worp.add( dobbelsteen.gooi() );
    print();
  }

  public void print() {
    for( int w : worp )
      System.out.printf( "%3d", w );
    System.out.printf( "%n" );
  }
}
