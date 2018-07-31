class Break

{
     public static void main(String[]args)
     {  for(int i = 1; i < 4; i++)
   
         for(int j = 1; j < 4; j++)
         {
             if(i == 1 && j == 1)
             {
                  System.out.println("Continue Inner loop when i="+i+" j="+j);
                    continue;
             }


             if(i == 2 && j == 1)
             {
                 System.out.println("Breaks Inner Loop when i="+i+ " j=" +j);
                 
                 break; 
               
             }
                 

                
                System.out.println("Running i=" + i +" j="+j);
          }
      }

}

/*The break keyword can be used to prematurely terminate a loop when a
  specified condition is met. The break statement is situated inside the 
  loop statement block, and is preceeded by a test expression. When the 
  test retuens true, the loop ends immediately and the program proceeds 
  on to its next task. For example, in a nested loop it proceeds to the 
  next iteration of its outer loop.

  This program makes three iterations of the outer loop, which executes
  the inner loop on each iteration. A break statement can be added to stop
  the second execution of the inner loop.

  The continue keyword can be used to skip a single iteration of a loop
  when a specified condition is met. The continue statement is situated
  inside the loop statement block and is preceeded by a test expression
  When the test returns true, that iteration ends. */