import javax.swing.*;
import java.awt.event.*;


class Mouse extends JFrame implements MouseListener, MouseMotionListener
{
    JPanel pnl = new JPanel();
    JTextArea txtArea = new JTextArea(8, 38);
    int x, y ;

    public Mouse(){
       super("Swing Window");
       setSize(500,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
       pnl.add(txtArea);
       txtArea.addMouseMotionListener(this);
       txtArea.addMouseListener(this);
       setVisible(true);
    }
    public void mouseMoved(MouseEvent event){
       x = event.getX(); 
       y = event.getY();
    }
    public void mouseDragged(MouseEvent event) {  }

    public void mouseEntered(MouseEvent event){
       txtArea.setText("\nMouse Entered");
    }
    public void mousePressed(MouseEvent event){
       txtArea.append("\nMouse Pressed at X : " +x+ " Y : " +y);
    }
    public void mouseReleased(MouseEvent event){
       txtArea.append("\nMouse Released");
    }
    public void mouseClicked(MouseEvent event) {  }
    public void mouseExited(MouseEvent event)  {  }

    public static void main(String[]args){
       Mouse gui = new Mouse();
    }
}

/*Swing components can recognize user mouse actions with the MouseListener
  interface, which will pass the MouseEvent event to these five
  event-handler methods : 

  # mousePressed(MouseEvent) - Button is pressed.

  # mouseReleased(MouseEvent) - Button is released.

  # mouseClicked(MouseEvent) - Button has been released.

  # mouseEntered(MouseEvent) - Mouse moves on.

  # mouseExited(MouseEvent) - Mouse moves off.

  Mouse movements can be recognizes by the MouseMotionListener interface,
  which passes MouseEvent events to two event-handlers : 

  # mouseMoved(MouseEvent) - Mouse is moved.
  
  # mouseDragged(MouseEvent) - Mouse is dragged.

  When a program implements the MouseListener or MouseMotionListener
  interface, it must declare all its associated event-handler methods --
  even if not all are actually used.

  The MouseEvent object passed by the MouseMotionListener interface has
  getX() and getY() methods, which return the current mouse coordinates
  relative to the component generating the event.

  Rollover effects can be created by swapping images with the 
  mouseEntered() and mouseExited() event-handler method...*/