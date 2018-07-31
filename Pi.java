class Pi
{
   public static void main(String[]args){

//try block to catch exceptions.
  try{
//Declare and initialize a float variable from a command line argument
//and cast the double Math.PI constant into a second float variable.
   float radius = Float.parseFloat(args[0]);
   float shortPi = (float)Math.PI;

//Perform mathematical calculations using the cast value,
//assigning results to more float variables.  
   float circ = shortPi * (radius + radius);
   float area = shortPi * (radius * radius);

//Output the value of Math.PI and its cast float rquivalent,
//followed by the results of the calculations.
   System.out.print("With Pi commuted from " + Math.PI);
   System.out.println(" to " + shortPi + "...");
   System.out.println("A circle of radius " + radius + "cm");
   System.out.println("has a circumference of "+ circ + "cm");
   System.out.println("and an area of " + area + "sq.cm");}
  catch(NumberFormatException e )
    {System.out.println("Argument is wrong format, must be a number.");} 
  catch(ArrayIndexOutOfBoundsException e)
    {System.out.println("Integer argument required from command line.");}
 }
}

/*The Math class without the java.lang package provides two constant
  values that are often useful to perform mathimatical calculations.
  Math.PI stores the value of Pi, and Math.E stores the value that is
  the base of natural logarithms. Both these constant values are stored 
  as double precision data types with 15 decimal places.

  The commuted value of Pi usually provides sufficient precision. */