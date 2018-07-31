import javax.swing.*;


class Radios extends JFrame
{

//Components...three RadioButton objects with one default selection...
//A ButtonGroup object with which to group the radio buttons...
//and a JPanel container object...

   JRadioButton rad1 = new JRadioButton("Red",true);
   JRadioButton rad2 = new JRadioButton("Rose");
   JRadioButton rad3 = new JRadioButton("White");
   ButtonGroup wines = new ButtonGroup();
   JPanel pnl = new JPanel();

//Constructor...standard constructor method window requirments and add 
//JPanel object to the JFrame...also adding JRadioButton component to
//the JButtonGroup...and adding JRadioButton component to the JPanel cont..

   public Radios(){
      super("Swing Window");
      setSize(500,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      wines.add(rad1);
      wines.add(rad2);
      wines.add(rad3);
      pnl.add(rad1);
      pnl.add(rad2);
      pnl.add(rad3);
      add(pnl);
      setVisible(true);
   }

//Entry-point...create an instance of Radios class...
   public static void main(String[]args){
      Radios gui = new Radios();
   }
}

/*The Swing JRadioButton class creates a radio button component that can
  be added to a graphical interface. This can be used to allow the user
  to select an item from a group of radio buttons.

  The JRadioButton object is created with the new keyword, and its
  constructor takes a String argument specifying text to be displayed
  alongside that radio button. It can also take a second true argument
  to make a radio button be selected by default.

  A ButtonGroup object logically groups a number of radio buttons so
  that only one button in that group can be selected at any time.
  Each radio button is added to the ButtonGroup object by specifying
  its name as the argument to the groups add() method.

  The ButtonGroup object only groups the buttons logically, not physically.

  .....*/