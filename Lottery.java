class Lottery
{
   public static void main(String[]args){

//Create int array of 60 elements, then fill elements 1-59 with 
//inttegers 1-59.
      int[] nums = new int[60];
      for(int i = 1; i < 60; i++){nums[i] = i;}

//Shuffle the values in elements 1-59.
      for(int i = 1; i < 60; i++){
          int r = (int)Math.ceil(Math.random() * 59);
          int temp = nums[i];
          nums[i] = nums[r];
          nums[r] = temp; }

//Output only those values contained in elements 1-6. 
      for(int i = 1; i < 7; i++){
          System.out.print(Integer.toString(nums[i]) + " ");}

 }
}

/*A sequence of six non-repeating random numbers within the range 1-59
  inclusive can be generated using Math.random() to produce a 
  random lottery selection. */