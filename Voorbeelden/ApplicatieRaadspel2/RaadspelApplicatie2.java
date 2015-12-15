// Opstartklasse voor applicatie met paneel
import javax.swing.*;

class RaadspelApplicatie2 extends JFrame {
  public RaadspelApplicatie2() {
    setContentPane( new RaadspelPaneel2() );
  }

  public static void main( String args[] ) {
    JFrame frame = new RaadspelApplicatie2();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setSize( 440, 200 );
    frame.setTitle( "Getal raden versie 2" );
    frame.setVisible( true );
  }
}
