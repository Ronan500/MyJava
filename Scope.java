class Scope
{

//A global class String variable constant of the same name as the 
//local method variable.
//Add a statement at the end of the main method to output the value 
//of the gloabal class variable.
 
  final static String txt = 
              "This is a global variable of the Scope class";

//Declare and initalize a local String variable between the curly brackets 
//of the main method, and output its value.

   public static void main(String[]args){
     String txt = "This is a local variable in the main method";
     System.out.println(txt);
     System.out.println(Scope.txt);
     sub();
     }

//After the main method, before the final curly brackets of the class
//add another method named "sub". 
//between the curly brackets of the sub method, declare and initialize 
//a local String variable of the same name as the variable in the main
//method.

   public static void sub(){
     String txt = "This is a local variable in the sub method";
     System.out.println(txt);
     }

//Dont forget to insert the sub  method at the end of the main method
//"sub();." 


}

/*Comment out the line that declares the local variable in sub method 
  so the output statement will now address the gloadal variable of 
  the same name.

  A variable that is declared inside a method is only accessible from 
  inside that method - its "scope" of accessiblity is only local to the
  method in which it is declared. This means that a variable of the same
  name can be declared in another methos without conflict.

  A counter variable declared in a for loop cannot be accessed outside
  the loop - its scope is limited to the for statement block.

  The static keyword that is used in method declarations ensures that the 
  method is a "class method" - globally accessible from any other 
  method in the class.

  Similarly a "class variable" can be declared with the static keyword
  to ensure it is globally accessible throughout the class. Its 
  declaration should be made before the main method declaration,
  right after the curly brackets following the class declaration.

  A program may have a global class variable and local method variable
  of the same name. The local method variable takes precedence unless
  the global class variable is explicitly addressed by the class name
  prefix using dot notation, or if a local variable of the name has 
  not been declared.

  Use local method variables wherever possible to avoid conflicts
  global class variable are typically only used for constants. */

  