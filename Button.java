import javax.swing.*;


class Button extends JFrame
{
    JPanel pnl = new JPanel();    

    public static void main(String[]args){
       Button gui = new Button();
    }

//Create a ClassLoader object...
    ClassLoader ldr = this.getClass().getClassLoader();

//Load the URL's of the image resources...
    java.net.URL tickURL = ldr.getResource("Tick.png");
    java.net.URL crossURL = ldr.getResource("Cross.png");


//Edit the ImageIcon() constructor to use URL's...
    ImageIcon tick = new ImageIcon(tickURL);
    ImageIcon cross = new ImageIcon(crossURL);

//Create three JButton objects to display text, an image, and both
//text and an image respectively...
    JButton btn = new JButton("Click Me");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("STOP", cross);
    
    
    public Button(){
       super("Swing Window");
       setSize(600, 400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
//Insert statements to add the JButton components to the JPanel container..
       pnl.add(btn);
       pnl.add(tickBtn);
       pnl.add(crossBtn);
       setVisible(true);
    }
}

/*The Swing JButton class creates a push-button component that can be added
  to a graphical interface. This lets the user interact with the program
  by clicking on a button to performan action.

  The JButton object is created with the new keyword, and its constructor
  takes a String argument specifying text to be displayed on the button.
  
  Images can appear on buttons too. An ImageIcon object must first be 
  created to represent the image, specifying the image file name as the
  argument to its constructor. Typically, the image will be located
  alongside the program but the argument can include the path for images
  outside the local directory.

  Specify the name of the ImageIcon object as the argument to the 
  JButton constructor to display that image on the button, or specify
  a String and ImageIcon as its two arguments to display both text
  and the image.

  The buttons respond graphically when they are clicked, but will not
  perform an action until the program provides an event handler
  method to respond to each click event.

  Where the program is intended for deployment in a single Java archive
  (JAR), image resources must be loaded by a ClassLoader object before
  creating the ImageIcon objects to represent them.

  Specifying the resource file name or path to the getResource() method
  of a ClassLoader returns a URL, which can be used as the argument to
  the ImageIcon constructor. The java.net package provides a useful
  URL class to which these may first be assigned.

  The JPanel object has an add() method - to add components to that panel.

  Notice how the getClass() method and "this" keyword are used here to 
  reference this class object...*/  