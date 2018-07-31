//Import all the functionality of the java.io classes, with the "*"... 
import java.io.*;

class ListFiles
{
   public static void main(String[]args){
//Insert a statement to create a file object for a directory folder
//named "data".
     File dir = new File("data");

//Add an if statement to output the names of all files in that folder
//or a message if the folder is empty.
     if (dir.exists()){
     String[] files = dir.list();
     System.out.println(files.length + " files found...");
     for (int i = 0; i < files.length; i++){
        System.out.println(files[i]);
        }
     }
     else
     { System.out.println("Folder not found."); }
    
   }
}

/*Java contains a package named java.io that is designed to handle file
  input and output procedures. The package can be made availible to a
  program by including an import statement at the very beginning of 
  the .java file, This can use the * wildcard character to mean
  "all classes" in the statement import java.io.*;

  The java.io package has a class named "File" that can be used to
  access files or complete directories. A File object must first be
  created using the new keyword and specifying the filename, or
  directory name, as the constructors argument. For example, the
  syntax to create a File object named "info" to represent a local file
  named "info.dat" looks like this:

  File info = new File("info.dat");

  This file would be located in the same directory as the program, but
  the argument could state the path to a file located elsewhere.
  Note that the creation of a file object does not actually create a file,
  but merely the means to represent a file.

  Once a File object has been created to represent a file, its methods
  can be called to manipulate the file. The most useful File object 
  methods are listed in this table, together with a brief description:

  exists()          true if the file exists - false if it does not.

  getName()         the filename as a String.

  length()          number of bytes in the file, as a long type

  createNewFile()   true if able to create the new unique file.

  delete()          true if able to successfully delete the file.

  reNameTo(File)    true if able to successfully rename the file.

  list()            an array of file or folder names as Strings.  

  The filename specified as the constructor argument must be enclosed
  within quotes dont forget. */         