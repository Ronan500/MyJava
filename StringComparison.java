class StringComparison
{
   public static void main(String[]args){
 
//Create and initialize a String variable with a correct lowercase password
    String password = "bingo"; 
    
//Add a try catch statement to catch the exceptions that occurs when
//no password argument is entered.
    try {                

//Insert this if else statement into the try statement block to evaluate
//the password argument entered by the user.
    if(args[0].toLowerCase().equals(password)){
       System.out.println("Password Accepted.");}
     
    else{
       System.out.println("Incorrect Password.");} 
       
        }  
     
//Catch part of the try catch block just at the end of try block.
    catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("Password Required.");}
        
    catch(Exception e)
        {System.out.println("Password Required.");}
       
 }
}

/*The String class within the java.lang package provides the useful
  equals() method that was introduced on page 66 (Option.java file)
  to evaluate a command line argument in the args[0] element.
  This can also be used to compare any two String values by tacking the
  method name onto the first String variable using dot notation,
  and specifying the String to be compared as its argument.
  For example, the syntax to compare txt2 to txt1 is txt1.equals(txt2).
  When both String values have identical characters, in the same order
  the method returns true - otherwise, it returns false.

  String values that use different letter case, such as "Java" 
  and "JAVA", are not considered equal because the ASCII code values
  of the characters differ. For instance, the value of uppercase "A"
  is 65, whereas lowercase "a" is 97.

  To compare an input String value, where the letter case entered 
  by the user is uncertain, against a String value in the program it
  is often useful to transform the input into a particular case.
  For this purpose, the String class provides a toUpperCase() method
  and a toLowerCase() method. The input String is specified as the 
  argument, and the method returns the transformed  String.

  A typical example might force a user-input password String to lowercase
  before comparing it to the correct password stored in all lowercase
  in a String variable within the program. This would allow the user
  to enter their password in uppercase, lowercase, or a mixture of 
  both cases where case-insensitive passwords are permissible.

  Dot notation allows methods to be tacked onto other methods so their
  operation can be performed in sequence. This means that 
  toLowerCase().equals() can be used to transform a String value to 
  lowercase and then compare that lowercase version against a 
  specified argument .

  Be sure to observe correct capitalization using a capital "C" in 
  the toUpperCase and toLowerCase methods. */

