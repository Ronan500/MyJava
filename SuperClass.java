class SuperClass
{
   public static void hello(){
      System.out.println("Hello from the Super Class");
      }

   public static void echo(String arg){
       try{
       System.out.println("You entered: "+ arg);}
       catch(Exception e){
       System.out.println("Argument required");}
       }
}

/*This is the SuperClass.java file that gets inherited to the SubClass.java
  file which inherits features from this class.

  Open file name SubClass.java to see notes and annotations.*/ 