class If
{
     public static void main(String[] args)
     {
         if(5 > 1) System.out.println("Five is greater than one.");
     
    
         //Short hand for (2 < 4 == true)
         if(2 < 4)
        {
         System.out.println("Two is less than four.");
         System.out.println("Test succeeded.");
        }
         int num = 8;
         if(((num > 5)&&(num < 10))||(num == 12))
         System.out.println("Number is 6-9 inclusive, or 12");      
        

      }
         

}

/*The if keyword performs a conditional test to evaluate an expression
  for a Boolean value. A statement following the expression will only be
  executed when the evaluation is true, otherwise the program proceeds
  on to subsequent code - pursuing the next "branch". 
  The if statement syntax looks like this:

  //if(test - expression) code-to-be-executed-when-true ;

  The code to be executed can contain multiple statements if they are
  enclosed within curly brackets to form a "statement block".
  A conditional test can also evaluate a complex expression to test
  multiple conditions for a Boolean value. Parentheses enclose each
  test condition to establish precedence - so they get evaluated first.
  The Boolean && AND operator ensures the complex expression will only
  return true when both tested conditions are true:

  //if((test-condition1)&&(test-condition2)) execute-this-code ;

  The Boolean || OR operator ensures a complex expression will only
  return true when either one of the tested expressions is true:

  //if((test-expression1)||(test-expression2)) execute-this-code ;

  A combination of thes can form longer complex expressions.
  The range can be extended to include the upper and lower limits using 
  the >= and <= operators.*/
  

  
  