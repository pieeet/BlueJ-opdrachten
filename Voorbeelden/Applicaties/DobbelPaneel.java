import javax.swing.*;
import java.awt.event.*;

public class DobbelPaneel extends JPanel 
                          implements ActionListener {
  private JButton knop;
  private JTextField tekstvak;
  private Dobbelsteen dobbelsteen;

  public DobbelPaneel() {
    dobbelsteen = new Dobbelsteen();
    knop = new JButton( "gooi" );
    knop.addActionListener( this );
    tekstvak = new JTextField( 10 );
    add( knop );
    add( tekstvak );
  }

  public void actionPerformed( ActionEvent e ) {
    int worp = dobbelsteen.gooi();
    tekstvak.setText( "" + worp );
  }
}
