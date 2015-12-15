import javax.swing.*;
import java.awt.event.*;

public class RaadspelPaneel2 extends JPanel 
implements ActionListener {
  private JTextField tekstvak;
  private JButton nieuwKnop;
  private JLabel voerInLabel, commentaarLabel;
  private Raadspel spel;

  public RaadspelPaneel2() {
    spel = new Raadspel();

    voerInLabel = new JLabel( "Voer een getal in tussen 1 en 100" );
    commentaarLabel = new JLabel( " en druk op Enter " );
    
    tekstvak = new JTextField( 10 );
    tekstvak.addActionListener( this );
    
    nieuwKnop = new JButton( "Nieuw spel" );
    nieuwKnop.addActionListener( this );

    add( voerInLabel );
    add( tekstvak );
    add( commentaarLabel );
    add( nieuwKnop );
  }

  public void actionPerformed( ActionEvent e ) {
    if( e.getSource() == tekstvak ) {
      String invoer = tekstvak.getText();
      int getal = Integer.parseInt( invoer );    
      String reactie = spel.raad( getal );
      commentaarLabel.setText( reactie );
      tekstvak.setText( "" );
    }

    if( e.getSource() == nieuwKnop ) {
      spel = new Raadspel();
      voerInLabel.setText( "Voer een getal in tussen 1 en 100" );
      commentaarLabel.setText( " en druk op Enter " );

    }
  }
}
