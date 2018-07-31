class Loops
{
   public static void main(String[]args){
   //if statement to test if any arguments have been entered into the 
   //args[] array from the command line.  
      if(args.length > 0){
         for(int i = 0; i < args.length; i++){
           System.out.println("args["+i+"] is | "+ args[i]);}
      }   
      
   //while loop to out put value stored in each element of the array.
      String[] htm = {"HTML5","in","easy","steps"};
      int j = 0;
      while(j < htm.length){
         System.out.println("\t\thtm["+j+"] is | " + htm[j]);
          j++;}
      
   //do while loop to out put the value stored in each element of array.
      String[] xml = {"XML","in","easy","steps"};
      int k = 0;
      if(xml.length > 0)do{
          System.out.println("\t\t\t\txml["+k+"] is | "+xml[k]);
          k++;}
      while(k < xml.length);    
 
 }
}

/*All types of loop can be used to easily read all the values stored
  inside the elements of an array. The loop counter should start with
  the index number of the first element then proceed on up to the
  final index number. The index number of the last element in an array
  will always be one less than the array length - because the index 
  starts at zero.

  It is useful to set the array length property as the loops conditional
  test determining when the loop should end. This means that the loop
  will continue until the counter value exceeds the index number of 
  the arrays final element.

  Notice that the do statement is preceded by a conditional test to
  ensure the array is not empty before attempting to output the 
  value of the first element. */   
 