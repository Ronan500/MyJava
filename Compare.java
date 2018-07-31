class Compare
{
   public static void main(String[]args){

//Declare and initialize an float variable and a int variable.  
    float num1 = 24.75f;
    int num2 = 25;

//Output the greater value.
    System.out.println("Most is "+Math.max(num1, num2));

//Output the lesser value.
    System.out.println("Least is "+Math.min(num1, num2));
 }
}

/*The Math class within the java.lang package two methods to compare
  two numerical values. The Math.max() method and the math.min() method
  each require two numbers to be stated as their arguments. Math.max()
  will return the greater number and Math.min() will return the smaller
  number.
  The numbers to be compared can be of any numerical data type, but the
  result will be returned as a double data type. */