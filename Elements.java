class Elements
{
   public static void main(String[]args){
 //Add inistialized int arrays for monthly kiosk sales from all four
 //quarters of a year.
     int[] kiosk_q1 ={42000 , 48000 , 50000};    
     int[] kiosk_q2 ={52000 , 58000 , 60000};
     int[] kiosk_q3 ={46000 , 49000 , 58000};
     int[] kiosk_q4 ={50000 , 51000 , 61000};
 
 //Add initialized int arrays representing monthly outlet sales from 
 //all four quarters of a year.
     
     int[] outlet_q1 = {57000 , 63000 , 60000};   
     int[] outlet_q2 = {70000 , 67000 , 73000};
     int[] outlet_q3 = {67000 , 65000 , 62000};
     int[] outlet_q4 = {72000 , 69000 , 75000};

 //Create an empty int array of 12 elements in which to combine all
 //the monthly sales figures and an int variable in which to record
 //their grand total value.
     
     int[] sum = new int[12];
     int total = 0;

 //Add a for loop to populate each element of the empty array with
 //combined values from the other arrays.

     for(int i = 0; i < kiosk_q1.length; i++){
         sum[i] =   kiosk_q1[i] + outlet_q1[i];
         sum[i+3] = kiosk_q2[i] + outlet_q2[i];
         sum[i+6] = kiosk_q3[i] + outlet_q3[i];
         sum[i+9] = kiosk_q4[i] + outlet_q4[i];}

 //next add a second for loop to output each of the combined monthly
 //sales totals, and to calculate their grand total.

      for(int i = 0; i < sum.length ; i++){
          System.out.println("Month "+(i+1)+" sales:\t" + sum[i]);
           total += sum[i];}
      System.out.println("TOTAL YEAR SALES\t" + total);


 }
}

/*The value stored in an array element can be changed by assigning a
  new value to that particular element using its index number.
  Additionally, any type of loop can be used to efficiently populate
  all the elements in an array from values stored in other arrays.
  This is especially useful to combine data from multiple arrays
  into a single array of totaled data.

  The counter number gets increased by one to produce the month
  numbers 1 - 12. */ 