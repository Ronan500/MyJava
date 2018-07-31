class Array
{
   public static void main(String[]args){
   
   String[] str = {"Much","More","Java"} ;
   int[] num = new int[3] ;
   num[0] = 100 ;
   num[1] = 200 ;
   str[1] = "Better" ;
   System.out.println("String array length is "+str.length);
   System.out.println("Integer array length is "+num.length);
   System.out.println(num[0]+","+num[1]+","+num[2]);
   System.out.println(str[0]+" "+str[1]+" "+str[2]);   

 }
}

/*An array is simply a variable that can contain multiple values - unlike
  a regular variable that can only contain a single value.

  The declaration of an array first states its data type, using one of 
  the data type keywords, followed by square brackets [] to denote that
  it will be an array variable. Next, the declaration states the array 
  variable name, addering to the normal naming conventions.

  An array can be initiallized in its declaration by assigning values
  of the appropriate data type as a comma - delimited list, enclosed
  within curly brackets. For example, the declaration of an integer array
  variable initialized with three values might look like this:
 
  int[] numbersArray = {1, 2, 3,} ;

  The array is created of the length of the assigned list, allowing one
  "element" per value - in this case, an array of three elements.

  Stored values are indexed starting at zero, and each value can be 
  addressed by its element index position. The syntax to do so requires
  the array name to be followed by square brackets containing the 
  element index. For instance, numbersArray[0] would address the first
  value stored in the example above (1).

  Although the values stored in each element can be changed as simply
  as those of regular variables, the size of an array is determined by
  its declaration and can not be changed later. Usefully, the total
  number of elements in an array is stored as an integer in the length
  prorperty of that array. The syntax to address this figure just tacks
  a period and "length" onto the array name. For example, 
  numbersArray.length would return the size of the array in the example
  above - in this case, the integer 3.

  Arrays can also declared without assigning a list of initial values
  by using the new keyword to create an empty array "object" of a 
  specified size. The number of required empty elements is stated in 
  the assignment within square brackets after the appropiate data type.
  For example, the declaration of an empty integer array variable with
  three elements might look like this:

  int[] numbersArray = new int[3] ;

  The elements are assigned default values of zero for int and float
  data types, null for String data types, \0 for char data types, and 
  false for boolean data types.

  String values need to be enclosed within quotes. */ 