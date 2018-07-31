import javax.swing.*; 


class Window extends JFrame
{
//Create a JPanel container object...
   JPanel pnl = new JPanel();
   
   public static void main(String[]args){


//Create an instance of the Window class...
      Window gui = new Window();
   }
   
//Insert a constructor method to specify window requirments and to add the 
//JPanel object to the JFrame...
   public Window(){
      super("Swing Window");
      setSize(600, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(pnl);
      setVisible(true);
      }  
}

/*Programs can provide a graphical user interface (GUI) using the "swing"
  components of the Java library. The javax.swing package contains
  classes to create a variety of components using the style of the native
  operating system. These can be made available to a program by including
  the initial statement import javax.swing.*;

  A class must be created to represent the GUI to which components can
  be added to build the interface. This is easily achieved by declaring 
  it a subclass of Swing's JFrame class using the extends keyword
  thereby inheriting attributes and behaviours that allow the user to 
  move, resize, and close the window.

  The class constructor should include statements to set these
  minimum requirements:

  # The title of the window - specified as a string argument to the 
    inherited super() method of the JFrame class.

  # The size of the window - specified as width and height in pixels
    as arguments to its setSize() method.

  # What to do when the user closes the window - specified as a 
    constant argument to its setDefaultCloseOperation() method.

  # Display the window - specified as a boolean argument to its
    setVisible() method.

  Additionally, the constructor can add a JPanel container component to
  the window, in which smaller components can be added, using the
  inherited add() method of the JFrame class.

  By default, a JPanel container employs a FlowLayout layout manager
  that lays out components in left-to-right lines, wrapping at the
  right edge of the window.

  The steps above describe how to create a basic window containing a 
  JPanel container with a FlowLayout layout managaer.
  This demonstration is featured in subsequent examples in this directory
  that demonstrate how to add various components to the JPanel container.

  Notice how the add() method is used here to add the JPanel object to
  the JFrame window.

  The EXIT_ON_CLOSE operation is a constant member of the JFrame class.
  It exits the program when the window gets closed...*/