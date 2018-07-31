class Convert
{
    public static void main(String[]args)
   {
    float daysFloat = 365.25f;
    String weeksString = "52";

    int daysint = (int)daysFloat;
    int weeksint = Integer.parseInt(weeksString);
    
    int week = (daysint / weeksint);
    System.out.println("Days per week: "+week);
   }
}

/*Handling values in Java programming requires correct data typing to be
  closely observed to avoid compiler errors. For example, sending a 
  float type value to a method that requires an int type value will
  produce a compiler error. This means it is often necessary to convert
  a value to another data type before it can be processed.

  Numeric values can be easily "cast" (converted) into another numeric
  data type using this syntax:

  (data-type) value

  Some loss of precision will occur when casting float floating point 
  values into an int data type, as the number will be truncated at the
  decimal point. For example, casting a float value of 9.9 into an int
  variable produces an integer value of nine.

  Interestingly, character values of the char data type can automatically
  be used as integer values because they each have a unique integer
  representation. This is there numeric code value in the ASCII character
  set, which is supported by Java. The uppercase letter A, for instance
  has the code value of 65.

  Numeric values can be converted to the String data type using the 
  toString() method of that values data type class. This takes the
  numeric value as its argument, within the parentheses. For example, 
  convert an int num variable to a String with Integer.toString(num).
  Similarly, convert a float num variable to a String with 
  Float.toString(num). In practice, this technique is not always required
  because Java automatically converts concatenated variables to a String 
  if anyone of the variables has a String value.

  More frequently, you will want to convert a String value to a numeric 
  data type so the program can use that value arithmatically.
  A String value can be converted to an int value using the 
  Integer.parseInt() method. This takes the String value as its argument
  within the parentheses. For example, convert a String msg variable to an
  int with Integer.parseInt(msg). Similarly, convert a String msg variable
  to a float with Float.parseFloat(msg). When converting a String value
  to a numeric data type, the String may only contain a valid numeric 
  value, or the compiler will report an error.

  All numeric classes have a parse... method and a toString method
  allowing convertion between String values and numeric data types. */ 