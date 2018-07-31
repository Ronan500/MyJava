class CharacterSwap
{
  public static void main(String[]args){

//declare and Initialize an empty String variable. 
    String txt = "";

//Assign some characters to the String variable, if it is indeed empty,
//with both leading and trailing spaces.
    if(txt.isEmpty())txt = "   Borrocudo    ";

//Output the String value and the number of characters it contains.
    System.out.println("String: "+ txt);
    System.out.println("Original String Length: "+ txt.length());

//Remove the leading and trailing spaces, then output the String 
//value and its size again.
    txt = txt.trim();
    System.out.println("String: "+ txt);
    System.out.println("String Length: "+ txt.length());

//Output the first character in the String.
    char initial = txt.charAt(0);
    System.out.println("First Letter: "+ initial);

//Now output the last character in the String.
    initial = txt.charAt((txt.length() -1));
    System.out.println("Last Letter: "+ initial);

//Replace all occurrences of the letter "o" with letter "a".
    txt = txt.replace('o', 'a');
    System.out.println("String: " + txt);
 }
}

/*The String class within the java.lang package provides the trim()
  method that is used to remove any white spaces from the beginning and end
  of the String specified as its argument. This method will remove all
  extreme spaces, newlines, and tabs, returning the trimed version of 
  that String.

  An individual character in a String can be addressed by stating its 
  index position within the String as the argument to its char()
  method, This method treats the String as an array of characters where
  the first character is positioned at zero - just like other arrays
  whose elements are indexed starting at zero. The first character in 
  a String can be addressed as charAt(0), the second character
  as charAt(1), and so on.

  As character indexing begins at zero, the final character in a String
  will always have an index number that is one less than the total 
  number of characters in the String. This means that the final character 
  in any String has the index number equivalent to length()-1.
  The final character in a String named "str" can, therefore, be 
  addressed as str.charAt(str.length()-1).

  All occurrences of a particular character in a String can be replaced
  by another character using its replace() method. This method requires
  two arguments that specify the character to be replaced and the 
  character that is to take its place. For example, to replace all 
  occurrences of the letter "a" with the letter "z", the syntax would be

  replace('a','z')

  The isEmpty() method can be used to discover if a String contains no
  characters. This method will return true if the String is absolutely
  empty, otherwise it will return false. */ 
   