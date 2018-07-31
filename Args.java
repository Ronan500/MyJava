class Args
{
   public static void main(String[]args)
   {
     
       if(args.length !=3)
       {
          System.out.println("Wrong number of arguments");
          return;
        }
     
     int num1 = Integer.parseInt(args[0]);
     int num2 = Integer.parseInt(args[2]);
     String msg = args[0] + args[1] + args[2] + " = ";
      
      if(args[1].equals("+"))         msg += (num1 + num2);
      else if(args[1].equals("-"))    msg += (num1 - num2);
      else if(args[1].equals("*"))    msg += (num1 * num2);
      else if(args[1].equals("/"))    msg += (num1 / num2);
      else msg = "Incorrect operator";
     
      System.out.println(msg); 
    

 }
}

/*Multiple arguments can be passed to a program at the command line,
  following the program name and a space. The arguments must be must be
  separated by at least one space and their values placed. in order,
  into the elements of the args[] array. Each value can then be addressed
  by its index number as with any other array - args[0] for the first 
  argument, args[1] for the second argument, and so on.

  The program can test the length propety of the args[] array to ensure
  the user has entered the appropriate number of arguments.
  When the test fails, the return keyword can be used to exit the 
  main method, thereby exiting the program.

  The return keyword exits the current method. It can also return a value
  to the point where the method was called. 

  This program will report an error if non numeric values are entered. */  