class Random
{
   public static void main(String[]args){

//Assign a random number to a float variable, and output its value.    
    float random = (float)Math.random();
    System.out.println("Random number: "+random);

//Assign a multiplication of the random number to a second float variable
//and output its value.
    float multiplied = random * 10;
    System.out.println("Multiplied number: "+multiplied);

//Assign a rounded integer of the multiplied random number to an 
//int variable, and output its value.
    int randomint = (int)Math.ceil(multiplied);
    System.out.println("Random Integer: "+randomint);
 }
}

/*The Math class within the java.lang package provides the ability to
  generate random numbers with its Math.random() method, which returns
  returns a double precision random number between 0.0 and 0.999.
  Multiplying the random number will specify a wider range. For
  example, multiplying by 10 will create a random number in the range of
  0.0 to 9.999. Now rounding the random number up with Math.ceil() will
  ensure it falls within the range of 1 - 10 inclusive. */