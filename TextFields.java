import javax.swing.*;


class TextFields extends JFrame
{
    JPanel pnl = new JPanel();

    public static void main(String[]args){
       TextFields gui = new TextFields();
    }
    

//Create two JTextField objects....
    JTextField txt1 = new JTextField(38);
    JTextField txt2 = new JTextField("Default Text", 38);

//Create a JTextArea object five lines high....
    JTextArea txtArea = new JTextArea(5, 37);

//Add a JScrollPane object - to contain the JTextArea above...
    JScrollPane pane = new JScrollPane(txtArea);

    public TextFields(){
       super("Swing Window");
       setSize(500, 200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
//Add the JTextField components to the JPane container....
       pnl.add(txt1);
       pnl.add(txt2);
//Add the JScrollPane container, (containing the JTextArea field) 
//to the JPanel container....
       pnl.add(pane);
       setVisible(true);
       txtArea.setLineWrap(true);
       txtArea.setWrapStyleWord(true);
       pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       
    }
}

/*The Swing JTextField class creates a single line text field component
  that can be added to a graphical interface. This can be used to display
  editable text, and allows the user to enter text to interact with
  the program.

  The JTextField object is created with the new keyword, and its 
  constructor can take a String argument specifying default text to be 
  displayed in that field. In this case , the component will be sized to
  accommodate the length of the String. Alternatively, the argument
  may be a numerical value to specify the text field size. The 
  constructor can also take two arguments, specifying both default text
  and the text field size.

  A multiple-line text field can be created with the JTextArea class,
  whose constructor takes two numerical arguments specifying its number
  of lines and its width. Alternatively, three arguments can be supplied 
  specifying default text, line number, and width. Text can be made to 
  wrap at word endings within this field by specifying true as the 
  argument to the setLineWrap() method and setWrapStyleWord() method
  of the JTextArea object.
 
  Where text entered into a JTextArea component exceeds its initial size
  the component will expand to accommadate the text. To make the component
  a fixed size with scrolling capability, it can be placed in a JScrolPane
  container. This is created with the new keyword, and takes the name of 
  the JTextArea as its argument.

  Scroll bars will, by default, only appear when the field contains text
  that exceeds its initial size - but they can be made to appear 
  constantly by specifying a JScrollPane constant as the argument to the
  snappily-named setVerticalScrollBarPolicy() or ...
  setHorizontalScrollBarPolicy() methods of the JScrollPane object.
  For example, to always display a vertical scrollbar use the 
  JScrollPane.VERTICAL_SCROLLBAR_ALWAYS constant as the argument.

  Use the JPasswordField class instead of the JTextField class where
  input characters are needed to be not visible.

  A JTextArea component has no scrolling ability unless it is contained
  within a JScrollPane component...*/  

   