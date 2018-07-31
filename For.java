class For
{
      public static void main(String[] args){
  
      int num = 0;
      for(int i = 1; i < 4; i++){
      System.out.println("Outer Loop i="+i);
      
      for(int j = 1; j < 4; j++){
      System.out.print("\tInner Loop j=" +j);
      System.out.println("\t\tTotal num=" + (++num));
      }      

    }
        
  }
}

/*A loop is a block of code that repeatedly executes the statements it 
  contains until a tested condition is met - then the loop ends and the
  program proceeds on to its next task.

  The most frequently used loop structure in Java programming employs
  the for keyword and has this syntax:
  
  for(initializer ; test-expression ; updater)
  {
        statements-to-be-executed-on-each-iteration ;
  }
  
  The parentheses after the for keyword must contain three controls
  that establish the performance of the loop:

  # Initializer - assigns an initial value to a counter variable,
  which will keep count of the number of iterations made be this loop.
  The variable for this purpose may be declared here, and it is 
  traditionally a "trivial" integer variable named i.

  # Test expression - evaluated at the start of each iteration of the loop
  for a Boolean true value. When the evaluation returns true the iteration
  proceeds but when it returns false the loop is immediatly terminated,
  without completing that iteration.

  # Updater - changes the current value of the counter variable,
  started by the initializer, keeping the running total of the number of 
  iterations made by this loop. Typically this will use i++ for 
  counting up, or i-- for counting down.

  The updater is often refered to as the "incrementer" as it more often 
  increments rather than decrements, the counter variable.

  The code executed on each iteration of the loop can be a single 
  statement, a statement block, or even another "nested" loop.

  Every loop must, at some point, enable the test expression to return
  false - otherwise, an infinite loop is created that will relentlessly
  execute its statements. Commonly, the test expression will evaluate
  the current value of the counter variable to perform a specified
  number of iterations. For example, with a counter i initialized at one
  and incremented by one on each iteration, a test expression of i < 11
  becomes false after 10 iterations - so that loop will execute its 
  statements 10 times before the loop ends. */
   