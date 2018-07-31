import java.util.ArrayList;


class Lists
{
   public static void main(String[]args){

//Create a String ArrayList object named "List".
     ArrayList<String> list = new ArrayList<String>();

//Statements to populate the list elements with String values then 
//display the entire list.
     list.add("Alpha");
     list.add("Delta");
     list.add("Charlie");
     System.out.println("List: "+ list);

//Identify the current values in the second element then replace it
//with a new String.
     System.out.println("Replacing: " + list.get(1) + "\n");
     list.set(1, "Bravo");

//Iterate through the list and display the String value now stored 
//in each element.
     list.forEach((x)-> System.out.println("Item: " + x));
  }
}

/*The java.util package contains a class named ArrayLists that stores data
  in an ordered "Collection" (resizable sequence) of the list elements.
  This can be made available to a program by importing the specific
  class with import java.util.ArrayList; . A list may contain duplicate
  elements, and an ArrayList object has useful methods that allow 
  manipulation of stored values by specifying their element index number.
  For example, the lists method call get(0) will retrieve the value stored
  in the first element whereas remove(1) will remove the second list 
  element.

  Element values can be modified by specifying the index number and new
  value as arguments to the lists set() method. Elements can be added to
  the list at a particular position by specifying the index number and
  value as arguments to the lists add() method. The list expands to
  accommodate additional elements by moving the element values 
  along the index.

  An ArrayList object is simply created using the new keyword but, like
  other Java collections, the statement must specify which generic type
  of item the list may contain. Typically, a list may contain String
  items, so ArrayList must have a <String> suffix.

  Collections, such as ArrayList, have a forEach() method that iterates 
  over each element in a list. This makes it easy to loop through all
  items contained in a list.

  Each stored list item can be conveniently referenced in turn by
  specifying a "lambda expression" as the argument to the forEach()
  method. Lambda expressions are simply short, anonymous (un-named) methods
  that can be specified in the location they are to be executed.
  They begin with parentheses, to contain any arguments, then have
  a -> character sequence followed by the statement block, with this syntax

  (argument/s)-> {statement/s}

  The data type of the argument can be explicitly declared, or it can 
  be infered from the context -  (String x) can be simply (x).
  Additionally, the curly brackets can be omitted if the lambda expression
  statement block contains only one statement.

  With a lists forEach() method the value of the current element in the 
  iteration can be passed to the lambda expression as its argument,
  then displayed in output by its statement.

  You can discover how many elements a list currently has by calling 
  its size() method.

  As with regular arrays, elements in an ArrayList have a zero-based index.
 
  The graphical Java Swing jComboBox component that is introduced in 
  "Items.java" file, holds a drop-down list of options, so must also
  specify its generic data type when that object gets created. */ 