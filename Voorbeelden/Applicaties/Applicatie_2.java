// Opstartklasse voor applicatie
import javax.swing.*;

class Applicatie_2 extends JFrame {
  public Applicatie_2() {
    setContentPane( new Paneel() );
  }

  public static void main( String args[] ) {
    JFrame frame = new Applicatie_2();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setSize( 400, 200 );
    frame.setTitle( "Applicatie 2" );
    frame.setVisible( true );
  }
} 
