import javax.swing.*;
import java.awt.event.* ;


class Keystrokes extends JFrame implements KeyListener
{
    JPanel pnl = new JPanel();

    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(5, 38);
    
  
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
    public void keyPressed(KeyEvent event){
       txtArea.setText("Key Pressed");
    }

    public void KeyTyped(KeyEvent event){
       txtArea.append("\nCharacter : "+ event.getKeyChar());
    }
    public void KeyReleased(KeyEvent event){
       int KeyCode = event.getKeyCode();
       txtArea.append("\nKey Code : " + keyCode);
       txtArea.append("\nKey Text : " + event.getKeyText(keyCode));
    }

    public static void main(String[]args){
       Keystrokes gui = new Keystrokes();
    }
}

/*Swing components that allow the user to input text can recognize user
  key strokes with the KeyListener interface, which will pass the
  KeyEvent event to these three event handler methods:

  # keyPressed(KeyEvent) - Called when a key is pressed.

  # keyTyped(KeyEvent) - Called after a key is pressed.

  # keyRelesed(KeyEvent) - Called when a key is released...*/