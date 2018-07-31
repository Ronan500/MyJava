class Label
{
     public static void main(String[]args)
     {
        OuterLoop:for(int i = 1; i < 4; i++)
        {
          for(int j = 1; j < 4; j++)
          {
             if(i==1 && j==1)
             {
                System.out.println("Continue OuterLoop when i="+i+" j=" +j);
                continue OuterLoop ;
             }             

               if(i==2 && j==3)
             {
                System.out.println("Break OutLoop when i="+i+" j="+j);
                break OuterLoop ;
             }    

             System.out.println("Running i="+i+" j=" +j);
          }        
         }

      }

}

/*The default behaviour of the break and continue keywords can be changed
  to explicity specify that control should return to a labeled outer
  loop by stating its label name.

  The syntax to label a loop requires a label name, followed by a : colon
  character, to precede the start of the loop structure, Example..

  OuterLoop:for(int i = 1; i < 4; i++)
 
  To explicitly specify that the program should proceed in the outer loop,
  state that loops label name after the continue keyword, Example
  
   if(i == 1 && j == 1)
  {
       System.out.println("Continues OuterLoop when i="+i+" j="+j);
       continue OuterLoop ;
  }

  Here the continue statement halts all three iterations of the inner
  loops first run - by returning control to the outer loop.
  
  To explicitly specify that the program should exit from the outer 
  loop, state that loops label name after the break keyword, Example
 
  if(i == 2 && j == 3)
  {
       System.out.println("Breaks OuterLoop when i="+1+" j="+j);
       break OuterLoop ;
  }
   
  Here the break statements halts all further iterations of the entire
  loop structure - by exiting from the outer loop. */