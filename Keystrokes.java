import javax.swing.*;
import java.awt.event.* ;


class Keystrokes extends JFrame implements KeyListener
{
//Components...
    JPanel pnl = new JPanel();

    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(5, 38);
    
//Constructor...
    public Keystrokes(){
       super("Swing Window");
       setSize(500,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
       pnl.add(field);
       pnl.add(txtArea);
       field.addKeyListener(this);
       setVisible(true);
    }
//Event-handler 1....
    public void keyPressed(KeyEvent event){
       txtArea.setText("Key Pressed");
    }

//Event-handler 2...
    public void keyTyped(KeyEvent event){
       txtArea.append("\nCharacter : "+ event.getKeyChar());
    }
//Event-handler 3...
    public void keyReleased(KeyEvent event){
       int keyCode = event.getKeyCode();
       txtArea.append("\nKey Code : " + keyCode);
       txtArea.append("\nKey Text : " + event.getKeyText(keyCode));
    }

//Entry-point...
    public static void main(String[]args){
       Keystrokes gui = new Keystrokes();
    }
}

/*Swing components that allow the user to input text can recognize user
  key strokes with the KeyListener interface, which will pass the
  KeyEvent event to these three event handler methods:

  # keyPressed(KeyEvent) - Called when a key is pressed.

  # keyTyped(KeyEvent) - Called after a key is pressed.

  # keyRelesed(KeyEvent) - Called when a key is released.

  When the program implements the KeyListener interface it must declare
  these three methods - even if not all are actually used.

  The KeyEvent object has a getKeyChar() method, which returns the
  character for that key, and a getKeyCode() method, which returns an
  integer Unicode value representing that key. Additionally, a getKeyText()
  method takes the key code value as its argument and returns a 
  description of that key.

  The getKeyCode() method only returns the key code if called from
  witin the keyPressed() or keyReleased() event-handlers - not from
  the keyTyped() event-handler...

  Remember case senstive ..... # # # ...*/

  

  