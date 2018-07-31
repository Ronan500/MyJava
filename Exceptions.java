class Exceptions
{
   public static void main(String[]args){
       
    try{ 
        int num = Integer.parseInt(args[0]);
        System.out.println("You entered: "+num);}

   catch(NumberFormatException e)
        {System.out.println("Argument is wrong format.");}

    catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("Integer argument required.");}

  

    finally
        {System.out.println("Program ends.");} 
        

 }
}

/*A program may encounter a runtime problem that causes an "exception"
  error, which halts its execution. Often this will be created by
  unexpected user input. A well-written program should, therefore,
  attempt to anticipate all possible ways the user might cause exceptions
  at runtime.

  Code where exceptions might arise can be identified and enclosed 
  within a try catch statement block. This allows the program to handle
  exceptions without haulting execution and looks like this:

  try 
     {
         statement where an exception may arise
     } 
  catch(Exception e)
     {
         statement responding to an exception  
     }

  The parentheses following the catch keyword specify the class of
  exception to be caught and assign it to the variable "e". The top-level
  Exception class catches all exceptions. Responses can be provided for
  specific exceptions, however, using multiple catch statements to
  identify different lower-level exception classes.

  The most common exceptions are the NumberFormatException, which arises
  when the program encounters a value that is not of the expected 
  numeric type, and the ArrayIndexOutOfBoundsException, which arises
  when the program attempts to address an array element number 
  that is outside the index size. It is helpful to create a separate
  response for each of these exceptions to readily notify the user 
  about the nature of the problem.

  Optionally, a try catch statement block can be extended with a finally 
  statement block, containing code that will always be executed
  irrespective of whether the program has encountered exceptions.

  The e.getMessage() method returns further information about some
  captured exceptions. */
   