// Opstartklasse voor applicatie
import javax.swing.*;

class Applicatie_3 extends JFrame {
  public Applicatie_3() {
    setContentPane( new DobbelPaneel() );
  }

  public static void main( String args[] ) {
    JFrame frame = new Applicatie_3();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setSize( 400, 200 );
    frame.setTitle( "Applicatie 3" );
    frame.setVisible( true );
  }
} 
