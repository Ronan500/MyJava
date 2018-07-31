class Overload
{
   public static void main(String[]args){

//Between the curly brackets of the main method, insert three statements
//calling different overloaded methods and passing them argument values.
     System.out.println(write(12));
     System.out.println(write("Twelve"));
     System.out.println(write(4 , 16)); 
    }

//After the main method, before the final curly brackets of the class,
//add the three overloaded methods to each return a String to the caller.

   public static String write(int num){
       return("Integer passed is "+ num); 
    }

   public static String write(String num){
       return("String passed is "+ num);
    }

   public static String write(int num1, int num2){
       return("Sum Total is "+(num1 * num2));
    }

}

/*A class may even contain multiple methods of the same name providing
  they each have different arguments - requiring a different number 
  of arguments, or arguments of different data types. This useful 
  feature is known as method "overloading".

  The declaration for each of the overloaded methods must indicate
  that the method returns a String value, not void. */