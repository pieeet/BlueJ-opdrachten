import javax.swing.*;

// Opstartklasse voor applet
public class RaadspelApplet extends JApplet {
  public void init()	{
    setContentPane( new RaadspelPaneel() );
  }
}
