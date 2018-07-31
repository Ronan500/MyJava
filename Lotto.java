import javax.swing.*;
import java.awt.event.*;


public class Lotto extends JFrame implements ActionListener
{
   ClassLoader ldr = this.getClass().getClassLoader();
   java.net.URL iconURL = ldr.getResource("Lotto.png");
   ImageIcon icon = new ImageIcon(iconURL);
   JLabel img = new JLabel(icon);
   JTextField txt = new JTextField("",18);
   JButton btn = new JButton("Get My Lucky Numbers");
   JPanel pnl = new JPanel();

   public Lotto(){
      super("Lotto App");setSize(260,210);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pnl.add(img);pnl.add(txt);pnl.add(btn);
      btn.addActionListener(this);add(pnl);setVisible(true);
   }

   public void actionPerformed(ActionEvent event){
      if (event.getSource() == btn){
         int[] nums = new int[60]; String str = "";
         for(int i = 1; i < 60; i++){nums[i]=i;}
         for(int i = 1; i < 60; i++){
            int r = (int)(59*Math.random() )+1;
            int t = nums[i]; nums[i] = nums[r]; nums[r]= t;
         }
         for(int i = 1; i < 7; i++)
         {str += " " + Integer.toString(nums[i]) + " ";}
         txt.setText(str);
      }
   }
   public static void main(String[]args){
      Lotto lotto = new Lotto();
   }
} 

/*Java applications for both desktop and handheld devices can be created 
  from common code - like the Lotto.java program above.

  The algorithim in this event-handler shuffles integers 1-59 in an 
  array, then assigns those integers in the first six elements to a String.

  The Lotto program begins with import statements to make swing components
  and the ActionListener interface available.

  Components...
  The program comprises a single panel component containing a label 
  component to display an image, a text field component to display
  output, and a button component for user interaction.

  Constructor...
  The Lotto() constructor builds a simple swing interface that loads the
  panel into a window frame measuring 260 x 210.

  Event-handler...
  The buttons event-handler method executes an algorithim to select a 
  sequence of six unique random numbers in the range of 1-59 for display
  in the text field component.

  Entry-point...
  The main() method creates an instance of the app, and calls upon 
  ClassLoader() to seek the image file resource Lotto.png in the same
  directory as the program file. The files must be arranged in this way
  before attempting to compile the program...*/