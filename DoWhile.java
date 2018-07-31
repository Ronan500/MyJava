class DoWhile
{
    public static void main(String[]args)
    {
       int num = 100;
        
       do
       {
            System.out.println("DoWhile Countup: "+num);
       }
       while(num < 10);
       num += 10;
    }
}

/*A variation of the while loop structure, employs the do keyword to 
  create a loop with this syntax:

  do
  {
        statements-to-be-executed-on-each-iteration ;
  }
  while(test-expression) ;

  Like the for loop and while loop, a do while loop repeatedly executes
  the statements it contains until a tested condition is met - then the
  loop ends and the program proceeds to its next task.

  Unlike the for loop and while loop, the do while test expression appears
  after the block containing the statements to be executed.
  The test expression is evaluated at the end of each iteration of the 
  loop for a Boolean true value. When the evaluation returns true
  the next iteration proceeds but when it retuens false the loop is 
  immediately terminated. This means that the statements in a do while 
  loop are always executes at least once.

  Note that if the test expression returns false when it is first evaluated
  the loop statements have already been executed once.

  A do while loop can be made to resemble the structure of a for loop,
  to evaluate a counter variable in its test expression, by positioning
  the counter initializer outside the loop structure and its updater
  within the statement block - just as with a while loop.

  All for, while, or do while loop structures containing just one statement
  to execute may, optionally, omit the curly brackets around the statement.
  But, if omitted, you will need to add curly brackets if additional
  statements are added to the loop later.

  The choice of for, while, or do while loop is largely a matter of 
  personal coding preference and purpose. A for loop structure 
  conveniently locates the counter initializer, test expression, and
  updater in the parentheses after the for keyword. A while loop structure
  can be more concise - but you must remember to include an updater in
  the loops staements to avoid an infinite loop. A do while loop simply
  adds the benefit of executing its statements once before evaluating
  its test expression - */

  

   