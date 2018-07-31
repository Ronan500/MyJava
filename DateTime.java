import java.time.LocalDateTime;


class DateTime
{
    public static void main(String[]args){
      
//Insert a statement to create a LocalDateTime object.
      LocalDateTime date = LocalDateTime.now();
      System.out.println("\nIt is now "+ date);

//Increment the year and output the revised date and time.
      date = date.withYear(2019);
      System.out.println("\nDate is now "+ date);

//Output individual LocalDateTime fields of the revised date.
      String fields = "\nYear:\t\t\t"+ date.getYear();
      
      fields += "\nMonth:\t\t\t" + date.getMonth();
      fields += "\nMonth Number:\t\t" + date.getMonthValue();
      fields += "\nDay:\t\t\t" + date.getDayOfWeek();
      fields += "\nDay Number:\t\t" + date.getDayOfMonth();
      fields += "\nDay Number Of Year:\t" + date.getDayOfYear();
      fields += "\nHour (0-23):\t\t" + date.getHour();
      fields += "\nMinute:\t\t\t" + date.getMinute();
      fields += "\nSecond:\t\t\t" + date.getSecond();

      System.out.println(fields);
    }
}

/*The java.time package contains a class named LocalDateTime that has
  useful methods to exract specific fields from a LocalDateTime object
  that describe a particular point in time. These can be made available
  to a program by importing the specific class with 
  import java.time.LocalDateTime; or by importing all classes in the 
  package using the wildcard with import java.time.*; .
  
  A new LocalDateTime object can be created with fields describing
  the current date and time using its now() method. The fields are 
  initialized from the system clock for the current locale.

  The value within an individual field can be retrieved using an 
  appropriate method of the LocalDateTime object. For example, the
  value of the year field can be retrieved using its getYear() method.
  Similarly, any field can be changed using an appropriate method of the
  LocalDateTime object to specify a replacement value. For example,
  the value of the year field can be changed by specifying a new year
  value as an argument to its withYear() method.

  You can alternatively use the ZonedDateTime class instead of 
  LocalDateTime if you also require a time zone field.

  Concatenating a String like this means the program makes just one
  call to println() to output field details - this is more efficient
  than calling println() many times to output each individual field
  separately...

  field += "\nYear:\t\t\t" + date.getYear(); .......*/ 