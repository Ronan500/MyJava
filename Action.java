import javax.swing.*;
import java.awt.event.*;


class Action extends JFrame implements ActionListener
{
//Components...
   JPanel pnl = new JPanel();
   JButton btn1 = new JButton("Button 1");
   JButton btn2 = new JButton("Button 2");
   JTextArea txtArea = new JTextArea(5, 38);
 
//Constructor...
   public Action(){
      super("Swing Window");
      setSize(500,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      pnl.add(btn1);
      pnl.add(btn2);
      pnl.add(txtArea);
      btn2.setEnabled(false);
      txtArea.setText("Button 2 is Disabled");
      add(pnl);
      setVisible(true);
   } 

//Event-Handler...
   public void actionPerformed(ActionEvent event){
      txtArea.setText(event.getActionCommand() + " Clicked and Disabled");
      if(event.getSource() == btn1)
      {btn2.setEnabled(true); btn1.setEnabled(false);}
      
      if(event.getSource() == btn2)
      {btn1.setEnabled(true); btn2.setEnabled(false);}
   }

//Entry-point...
   public static void main(String[]args){
      Action gui = new Action();
   }
}

/*A Swing JButton that is set to generate an ActionEvent event when it 
  gets clicked can be recognized by the ActionListener interface, which
  will pass the event to its actionPerformed() event-handler method.
  The ActionEvent object has a getSource() method that identifies the
  originating component, and a getActionCommand() method that returns
  a String. This will be the text label for a button component, or
  the content for a text field component.

  One response to a button might be to disable a component by calling
  its setEnabled() method with a false argument. Conversley, the 
  conponent can be enabled once more by specifying a true argument to
  its setEnabled() method.

  The components are declared before the constructor so they are globally
  accessable to the event-handler method.

  Its sometimes useful to disable a component until the user has 
  performed a required action...

  A user can interact with a program that provides a graphical user
  interface (GUI) by performing actions with a mouse, keyboard, or other
  input device. These actions cause "events" to occure in the interface,
  and making a program respond to them is known as "event handling".

  For a program to recognize user events it needs to have one or more
  EventListener interfaces added from java.awt.event package. 
  These can be made available to a program by adding an initial
  statement to import java.awt.event.*;

  The desired EventListener interface can be included in the class 
  declaration using the implements keyword. For example, a class 
  declaration to listen for button clicks might look like this:

  class Click extends JFrame implements ActionListener {  } 

  The Java documentation describes many EventListener interfaces that
  can listen out for different events, but the most common ones are listed
  in the table below, together with a brief description:

  # ActionListener - Recognizes action events that occur when a push
                     button is pushed or released.

  # ItemListener - Recognizes item events that occur when a list item 
                   gets selected or deselected.

  # KeyListener - Recognizes keyboard events that occur when the user 
                  presses or releases a key.

  # MouseListener - Recognizes mouse button actions that occur when the 
                    presses or releases a mouse button, and when the 
                    mouse enters or exits a component.

  # MouseMotionListener - Recognizes motion events that occur when the
                          user moves the mouse.

  Multiple EventListeners can be included after the implements keyword
  as a comma-separated list.

  Components need to generate events that the EventListener interfaces
  can recognize if they are to be usful. Having added the appropiate
  EventListener to the program, as described above, an event generator 
  must be added to the component.

  For example, in order to have the program respond to a button click, 
  the ActionListener interface is added to the programand the buttons
  addActionListener() method must be called, specifying the "this" keyword
  as its argument. This makes the button generate an event when it gets 
  clicked, which can be recognized by the ActionListener interface.

  Statements creating a button that generates events look like this:

  JButton btn = new JButton("Click Me");
  btn.addActionListener(this);

  When the user clicks a button that generates an event, the ActioListener
  interface recognizes the event and seeks an event handler method 
  within the program to execute a response.

  Each EventListener interface has an associated event-handler method
  that is called when an event is recognized. For example, when a button
  gets clicked, the ActionListener interface calls an associated method
  named actionPerformed() and passes an ActionEvent object as its 
  argument.

  An ActionEvent object contains information about the event and the 
  source component from where it originated. Most usefully, it has a 
  getSource() method that identifies the object that generated the event
  This can be used to create an appropriate response for the component.

  An event-handler method to create a response for a specific button
  click could look like this:

  public void actionPerformed(ActionEvent event){

      if(event.getSource() == btn){
         Statements to be executed for this button click event...
      }
  }
  ......*/