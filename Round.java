class Round
{
   public static void main(String[]args){

//Declare and initialize a float variable.     
     float num = 7.25f;

//Output the rounded float value as an int value.
     System.out.println(num +" rounded is "+Math.round(num));

//Output the rounded float value as double values.
     System.out.println(num +" floored is "+Math.floor(num));
     System.out.println(num +" ceiling is "+Math.ceil(num));
 }
}

/*The Math class within the java.lang package provides three methods
  to round floating-point numbers to the nearest integer.
  Simplest of these is the Math.round() method that rounds a number
  stated as its argument up, or down, to the closest integer.

  The Math.floor() method rounds down to the closest integer below,
  and Math.ceil() rounds up to the closest integer above.

  While the Math.round() method returns an int data type, both 
  Math.floor() and Math.ceil() methods return a double data type. 

  By default, Math.round() will round up - so 7.5 would be rounded
  up to 8. */