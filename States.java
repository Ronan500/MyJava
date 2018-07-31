import javax.swing.*;
import java.awt.event.*;


class States extends JFrame implements ItemListener
{
//Components...
    String[] styles = {"Deep Dish","Gourmet Style","Thin & Crispy"};
    JComboBox<String> box = new JComboBox<String>(styles);
    JRadioButton rad1 = new JRadioButton("White");
    JRadioButton rad2 = new JRadioButton("Red");
    ButtonGroup wines = new ButtonGroup();
    JCheckBox chk = new JCheckBox("Pepperoni");
    JTextArea txtArea = new JTextArea(5,38);
    JPanel pnl = new JPanel();
  
//Constructor...
    public States(){
       super("Swing Window");
       setSize(500,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       wines.add(rad1);
       wines.add(rad2);
       pnl.add(rad1);
       pnl.add(rad2);
       pnl.add(chk);
       pnl.add(box);
       pnl.add(txtArea);
       rad1.addItemListener(this);
       rad2.addItemListener(this);
       chk.addItemListener(this);
       box.addItemListener(this);
       add(pnl);
       setVisible(true);
    }

//Event-handler...
    public void itemStateChanged(ItemEvent event){
       if(event.getItemSelectable()==rad1)
       {txtArea.setText("White wine selected");}

       if(event.getItemSelectable()==rad2)
       {txtArea.setText("Red wine selected");}

       if((event.getItemSelectable() == chk)&&
         (event.getStateChange() == ItemEvent.SELECTED))
       {txtArea.append("\nPepperoni selected\n");}

       if((event.getItemSelectable()==box)&&
         (event.getStateChange()==ItemEvent.SELECTED))
       {txtArea.append(event.getItem().toString()+" selected");}
    }

//Entry-point...
    public static void main(String[]args){
       States gui = new States();
    }
}

/*Swing JRadioButton, JCheckBox, and JComboBox components maintain states
  whose change can be recognized by the ItemListener interface, which will
  pass the ItemEvent to its itemStateChanged() method that identifies
  the originating component and a getStateChange() method that returns
  its status. This will determine if the change is selecting or deselecting
  an item, and can be compared to an ItemEvent.SELECTED constant.

  Note how this example uses the append() method to add further text to
  the text area.

  Notice that the getItem() method returns the item affected by the change.
  
  The JComboBox fires two ItemEvents when an item gets selected - one
  selecting the item and one deselecting the previously selected item.
  That is why steps (8 & 9 in the event-handler method) must identify
  both the originating component and the type of ItemEvent....*/ 
