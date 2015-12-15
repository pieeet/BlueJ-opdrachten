import javax.swing.*;
import java.awt.event.*;

public class RaadspelPaneel extends JPanel 
implements ActionListener {
  private JTextField tekstvak;
  private JLabel label;
  private Raadspel spel;

  public RaadspelPaneel() {
    spel = new Raadspel();
    tekstvak = new JTextField( 10 );
    tekstvak.addActionListener( this );
    label = new JLabel( "Voer een getal in tussen 1 en 100" );
    add( label );
    add( tekstvak );
  }

  public void actionPerformed( ActionEvent e ) {
    String invoer = tekstvak.getText();
    int getal = Integer.parseInt( invoer );    
    String reactie = spel.raad( getal );
    label.setText( reactie );
    tekstvak.setText( "" );
  }
}
