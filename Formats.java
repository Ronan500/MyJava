import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;


class Formats
{
   public static void main(String[]args){

//Insert statement to output a number with group separators.
    NumberFormat nf = NumberFormat.getNumberInstance();
    System.out.println("\nNumber: " + nf.format(123456789));

//Add statement to output a number with a currency sign.
    NumberFormat cf = NumberFormat.getCurrencyInstance();
    System.out.println("\nCurrency: " + cf.format(1234.50f));

//Add a statement to output a number with a percent sign.
    NumberFormat pf = NumberFormat.getPercentInstance();
    System.out.println("\nPercent: " + pf.format(0.75f));

//Add a statement creating a current LocalDateTime object.
    java.time.LocalDateTime now = java.time.LocalDateTime.now();

//Add a statement to output a formatted numerical date.
    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy");
    System.out.println("\nDate: " + now.format(df));

//Add a statement to output a formatted numerical time.
    DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
    System.out.println("\nTime: " + now.format(tf));
  }

}

/*Java contains a package named java.text that provides useful classes
  for formatting numbers and currency. The package can be made available
  to a program by including an import statement at the very beginning
  of the .java file. This can use the * wildcard character to mean 
  "all classes" in the statement import java.text.*; 
  Alternativly, specific classes can be imported by name.

  The java.text package has a class named "NumberFormat", which has
  methods that can be used to format numerical values for output 
  adding group separators, currency signs, and percentage signs.

  The method used to create a new NumberFormat object determines its
  formatting type - getNumberInstance() for group separators,
  getCurrencyInstance() for currency signs, and getPercentInstance()
  for percentage signs. Formatting is applied by specifying the numerical
  value to be formatted as the argument to the format() method 
  of the NumberFormat object.

  The java.time.format package has a DateTimeFormatter class that can be
  used to format java.time dates and time objects. A DateTimeFormatter
  object contains a formatter pattern that is specified as a string
  argument to its ofPattern() method. The formatter comprises letters,
  defined in the Java documentation, and your choice of separators
  For Example, "M/d/y" specifies the month, day, and year separated 
  by slashes. The format is applied by specifying the formatter as 
  the argument to the format() method of a java.time date and time object.
  
  A statement can address a class that has not been imported by using its
  fullpackage address as seen above in the statement creating a 
  LocalDateTime object..

  java.time.LocalDateTime now = java.time.LocalDateTime.now();

  Pattern letters are case sensitive - refer to the documentation to
  discover the full details of possible patterns...*/ 

  