import java.io.*;

class WriteFile
{
   public static void main(String[]args){

     try{

//Insert a statement to create a FileWriter object for a text file
//named "Tam.txt"
        FileWriter file = new FileWriter("Tam.txt");

//Create a BufferedWriter object to write the file.
        BufferedWriter buffer = new BufferedWriter(file);

//Add statements to write lines of text and newline characters into 
//the text file - for example, a translated verse from "Tam O'Shanter"
//by Robert Burns.       
        buffer.write("The wind blew as if it had blown its last");
            buffer.newLine();
        buffer.write("The rattling showers rose on its blast");
            buffer.newLine();
        buffer.write("The speedy gleams the darkness swollowed");
            buffer.newLine();
        buffer.write("Loud, deep and long the thunder bellowed");
            buffer.newLine();
        buffer.write("That night a child might understand");
            buffer.newLine();
        buffer.write("The devil had business on his hand.");

//Close the BufferedWriter object when it is no longer needed.            
        buffer.close();

     }
     catch(IOException e)
     { System.out.println("A write error has occured."); }
  
  }
}

/*In the java.io package the FileReader and BufferedReader classes,
  which are used to read text files, have counterparts named FileWriter
  and BufferedWriter that can be used to write text files.

  A FileWriter object is created using the new keyword, and takes
  the name of the file to be written as its argument. Optionally,
  the argument can include the full path to a file to be written in a 
  directory outside that in which the program is located.

  The BufferedWriter object is created with the new keyword, and takes 
  the name of the FileWriter object as its argument. Text can then be
  written with the write() method of the BufferedWriter object, and lines
  separated by calling its newLine() method. These methods should be 
  called from within a try catch statement to catch any IOException
  problems that may arise.

  If a file of the specified name already exists, its contents will be
  over written by the write() method, otherwise a new file of that 
  name will be created and its content written.

  You can call the append() method of the BufferedWriter object to
  add text rather than overwritting text with the write() method. */