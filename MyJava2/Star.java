class Star
{
    public static void main(String[]args){
      
      boolean[][] points = new boolean[15][60];

      points[0][30] = true;       points[5][15] = true;
      points[1][29] = true;       points[5][17] = true;      
      points[1][31] = true;       points[5][19] = true;
      points[2][28] = true;       points[5][21] = true;
      points[2][32] = true;       points[5][23] = true;
      points[3][27] = true;       points[5][37] = true;
      points[3][33] = true;       points[5][39] = true;
      points[4][26] = true;       points[5][41] = true;
      points[4][34] = true;       points[5][43] = true;
      points[5][25] = true;       points[5][45] = true;
      points[5][35] = true;       points[6][17] = true;
     


      points[6][43] = true;       points[11][24] = true;
      points[7][21] = true;       points[11][36] = true;
      points[7][39] = true;       points[10][27] = true;
      points[8][24] = true;       points[10][33] = true;
      points[8][36] = true;       points[9][30] = true;
      points[9][23] = true;
      points[9][37] = true;
      points[10][22] = true;
      points[10][38] = true;
      points[11][21] = true;
      points[11][39] = true;
      points[12][20] = true;
      points[12][40] = true;

      for(int i = 0; i < points.length; i++){
         System.out.print("\n");
      
        for(int j = 0; j < points[0].length; j++){
           char mark = (points[i][j])? 'X': '-';
           System.out.print(mark);
        }
      }
 }
}