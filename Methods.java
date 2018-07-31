class Methods
{
    public static void main(String[]args){
       System.out.println("Message from the main method.");
       sub();
    }

//After the main method, before the final curly brackets of the class,
//add the second method to output a message.    

     public static void sub(){
     System.out.println("Message from the sub method.");
    }

}

/*Programs are typically split into separate methods in order to create
  modules of code that each perform tasks, and that can be called
  repeatedly throughout the program as required. Splitting the program into 
  multiple methods also makes it easier to track down bugs, as each method
  can be tested individually. Further methods may be declared, inside 
  the curly brackets that follow the class declaration, using the same
  keywords that are used to declare the main method. Each new method 
  must be given a name, following the usual naming convensions, and may
  optionally specify arguments in the parenthesesafter its name. 

  The syntax to call a method without arguments just needs the method
  name, followed by parentheses.  */