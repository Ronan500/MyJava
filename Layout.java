import javax.swing.*;
import java.awt.*;


class Layout extends JFrame
{

//Components...Container object representing the JFrame content
//pane container...also a second JPanel object using a GridLayout layout
//manager in a 2 x 2 grid...
   Container contentPane = getContentPane();
   JPanel pnl = new JPanel();
   JPanel grid = new JPanel(new GridLayout(2,2));
   
//Constructor...Adding JButton components to both JPanel objects...
   public Layout(){
      super("Swing Window");
      setSize(500,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(pnl);
      pnl.add(new JButton("Yes"));
      pnl.add(new JButton("No"));
      pnl.add(new JButton("Cancel"));
      grid.add(new JButton("1"));
      grid.add(new JButton("2"));
      grid.add(new JButton("3"));
      grid.add(new JButton("4"));
      contentPane.add("North",pnl);
      contentPane.add("Center",grid);
      contentPane.add("West",new JButton("West"));
      setVisible(true);
      
   }
//Entry-point...Creating an instance of the Layout class...
   public static void main(String[]args){
      Layout gui = new Layout();
   }
}

/*The java.awt package (Abstract Window Toolkit) contains a number of 
  layout manager classes that can be used to place components in a 
  container in different ways.

  A layout manager object is created using the new keyword, and then can 
  be specified as the argument to a JPanel contructor to have the
  panel use that layout. When components get added to the panel they will
  be placed according to the rules of the specified layout manager.

  BorderLayout - Places North, South, East, West, and Center(the content pane default)

  BoxLayout - Places in a single row or column.

  CardLayout - Places different components in a specified area at different times.

  FlowLayout - Places left to right in a wrapping line (the JPanel default)

  GridBagLayout - Places in a grid of cells, allowing components to span cells.

  GridLayout - Places in a grid of rows and columns.

  GroupLayout - Places horizontally and vertically.

  SpringLayout - Places by relative spacing.

  The top level JFrame object has a "content pane" container that places
  components using the BorderLayout layout manager by default.
  This can be used to place up to five JPanel containers, which may each
  use their default FlowLayout layout manager, or any of the layout 
  managers in the table above. Using a variety of layout managers
  accommodates most layout requirements.

  The content pane can be represented by a java.awt.Container object
  whose add() method can specify the position and name of a 
  component to be placed within the content pane.

  While the FlowLayout maintains the JButton size, other layout managers
  expand the components to fill their layout design....*/