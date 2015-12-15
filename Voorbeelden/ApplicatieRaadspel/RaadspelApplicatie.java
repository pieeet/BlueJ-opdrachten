// Opstartklasse voor applicatie met paneel
import javax.swing.*;

class RaadspelApplicatie extends JFrame {
  public RaadspelApplicatie() {
    setContentPane( new RaadspelPaneel() );
  }

  public static void main( String args[] ) {
    JFrame frame = new RaadspelApplicatie();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setSize( 400, 200 );
    frame.setTitle( "Getal raden" );
    frame.setVisible( true );
  }
}
