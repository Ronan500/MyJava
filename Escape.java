class Escape
{
      public static void main(String[] args)
      { 
         String header = "\n\tNEW YORK 3-DAY FORECAST:\n";
         header += "\n\tDay\t\tHigh\tLow\tConditions\n";
         header += "\t---\t\t----\t---\t----------\n";

         String forecast = "\tSunday\t\t68F\t48F\tSunny\n";
         forecast += "\tMonday\t\t69F\t57F\tSunny\n";
         forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";

         System.out.println(header + forecast);
      }



}


/*Escaping literals.. The numerical and text values in java programs
  are known as "Literals"- they represent nothing but are, literally
  what you see.
  
  Literals are normally detached from the keywords of the java language
  but where double puotes or single puotes are required with a string
  value it is nessesary to indicate that the quote character is to be 
  treated literally to avoid prematurely terminating the String.
  This is easily achieved by immediately prefixing each nested 
  quote character with the \ escape operator. For example,
  including a quote within a String variable, like this:

  String quote = "\"Fortune favors the brave.\" said Virgil";

  Additionally the \ escape operator offers a variety of useful escape
  sequences for simple output formatting:
  \n       Newline
  \t       Tab
  \b       Backspace
  \r       Carriage return
  \f       Formfeed
  \\       Backslash
  \'       Single quote mark
  \"       Double quote mark

  The \n newline escape sequence is frequently used within long String
  values to display the output on multiple lines.
  Similarly, the \t tab escape sequence is frequently used to display
  the output in columns. Using a combination of \n newline and \t tab
  escape sequences allows the output to be formatted in both rows
  and columns - to resemble a table.*/  
  