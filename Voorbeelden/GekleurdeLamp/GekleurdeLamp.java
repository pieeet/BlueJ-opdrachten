
/**
 * Klasse voor lamp die aan en uit kan
 * en van kleur kan veranderen
 * 
 * @author Gertjan Laan
 * @version 20 januari 2005
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;

class GekleurdeLamp {
  private int positie;
  private boolean isZichtbaar;
  private boolean isAan;
  private String kleur;

  private static TekenVenster venster = null;
  /**
    * Constructor voor objecten van klasse GekleurdeLamp
    * Maakt een lamp op positie 100
  */
  public GekleurdeLamp() {
    this( 100 );
  }
  
  /**
    * Constructor voor objecten van klasse GekleurdeLamp
    * Maakt een lamp op de plaats aangegeven door positie
  */
  public GekleurdeLamp( int positie ) {
    isZichtbaar = false;
    this.positie = positie;
    kleur = "rood";
  }

  // Methoden

  /**
    * Zet lamp aan
  */
  public void aan() {
    isAan = true;
    teken();
  }

  /**
    * Zet de lamp uit
  */
  public void uit() {
    isAan = false;
    teken();
  }


  /**
   * Maak de lamp groen
   */
  
  public void setGroen() {
    kleur = "groen";
    teken();
  }
 

  /**
   * Maak de lamp blauw
   */
  
  public void setBlauw() {
    kleur = "blauw";
    teken();
  }


  /**
   * Maak de lamp rood
   */
  
  public void setRood() {
    kleur = "rood";
    teken();
  }

  /**
   * Maak de lamp oranje
   */
  
  public void setOranje() {
    kleur = "oranje";
    teken();
  }

  

  /**
   * Vraag naar de kleur van de lamp
   */
  
  public String getKleur() {
    return kleur;
  }




  /** 
    * Levert true als de lamp aan is, anders false
  */
  public boolean isAan() {
    return isAan;
  }
  
  /** 
    * Maak lamp zichtbaar in het uitvoervenster
  */
  public void maakZichtbaar() {
    isZichtbaar = true;
    teken();
  }
  

  // private methoden
  private void teken() {
    if( isZichtbaar ) {
      if( venster == null ) 
        venster = new TekenVenster( "Venster voor gekleurde lampen" );
      venster.teken( this );
    }
  }
  
  private int getPositie() {
    return positie;
  }
  

  // ********************************************************
  // Inwendige klasse
  private class TekenVenster {

    private JFrame frame;
    private TekenPaneel paneel;
    private Graphics gB;
    private Image buffer;
    private HashMap< String, Color > map;
    
    private ArrayList<GekleurdeLamp> lijst; 
    
    // private Constructor ivbm singleton Venster
    private TekenVenster( String titel ) {
      frame = new JFrame( titel );
      paneel = new TekenPaneel();
      frame.setContentPane( paneel );
      paneel.setPreferredSize( new Dimension( 500, 350 ) );
      frame.pack();
      lijst = new ArrayList<GekleurdeLamp>();
      maakZichtbaar( true );
      map = new HashMap<String, Color >();
      map.put( "rood", Color.red );
      map.put( "groen", Color.green );
      map.put( "blauw", Color.blue );
      map.put( "oranje", Color.orange );
    }  
    
    
   
    // Overige methoden
    public void maakZichtbaar( boolean zichtbaar ) {
      if( gB == null ) {
        Dimension dim = paneel.getSize();
        buffer = frame.createImage( dim.width, dim.height );
        gB = buffer.getGraphics();
      }
      frame.setVisible( zichtbaar );
    }
    
    public void teken( GekleurdeLamp s ) {
      frame.setVisible( true );
      lijst.remove( s );
      lijst.add( s );
      herschilder();
    }
  
  
    public void verwijder( GekleurdeLamp s ) {
      lijst.remove( s );
      herschilder();
    }
      
   
    // Private methoden
    private void herschilder() {
      maakBufferSchoon();
      for( GekleurdeLamp lamp : lijst ) 
        tekenLamp( lamp );
      paneel.repaint();
    }
    
    private void maakBufferSchoon() {
      gB.setColor( Color.white );
      Dimension dim = paneel.getSize();
      gB.fillRect( 0, 0, dim.width, dim.height );
    }
    
    private void tekenLamp( GekleurdeLamp lamp ) {
      int x = lamp.getPositie();
      gB.setColor( Color.gray );
      
      gB.drawLine( x, 0, x, 100 );   // ophangdraad
      // de lamp 
      if( lamp.isAan() ) {
        gB.setColor( map.get( lamp.getKleur() ) );
        gB.fillArc(  x - 30, 100 - 15, 60, 30, 180, 180 );
        gB.drawLine( x - 30, 100, x + 30, 100 ); // bovenkant lamp
        gB.drawArc( x - 30, 100 - 15, 60, 30, 180, 180 ); 
      }
      else {
        gB.setColor( Color.gray );
        gB.fillArc( x - 30, 100 - 15, 60, 30, 180, 180 ); 
      }
    }
       
    // Inwendige klasse
    private class TekenPaneel extends JPanel {
      public void paint( Graphics g ) {
        g.drawImage( buffer, 0, 0, null );
      }
    }
  }
}
	