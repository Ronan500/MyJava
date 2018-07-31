import javax.swing.*;
import java.awt.*;


class Custom extends JFrame
{
//Components...
   JPanel pnl = new JPanel();
   JLabel lbl1 = new JLabel("Custom Backround");
   JLabel lbl2 = new JLabel("Custom Foreground");
   JLabel lbl3 = new JLabel("Custom Font");
   Color customColor = new Color(255, 0, 0);
   Font customFont = new Font("Serif", Font.PLAIN, 64);
   Box box = Box.createVerticalBox();

//Constuctor...
   public Custom(){
      super("Swing Window");
      setSize(500,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(pnl);
      lbl1.setOpaque(true);
      lbl1.setBackground(Color.YELLOW);
      lbl2.setForeground(customColor);
      lbl3.setFont(customFont);
      box.add(lbl1);box.add(lbl2);box.add(lbl3);
      pnl.add(box);
      setVisible(true);
      

   }

//Entry-point...
   public static void main(String[]args){
      Custom gui = new Custom();
   }
}

/*The java.awt package (Abstract Window Toolkit) contains "painting" 
  classes that can be used to color interface components. These can be 
  made available to a program by including the initial statement
  import java.awt.*;

  Included in the java.awt package is a color class that has constants
  representing a few basic colors, such as Color.RED. Additionally, 
  instances of the Color class can be created using the new keyword
  to represent custom colors. The constructor can take three interger
  arguments between zero and 255 to represent red, green, and blue (RGB)
  values to form the custom color.

  Each component has a setBackground() method and a setForeground() method
  that can take a color object as their argument to paint that component
  with the specified color.

  Note that the background of JLabel components are transparent by default
  so it is recommended that their setOpaque() method should be called 
  to set the opacity to true before they are painted.

  Also in the java.awt package is a Font class that can be used to 
  modify the font displaying text. A Font object represents a font, and
  its constructor can take three arguments to specify name, style, and
  size.

  # The specified name should be one of the three platform - independent
    names "Serif", "SansSerif", or "Monospaced".

  # The specified style should be one of the following three constants:
    Font.PLAIN, Font.BOLD, or Font.ITALICS.

  # The specified size should be an integer of the point size.

  Each component has a setFont() method that takes a Font object as its
  argument to paint that component with the specified font.

  In the above example, the custom color is equivalent to Color.RED as
  the RGB value specifies the maximum red value with no green or blue.

  A Box object is a handy lightweight container that uses BoxLayout
  as its layout manager. The Box objects createVerticalBox() method
  individually displays its components from top to bottom...*/
   