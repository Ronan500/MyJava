class Dimensions
{
   public static void main(String[]args){

//In the main method, create a two dimensional array to store boolean
//flats relating to XY coordinates.

    boolean[][] points = new boolean[5][20]; 

//Define one Y point on each X axis.

    points[0][5] = true;   
    points[1][6] = true;
    points[2][7] = true;
    points[3][8] = true;
    points[4][9] = true;

//Add a for loop to iterate through the first array index, adding a 
//newline character at the end of each iteration.

    for(int i = 0; i < points.length; i++){
        System.out.print("\n");

//Within the curly brackets of the for loop, insert a second for loop
//to iterate through the second array index.

        for(int j = 0; j < points[0].length; j++){

//Within the curly brackets of the second for loop, insert a statement
//to output a character for each element according to that elements
//boolean value.

            char mark = (points[i][j])?'X' : '-';
            System.out.print(mark);}
        }

 }
}

/*Arrays can be created to store multiple sets of element values,
  each having there own index dimension. Individual values are
  addressed in a multi-dimensional array using the approprate index
  number of each dimension. For example, num[1][3].

  A two-dimensional array might be used to record an integer value for
  each day of a business year, organized by week. This requires an array
  of 52 elements (one per week) that each have an array of seven elements
  (one per day). Its declaration looks like this:

  int[][] dailyRecord = new int[52][7];

  This "array of arrays" provides an element for each business day.
  Values are assigned to a multi-demensional array by stating the
  appropriate index numbers of each dimension. With the example above,
  for instance, a value can be assigned to the first day of the sixth
  week like this:

  dailyRecord[5][0] = 5000;

  Each array has its own length property that can be accessed by
  specifying the dimension required. For the example above, the
  syntax dailyRecord.length returns a value 52 - the size of the first 
  dimension. To access the size of the second dimension, the syntax
  dailyRecord[0].length returns the value seven.

  Two-dimensional arrays are often used to store grid coordinates,
  where one dimention represents the X axis and the other dimension
  represents the Y axis. For example, point[3][5].

  Three-dimensional arrays can be used to store XYZ coordinates in 
  a similar way, but it can be difficult to visualize point[4][8][2].

  Nested loops are perfectly suited to multi-dimensional arrays,
  as each loop level can address the elements of each array dimension.

  Avoid using more than three dimensions in arrays - it will be confusing.
  
  Boolean variables are false by default. */
   