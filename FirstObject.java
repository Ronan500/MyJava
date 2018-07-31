class Car
{
//Declare and initialize two global String constants describing attributes.

   public final static String color = "Red";
   public final static String bodyType = "Coupe";

//Add a global method describing a behaviour.

   public static String accelerate(){
     String motion = "Accelerating...";
     return motion ; 
     }
   
}

//After the Car class, start a new program class named "FirstObject"

class FirstObject
{
   public static void main(String[]args){

//In the main method, insert statements to output the value of each
//Car attribute and call its behaviour method.

      System.out.println("Paint is "+ Car.color);
      System.out.println("Style is "+ Car.bodyType);
      System.out.println(Car.accelerate());
      }

}

/*Object classes are normally created before the program class containing
  the main method.

  The static keyword declares class variables and class methods - in this
  case, as members of the Car class.

  Real world objects are all around us, and they each have attributes
  and behaviours that we can describe:

  --Attributes describe the features that an object has--

  --Behaviors describe actions that an object can perform--

  For example, a car might be described with attributes of "red" and
  "coupe", along with an "accelerates" behavior.

  These features could be represented in Java programming with a Car
  class containing variable properties of color and bodyType,
  along with an accelerate() method.

  Java is said to be an Object Oriented Programming (OOP) language 
  because it makes extensive use of object attributes and behaviors
  to program tasks.

  Objects are created in Java by defining a class as a template from
  which different copies, or "instances", can be made.

  Each instance of the class can be customised by assigning attribute
  values and behaviors to describe that object.

  The Car class is created as a class template in the steps described
  above - with the default attributes and behavior outlined above.
  An instance of the Car class is created in the steps described in 
  file named "FirstInstance.java", inheriting the same default
  attributes and behavior. */