class While
{
    public static void main(String[]args)
  {  
    
    int num = 100;
   
    while(num > 0)
    {
    System.out.println("While Countdown: "+num);
    num -= 10;
    }

  }
}

/*An alternative loop structure to that of the for loop, employs the 
  while keyword and has this syntax:

  while(test-expression)
  {
       statements-to-be-executed-on-each-iteration ;
  }

  Like the for loop, the while loop repeatedly executes the statements it 
  contains until a tested condition is met - then the loop ends and the
  program proceeds on to its next task.

  Unlike the for loop, the parentheses after the while keyword do not
  contain an initializer or updater for an iteration counter variable.
  This means that the test expression must evaluate some value that 
  gets changed in the loop statements as the loop proceeds - otherwise
  an infinite loop is created that will relentlessly execute its 
  statements.

  The test expression is evaluated at the start of each iteration of the
  loop for a Boolean true or false value. When the evaluation returns 
  true the iteration proceeds but when it returns false the loop is 
  immediately terminated, without completing that iteration.

  Note that if the test expression returns false when it is first 
  evaluated, the loop statements are never executed.

  A while loop can be made to resemble the structure of a for loop,
  to evaluate a counter variable in its test expression, by creating a
  counter variable outside the loop and changing its value within the
  statements it executes on each iteration. For example, the outer
  for loop in the previous example can be recreated as a while loop,
  like this:

  int i = 1 ;
  while(i < 4)
  {
       System.out.println("Outer Loop i= "+1) ;
       i++ ;
  }
 
  This positions the counter initializer externally, before the while
  loop staructure, and its updater within the statement block. */  