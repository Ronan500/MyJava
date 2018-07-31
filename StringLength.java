class StringLength
{
   public static void main(String[]args){

//Create and initialize two String variables.   
     String lang = "Java";
     String series = " in easy steps";

//Add another String variable and assign it the concatenated value of the
//other two String variables.
     String title = lang.concat(series);

//Output the concatenated String within quotation marks,
//together with its size.
      System.out.print("\""+title+"\" has ");
      System.out.println(title.length()+" characters");
 }
}

/*In Java programming, a String is zero or more characters enclosed
  within quotation marks, So, these are all valid String values:
   
  String txt1 = "My First String";
  String txt2 = "";
  String txt3 = "2";
  String txt = "null";

  The empty quotes of txt2 initialize the variable as an empty String
  value. The numeric value assigned to txt3 is a String representation
  of the number. The Java null keyword, which normally represents the
  absence of any value, is simply a String literal when it is enclosed 
  within quotes.

  Essentially, a String is a collection of characters; each character
  containing its own data - just like elements in a defined array.
  It is, therefore, logical to regard a String as an array of characters
  and apply array characteristics when dealing with String values.

  The String class is part of the fundamental java.lang package and 
  provides a length() method that will return the size of a String,
  much like the length property of an array. Each String variable is
  created as an "instance" of the String class so its methods can be
  used by tacking their name onto the variable name using dot notation.
  For example, the sytax to return the size of a String variable
  named txt is txt.length().

  The String class within the java.lang package also provides an
  alternative to the + concatenation operator for joining String
  values together. Its concat() method requires a single argument 
  specifying the second String to be appended. In use it is tacked onto
  the variable name of the String using dot notation. For example,
  append txt2 onto txt1 using txt1.conct(txt2).

  Array.length is a property but String.length() is a method - so it
  must have trailing parentheses.

  Spaces are part of the String so are included in the character count
  but the quotation marks are not included in the program above. */ 