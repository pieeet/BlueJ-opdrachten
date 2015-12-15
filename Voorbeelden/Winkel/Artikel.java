public class Artikel {
  private int nummer;
  private String omschrijving;
  private double prijs;

  public Artikel( int nummer,
                  String omschrijving, 
                  double prijs ) {
    this.nummer = nummer;
    this.omschrijving = omschrijving;
    this.prijs = prijs;
  }

  public int getNummer() {
    return nummer;
  }

  public String getOmschrijving() {
    return omschrijving;
  }

  public double getPrijs() {
    return prijs;
  }

  public String toString() {
    return nummer + ", " + omschrijving + ", " + prijs;

/*    return String.format( "%4d", nummer ) + ", " + 
           String.format( "%-40s", omschrijving ) +
            "€ " + 
            String.format( "%6.2f", prijs );
*/
  }
}