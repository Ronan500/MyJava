class StringSearch
{
   public static void main(String[]args){
//Create an initialized array of book titles.    
    String[] books = { 
                       "Java in easy steps", "XML in easy steps",
                       "SQL in easy steps", "CSS in easy steps",
                       "Gone With The Wind", "Drop the Defence" };


//Create and initialize three int counter variables.
    int counter1 = 0, counter2 = 0, counter3 = 0;

//Add a for loop to iterate through the string array, listing as 
//output the first four characters of each title.
    for(int i = 0; i < books.length ; i++){
       System.out.print(books[i].substring(0,4)+" | ");

//Insert a statement in the for loop block to count the titles
//found with a specified ending.
    if(books[i].endsWith("in easy steps"))counter1++;

//Insert a statement in the for loop block to  count the titles
//found with a specified beginning.
    if(books[i].startsWith("Java"))counter2++;

//Insert a statement in the for loop block to count the titles 
//found not containing a specified a specified substring.
//The ! NOT operator cannot be used to test if the indexOf() method
//has failed - because it returns an integer value. 
    if(books[i].indexOf("easy") == -1)counter3++;}

//At the end of the main method, add these statements to output
//the results of each search.
    System.out.println("\nFound "+ counter1+" titles from this series");
    System.out.println("Found "+ counter2 + " Java title");
    System.out.println("Found "+ counter3 + " other titles");   

 }
}

/*The String class within the java.lang package provides startWith()
  and endsWith() methods to compare portions of a String value.
  These are especially useful to compare a number of String values and 
  select those with common beginnings or common endings.
  When the String section matches the specified argument, the method
  returns true - otherwise ,it returns false.

  A portion of a String value can be copied by stating the position
  number of the first character to be copied as the argument to its
  substring() method. This will return a substring of the original String
  value, starting at the specified start position and ending at
  the end of the original String.

  Optionally, the substring() method can take a second argument to specify
  the position number of the final character to be copied.
  This will return a substring of the original String value, starting
  at the specified start position and ending at the specified end position.

  A String value can be searched to find a character or substring 
  specified as the argument to its indexOf() method. Unusually, this
  method returns the numeric position of the first occurrence of the
  matched character or substring within the searched String value.
  Where no match is found,the method returns the negative integer
  value of -1. */