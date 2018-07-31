import javax.swing.*;
import java.awt.event.*;


class Messages extends JFrame implements ActionListener
{
//Components...
   JPanel pnl = new JPanel();
   JButton btn1 = new JButton("Show Information Message");
   JButton btn2 = new JButton("Show Warning Message");
   JButton btn3 = new JButton("Show Error Message");

//Constructor...
   public Messages(){
      super("Swing Window");
      setSize(500,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(pnl);
      pnl.add(btn1);
      pnl.add(btn2);
      pnl.add(btn3);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      setVisible(true);
   }

//Event-handler...
   public void actionPerformed(ActionEvent event){
      if (event.getSource() == btn1)
         JOptionPane.showMessageDialog(this,"Information...","Message Dialog",JOptionPane.INFORMATION_MESSAGE);
      
      if (event.getSource() == btn2)
         JOptionPane.showMessageDialog(this,"Warning...","Message Dialog",JOptionPane.WARNING_MESSAGE);
     
      if (event.getSource() == btn3)
         JOptionPane.showMessageDialog(this,"Error...","Message Dialog", JOptionPane.ERROR_MESSAGE);

   }
//Entry-point...
   public static void main(String[]args){
      Messages gui = new Messages();
   }
}

/*The Swing JOptionPane class is designed to create a standard dialog box
  centered on its parent window. Its showMessageDialog() method
  displays a message to the user providing information, warning, or
  error description.

  The showMessageDialog() method can take four arguments : 

  # Parent object - typically referenced by the this keyword.

  # Message String to be displayed. 

  # Dialog title String.

  # One of the JOptionPane constants :

  INFORMATION_MESSAGE    WARNING_MESSAGE   or   ERROR_MESSAGE

  The dialog box will display an appropriate icon according to which
  JOptionPane constant is specified.

  You can also simply specify the parent and message as two arguments
  to create a dialog with the default information icon and the 
  default "Message" title...*/