class Power
{
   public static void main(String[]args){

//Try block to catch wrong data type user input.
    try { 
//Declare and initialize an int variable from a passed command line argumen
     int num = Integer.parseInt(args[0]);

//Perform mathematical calculations, casting the results into more 
//variables.     
     int square = (int)Math.pow(num , 2);
     int cube = (int)Math.pow(num , 3);
     int sqrt = (int)Math.sqrt(num);

//Output results of the calculations.
     System.out.println(num + " Squared is " + square);
     System.out.println(num + " Cubed is " + cube);
     System.out.println("Square root of " + num + " is "+ sqrt);}
   catch(NumberFormatException e )
     {System.out.println("Argument is in wrong format must be number, also must not be decimal number.");}
   catch(ArrayIndexOutOfBoundsException e)
     {System.out.println("Integer argment required.");}
 }
}

/*The Math class within the java.lang package provides many methods that
  are useful to perform mathematical calculations. Using Math.pow(),
  a given number can be raised to a specified power. The parentheses
  require the number as its first argument and the power by which it is
  to be raised as its second argument. The Math.sqrt() method returns 
  the square root of the number specified as its sole argument.
  Both methods return a double type.

  Both these examples could be improved by adding try catch statement 
  blocks to anticipate user errors.*/