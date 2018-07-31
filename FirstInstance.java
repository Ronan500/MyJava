class FirstInstance
{
    public static void main(String[]args){

//Insert statements to output the value of each attribute of the Car class
//and call its behavior method.
      System.out.println("Car paint is "+ Car.color);
      System.out.println("Car style is "+ Car.bodyType);
      System.out.println(Car.accelerate());

//Add a statement to create a Porsche instance of the Car class and add
//statements to output the inherited value of each Porsche attribute
//and call its behavior method.
      Car Porsche = new Car();
      System.out.println("Porsche paint is "+ Porsche.color);
      System.out.println("Porsche style is "+ Porsche.bodyType);
      System.out.println(Porsche.accelerate());
      }
}  

/*Each class has a built in "constructor" method that can be used to 
  create a new instance of that class. The constructor method has the
  same name as the class, and is invoked with the "new" keyword.

  Each instance of a class inherites the objects attributes and behaviors.
  The principle of inheritance is used throughout Java so that programs
  can use ready - made properties.

  To be more flexible, object class templates can be definied in a file
  other than that containing the programs. This means they can be 
  readily used by multiple programs.

  A virtual class is created for the new Porsche object that replicates
  the original Car class. Both these objects contain static
  "class variables" and a "class method", which are addressed using 
  the class name and dot notation - as these members are globally
  accessible, this is not considered good programming practice.

  Whilst this example demonstrates how instances of an object inherit
  properties of the original class, it is improved in the next example 
  ("SafeInstance.java" file name,) that uses non-static members to 
  create "instance variables" and an "instance method", which cannot
  be addressed from outside the class - as these members are not globally
  accessible, this is considered good programming practice.

  You cannot address the motion variable directly - it is out of scope
  within the method declaration.

  The compiler automatically finds the Car class in the external .java
  file - and creates a compiled .class file for it. */

   
  

  