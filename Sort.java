import java.util.Arrays;

class Sort
{
   public static void main(String[]args){
//Declare and initialize a String array and an int array.
     String[] names = {"Mike", "Dave", "Andy"};
     int[] nums = {200, 300, 100};

//Output the contents of all elements in each array.
     display(names);
     display(nums);

//Sort the element contents of both arrays.
     Arrays.sort(names);
     Arrays.sort(nums);

//Output the contents of all elements in each array again.
     display(names);
     display(nums); 
   }

//Insert a method to display all element contents of a passed String array.
   public static void display(String[]elems){
      System.out.println("\nString Array: ");
      for(int i = 0; i < elems.length; i++)
      System.out.println("Element "+ i +" is "+elems[i]);
      }

//Add an overloaded version of the display() method to display all element
//contents of a passed int array. 
   public static void display(int[]elems){
      System.out.println("\nInteger Array:");
      for(int i = 0; i < elems.length; i++)
      System.out.println("Element "+i+" is "+elems[i]);
      } 
}

/*Java contains a package named java.util that provides useful utilities
  for handling collection of data. The package can be made availble to a
  program by including an import statement at the very beginning of 
  the .java file. This can use the * wildcard character to mean 
  "all classes" in the statement import java.util.*;  

  The java.util package has a class named "Arrays" that has methods
  which can be used to manipulate arrays. Its functionality can be made 
  available to the program by importing all classes from the java.util
  package or, where the program only requires a single class, 
  the import statement can import just that specified class. For example,
  the program can import the Arrays class with the statement 
  import java.util.Arrays; .

  The Arrays class has a sort() method that can rearrange the contents
  of array elements alphabetically and numerically. 

  The for loops in this example each execute a single statement so
  no curly brackets are required - but they could be added for clarity.*/