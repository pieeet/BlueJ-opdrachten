import java.util.*;

public class Cijferlijst {
  private ArrayList<Double> lijst;

  public Cijferlijst() {
    lijst = new ArrayList<Double>();  
  }

  public void voegtoe( double cijfer ) {
    lijst.add( cijfer );
  }

  public void print() {
    System.out.println( "Cijferlijst:");
    for( double cijfer : lijst ) {
      System.out.println( cijfer );
    }
    System.out.println( "Gemiddelde = " + gemiddelde() );
  }

  public double gemiddelde() {
    double subtotaal = 0;
    for( double cijfer : lijst ) {
      subtotaal = subtotaal + cijfer;
    }
    int aantal = lijst.size();
    return subtotaal / aantal;
  }
}
