import java.io.*;

class ReadFile
{
   public static void main(String[]args){

//Try catch block to catch any exception errors.
     try{

//Insert a statement to create a FileReader object.
       FileReader file = new FileReader("Oscar.txt");

//Create a BufferedReader object to read the file.
       BufferedReader buffer = new BufferedReader(file);

//Declare and initialize an empty String variable in which to 
//store a line of text.
       String line = "";
     
//A loop to read the text file contents into the variable and output
//each line of text.
     while((line = buffer.readLine() ) != null){
        System.out.println(line); }

//Close the BufferedReader object when it is no longer needed.
     buffer.close();
     }
     catch(IOException e)
     { System.out.println("A read error has occured."); }
  }
}

/*The java.io package contains a class named FileReader that is especially
  designed to read text files. This class is a sub class of the 
  InputStreamReader class that can be used to read console input by
  converting a byte stream into integers that represent Unicode
  character values.

  A FileReader object is created using the new keyword, and takes 
  the name of the file to be read as its argument. Optionally, the
  argument can include the full path to a file outside the directory
  where the program is located.

  In order to efficiently read the text file line-by-line, the readLine()
  method of a BufferedReader object can be employed to read the 
  characters decoded by the FileReader object. This method must be 
  called from within a try catch statement to catch any IOException
  problems that may arise.

  Reading all lines in a text file containing multiple lines of text
  is accomplished by making repeated calls to the readLine() method
  in a loop. At the end of the file the call will return a null value,
  which can be used to terminate the loop.

  The text file specified as the FileReader argument must be enclosed
  within quotation marks. */