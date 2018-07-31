class SubClass extends SuperClass
{
   public static void main(String[]args){
   hello();
   SuperClass.hello();

   try{
   echo(args[0]);
   System.out.println("You entered: "+ args[0]);}
   catch(Exception e){
   System.out.println("Argument required");}
   }

//Add a method that outputs an identifing String, overriding the
//inherited method of the same name in the above main method.

   public static void hello(){
      System.out.println("Hello from the Sub Class");
      }
}

/*A class can inherit the features of another class by using the
  extends keyword in the class declaration to specify the name of the
  class from which it should inherit. For example, the declaration
  class Extra extends Base inherits from the Base class.

  The inheriting class is described as the "sub" class, and the class
  from which it inherits is described as the "super" class. In the 
  example declaration above, the Base class is the super class and
  the Extra class is the sub class.

  Methods and variables created in a super class can generally be
  treated as if they existed in the sub class providing they have not 
  been declared with the private keyword, which denies access from
  outside the original class.

  A method in the sub class will override a method of the same name 
  that exists in its super class unless their arguments differ.
  The method in the super class may be explicitly addressed using its
  class name and dot notation. For example, SuperClass.run()
  
  It should be noted that a try catch statement in a method within
  a super class does not catch exceptions that occur in a sub class
  - the callinf statement must be enclosed within its own try catch 
  statement to catch those exceptions.

  Also checkout SuperClass.java file for other notes and annotations.*/