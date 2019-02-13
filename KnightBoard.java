public class KnightBoard {
    private int rows;
    private int cols;
    private String [][] data;
    public KnightBoard (int startingRows,int startingCols){
        ;
    }
    private void possibleMoves(){
     data = new String[rows][cols];
     if (r + 1 < rows){
       if (c + 2 < cols){
        data[r + 1][c + 2] = "o";
       }
       if (c - 2  >= 0){
        data[r + 1][c - 2] = "o";
       }
     }
     if (r + 2 < rows){
       if (c + 1 < cols){
        data[r + 2][c + 1] = "o";
       }
       if (c - 1  >= 0){
        data[r + 2][c - 1] = "o";
       }
     }
     if (r - 1 >= 0){
       if (c + 2 < cols){
        data[r - 1][c + 2] = "o";
       }
       if (c - 2  >= 0){
        data[r - 1][c - 2] = "o";
       }
     }
     if (r - 2 >= 0){
       if (c + 1 < cols){
        data[r - 2][c + 1] = "o";
       }
       if (c - 1  >= 0){
        data[r - 2][c - 1] = "o";
       }
     }
     data[r][c] = "x";
   }

private void removeMoves(){
    for (int r; r < rows; r ++){
        for (int c; c < cols; c ++){
            if (data [r] [c].equals("0")){
                data [r] [c] = "_";
            }
        }
    }
}
    //Initialize the board to the correct size and make them all 0's


public String toString(){
    ;
}
// see format for toString below
// blank boards display 0's as underscores
// you get a blank board if you never called solve or
// when there is no solution
//
// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
public boolean solve(int startingRow, int startingCol){
    return solver(startingRow,startingCol);
}
private boolean solver( int r, int c){
    if (checker)
    data[r][c] = "x";
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (data[r + 1] [c +2].equals("x")){
             return false;
          }
       return solver (r + 1, c + 2);
      }
      if (c - 2  >= 0){
          if (data[r + 1] [c - 2].equals("x")){
             return false;
          }
       return solver (r + 1, c - 2);
      }
    }
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (data[r + 2] [c +1].equals("x")){
             return false;
          }
       return solver(r + 2,c + 1);
      }
      if (c - 1  >= 0){
          if (data[r + 1] [c - 1].equals("x")){
             return false;
          }
       return solver(r + 2,c - 1);
      }
    }
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (data[r - 1] [c + 2].equals("x")){
             return false;
          }
       return solver(r - 1,c + 2);
      }
      if (c - 2  >= 0){
          if (data[r - 1] [c - 2].equals("x")){
             return false;
          }
       return solver(r - 1,c - 2);
      }
    }
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if (data[r - 2] [c + 1].equals("x")){
             return false;
          }
       return solver(r - 2,c + 1);
      }
      if (c - 1  >= 0){
          if (data[r + 1] [c - 1].equals("x")){
             return false;
          }
      return solver(r - 2,c - 1);
      }
    }

  }
// I know this is wrong but just need to write it down
// need a way of having a list of possible moves


    }
    removeMoves();
}

// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
public int countSolutions(int startingRow, int startingCol){
    ;
}
}
