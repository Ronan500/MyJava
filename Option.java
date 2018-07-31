class Option
{
   public static void main(String[]args){
   
   
   try
   {
   
   if (args[0].equals("-en")){
       System.out.println("English option");}
   else if (args[0].equals("-es")){
       System.out.println("Spanish option");}
      
    else System.out.println("Unrecognized option"); 
     }   
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Integer argument required.");
      }
     
 }
}

/*The standard Java code that declares the programs main method includes 
  an argument within its parentheses that creates a string array,
  traditionally named "args":

  public static void main(String[]args) { }
  
  The purpose of the args[] array is to allow values to be passed to the 
  program when it is called upon to run. At the command line, a value to
  be passed to the program is added after a single space following the
  program name. For example, the command to pass the String "Java" to
  a program named "Run" would be Run Java.

  A single value passed to a program is automatically placed into the 
  first element of the args[] array, so it can be addressed by the 
  program as args[0].

  It is important to recognize that the args[] array is of the String
  data type - so a numeric value passed to a program will be stored
  as a String representation of a number. This means that the program 
  cannot use this value arithmatically until it has been converted to a 
  numerical data type, such as an int value, For example, Run 4 passes
  the number four to the program, which stores it as the String "4",
  not as int 4. Consequently, output of args[0]+3 produces the 
  concatenated String "43", not the sum 7. The argument can be converted
  with the Integer.parseInt() method so that Integer.parseInt(args[0])+3
  does produce the sum 7.

  A String containing spaces can be passed to a program as a single String
  value by enclosing the entire String within double quotes on the 
  command line. Foe example, Run "Java In Easy Steps".

  Passing an argument to a program is most useful to determine how the
  program should run by indicating an execution option.
  The option is passed to the program as a String value in args[0] and
  can be evaluated using the String.equals() method. The syntax for this
  just tacks a period and "equals()" onto the array name,
  with a comparison String within the parentheses. For example,
  args[0].equals("b") evaluates the argument for the String value "b".

  This example will throw an ArrayIndexOutOfBounds exception if you 
  attempt to execute the program without any arguments. */
  
  