class Else
{
     public static void main(String[] args)
     {
        int hrs = 21;
        if(hrs < 13)
         {
           System.out.println("Good morning: " + hrs);
         }
        else if(hrs < 18)
         {
           System.out.println("Good afternoon: " + hrs);
         }
        else System.out.println("Good evening: " + hrs);

     }

}


/*The else keyword is used in conjunction with the if keyword to create
  if else statements that provide alternative branches for a program 
  to pursue - according to the evaluation of a tested expression.
  In its simplest form, this merely nominates an alternative statement
  foe execution when the test fails:

  //if(test-expression)
         code-to-be-executed-when-true ;
    else 
         code-to-be-executed-when-false ;

  Each alternative branch mat be a single statement or a statement block
  of multiple statements - enclosed within curly brackets.

  More powerful if else statements can be constructed that evaluates a
  test expression for each alternative branch. These employ nested if 
  statements after each else keyword to specify each further test.
  When the program discovers an expression that evaluates as true,
  it executes the statements associated with that test then exits the 
  if else statement without exploring any further branches.

  It is some times desirable to provide a final else branch, without a 
  nested if statement, to specify a "default" statement to be executed
  when no test expression evaluates as true.

  Conditional branching is the fundamental process by which computer 
  programs proceed.*/ 