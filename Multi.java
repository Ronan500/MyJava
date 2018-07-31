class Multi
{
   public static void main(String[]args){
     
     String msg = "This is a local variable in the multi class";
     System.out.println(msg);

//A class String variable constant named "txt" from a class named "Data".
     System.out.println(Data.txt);

//A method named "greeting" from the Data class. 
     Data.greeting();

//A method named "line" from a class named "Draw".
     Draw.line();
     }
}

/*In the same way a program may have multiple methods, larger programs
  may consist of several classes - where each class provides specific
  functionality. This modular format is generally preferable to writting
  the entire program in a single class as it makes debugging easier
  and provides better flexiblity.

  The public keyword that appears in declarations is an "access modifier"
  that determines how visible an item will be to other classes. It can
  be used in the class declaration to explicitly ensure that class will
  be visible to any other class. If it is ommitted, the default access
  control level allows access from other local classes.
  The public keyword must always be used with the programs main method,
  however, so that method will be visible to the compiler.

  The compiler will automatically find classes in adjacent external
  .java files - and create compiled .class files for each one.

  The public keyword allows access from any other class, but default
  access only allows access from classes in the same package. */