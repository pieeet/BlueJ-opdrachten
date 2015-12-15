public class KopOfMunt {
  private Dobbelsteen dobbelsteen;

  public KopOfMunt() {
    dobbelsteen = new Dobbelsteen();
  }

  public String gooi() {
    String resultaat;
    int aantalOgen = dobbelsteen.gooi();
    if( aantalOgen <= 3 )
      resultaat = "kop";
    else
      resultaat = "munt";
    return resultaat;
  }

  /** Voer in hoeveel keer er gegooid moet worden */
  public String gooi( int aantalKeer ) {
    int aantalKop = 0, aantalMunt = 0;
    for( int i = 1; i <= aantalKeer; i++ ) {
      if( gooi().equals( "kop" ) )
        aantalKop++;
      else 
        aantalMunt++;
    }
    return "Kop: " + aantalKop + " Munt: " + aantalMunt;
  }
}
