import javax.swing.*;


class Labels extends JFrame
{
   JPanel pnl = new JPanel();

   public static void main(String[]args){
      Labels gui = new Labels();
   }

//Create ClassLoader object before ImageIcon....
      ClassLoader ldr = this.getClass().getClassLoader();

//Load the URL of the image resource using the ClassLoader object...
      ImageIcon duke = new ImageIcon(ldr.getResource("Duke.png"));

//Create three JLabel objects to display an image, text, and both
//text and an image respectivly...
      JLabel lbl1 = new JLabel(duke);
      JLabel lbl2 = new JLabel("Duke is the friendly mascot of Java technology");
      JLabel lbl3 = new JLabel("Duke" , duke , JLabel.CENTER);

   public Labels(){
      super("Swing Window");
      setSize(500, 200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(pnl);
//Three statements to add the JLabel components to the JPanel container...
      pnl.add(lbl1);
      pnl.add(lbl2);
      pnl.add(lbl3);
      setVisible(true);
//Statement to create a ToolTip for the first label...
      lbl1.setToolTipText("Duke - the Java Mascot");
//Two statements to align the text centrally below the third label...
      lbl3.setHorizontalTextPosition(JLabel.CENTER);
      lbl3.setVerticalTextPosition(JLabel.BOTTOM);
     
    }


}

/*The Swing JLabel class creates a Label component that can be added to 
  a graphical interface. This can be used to display non-interactive
  text or image, or both text and image.

  The JLabel object is created with the new keyword, and its constructor
  takes a String argument specifying text to be displayed on that label,
  or the name of an ImageIcon object representing an image to display.
  It can also take three arguments to specify text, image, and
  horizontal alignment as a JLabel constant value. For example, 
  JLabel("text", img, JLabel.CENTER) aligns centrally.

  Where a JLabel object contains both text and an image, the relative
  position of the text can be determined by specifying a JLabel
  constant as the argument to setVerticalPosition() and 
  setHorizontalPosition() methods of the JLabel object.

  Additionally, a JLabel object can be made to display a ToolTip when
  the cursor hovers over, by specifying a text String as the argument
  to that objects setToolTipText() method.

  Where the program is intended for deployment in a single Java archive
  (JAR), the image resource must be loaded by a ClassLoader object
  before creating the ImageIcon object to represent it.

  Specifying the resource file name or path to the getResource() method
  of a ClassLoader returns a URL, which can be used as the argument
  to the ImageIcon constructor.

  JLabel alignment constants include LEFT, CENTER, RIGHT, TOP, and BOTTOM.
  ....*/ 