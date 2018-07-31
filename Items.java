import javax.swing.*;


class Items extends JFrame
{

/*Components...String array, and four JCheckBox objects to present each
* array item for selection - with one selected by default...and a second
* String array of items for selection...with a JComboBox object to 
* present each item in the second array for selection...and a JList object
* to present each item in the first array for selection from a list...
* and a JPanel container object...*/ 

    String[] toppings = {"Pepperoni","Mushroom","Ham","Tomato"};
    JCheckBox chk1 = new JCheckBox(toppings[0]);
    JCheckBox chk2 = new JCheckBox(toppings[1],true);
    JCheckBox chk3 = new JCheckBox(toppings[2]);
    JCheckBox chk4 = new JCheckBox(toppings[3]);
    String[] styles = {"Deep Dish","Gourmet Style","Thin & Crispy"};
    JComboBox<String> box1 = new JComboBox<String>(styles);
    JList<String> lst1 = new JList<String>(toppings);
    JPanel pnl = new JPanel();

//Constructor...standard title of, size of, close method of, and display
//of window set as boolean true..with JCheckBox components to the JPanel
//container...making a default selsection and to add the JComboBox
//component to the JPanel container...adding the JList component to the 
//JPanel container... 

    public Items(){
       super("Swing Window");
       setSize(500, 200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       pnl.add(chk1);
       pnl.add(chk2);
       pnl.add(chk3);
       pnl.add(chk4);
       box1.setSelectedIndex(0);
       pnl.add(box1);
       pnl.add(lst1);
       add(pnl);
       setVisible(true);
    }


//Entry-point...create an instance of the Items class...
    public static void main(String[]args){
        Items gui = new Items();
    }
    
    
}

/*The Swing JCheckBox class creates a checkbox component that can be added
  to a graphical interface. This can be used to allow the user to select
  or deselect individual items in the program. The JCheckBox object is
  created with the new keyword, and its constructor takes a String
  argument specifying text to be displayed alongside that checkbox.
  It can also take a second true argument to make the checkbox be selected
  by default.

  A choice of items can be offered by the JComboBox class that create
  drop-down lists from which the user can select any single item.
  This object is created with the new keyword, and its constructor 
  typically takes the name of a String array as its argument. Each element
  in the array provides an item for selection in the drop-down list.
  Similarly, a choice of item can be offered by the JList class that
  creates a fixed size list from which the user can select one or more
  items. It is created with the new keyword, and its constructor also
  takes an array as its argument, with each element providing an item
  for selection. As both JList and JComboBox are "Collections" they 
  must specify the generic type they may contain when they get created
  such as <String>.
 
  Only one item can be selected from a JComboBox component - multiple
  items can be selected from a JList component....*/ 