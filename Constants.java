/*The "final" keyword is a modifier that can be used when declaring
  variables to prevent any subsequent change to the values that are 
  initially assigned to them, This is useful when storing a fixed value
  in a program to avoid it becoming altered accidently.
  Variables created to store fixed values in this way are known as 
  "constants", and it is convention to name all constants with all
   uppercase characters - to distinguish them from regular variables.
   Programs that attempt to change a constant value will not compile
   and the javac compiler will generate an error message.*/ 


class Constants
{
       public static void main(String[] args)
       {
           //initialise three integer constants
           final int TOUCHDOWN = 6 ;
           final int CONVERSION = 1 ;
           final int FIELDGOAL = 3 ;
           
           //declare four regular integer variables
           int td , pat , fg , total ; 
          
           //initialise the regular variables using multiples of the 
           //constant value
           td = 4 * TOUCHDOWN ;           //4 * 6 = 24
           pat = 3 * CONVERSION ;         //3 * 1 = 3
           fg = 2 * FIELDGOAL ;           //2 * 3 = 6
           total = (td + pat + fg) ;      //24 + 3 + 6 = 33

           System.out.println("Score: " + total);       
       }


}