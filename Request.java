import javax.swing.*;
import java.awt.event.*;


class Request extends JFrame implements ActionListener
{
   JPanel pnl = new JPanel();
   JTextField field = new JTextField(38);
   JButton btn1 = new JButton("Request Decision");
   JButton btn2 = new JButton("Request Input");

   public Request(){
      super("Swing Window");
      setSize(500,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(pnl);
      pnl.add(field);pnl.add(btn1);pnl.add(btn2);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent event){
      if (event.getSource() == btn1){
         int n = JOptionPane.showConfirmDialog(this,"Do you agree?","Confirmation Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
         switch(n){
            case 0 : field.setText("Agreed"); break;
            case 1 : field.setText("Disagreed"); break;
            case 2 : field.setText("Canceled"); break;
         }
      }
      if (event.getSource() == btn2){
         field.setText(JOptionPane.showInputDialog(this,"Enter your comment","Input Dialog",JOptionPane.PLAIN_MESSAGE));
      }
   }

   public static void main(String[]args){
      Request gui = new Request();
   }
}

/*The Swing JOptionPane class can request information from the user by
  opening a dialog box with its showConfirmationDialog() method,
  requesting a decision, or with its showInputDialog() method, requesting
  user input.

  Both these methods can take four arguments : 

  # Parent object - typically referenced by the this keyword.

  # Request String to be displayed.

  # Dialog title String.

  # One of the JOptionPane constants such as PLAIN_MESSAGE or to specify
    dialog decision buttons as YES_NO_CANCEL_OPTION

  The dialog box will return the input String from an input dialog
  or an integer from a decision button - zero for yes, 1 for no, 
  2 for cancel.

  The OK_CANCEL constant provides two decision buttons - OK returns zero
  and CANCEL returns 2. Refer to the documentation for the
  full range of constants...*/