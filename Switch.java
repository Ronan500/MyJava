
class Switch
{
      public static void main(String[] args)
      {
        int month = 2, year = 2018, num = 31 ;

        switch (month)
        {
          case 4: case 6: case 9: case 11: num = 30 ;break;
          case 2: num = (year % 4 == 0)? 29:28;break;
        }
          System.out.println(month+"/"+year+": "+num+"days");

      }

}

/*Lengthy if else statements, which offer many conditional branches for 
  a program to pursue, can become unweildly. Where the test expressions 
  repeatedly evaluate the same variable value, a more elegant solution
  is often provided by a switch statement.
  The syntax of a typical switch statement block looks like this:

  switch(test-expression)
  { 
       case value1 : code-to-be-executed-when-true ; break ;
       case value2 : code-to-be-executed-when-true ; break ;
       case value3 : code-to-be-executed-when-true ; break ;
       default : code-to-be-executed-when-false ;
  }

  The switch statement works in an unusual way. It takes a specified 
  variable then seeks to match its assigned value from amoung a number
  of case options. Statements associated with the option whose value 
  matches are then executed.

  Optionally, a switch statement can include a final option using the 
  default keyword to specify statements to execute when no case options
  match the value assigned to the specified variable.

  Each option begins with the case keyword and a value to match.
  This is followed by a : colon character and the statements, if any,
  to be executed when the match is made.

  It is important to recognize that the statement, or statement block,
  associated with each case option must be terminated by the break keyword
  Otherwise, the program will continue to execute the statements of 
  other case options after the matched option. Sometimes, this is 
  desirable to specify a number of case options that should each execute
  the same statements if matched. For example one statement for each block
  of three options like this:

  switch(test-expression)
  {
       case value1 : case value2 : case value3 :
             code-to-be-executed-when-true ; break ;

       case value4 : case value5 : case value6 :
             code-to-be-executed-when-true ; break ;
  }

  Missing break keywords are not syntax errors - ensure that all intended
  breaks are present in switch blocks to avoid unexpected results. */
  