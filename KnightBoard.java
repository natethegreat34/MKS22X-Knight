public class KnightBoard {
    private int rows;
    private int cols;
    private String [][] data;
    public KnightBoard (int startingRows,int startingCols){
        ;
    }
    private void possibleMoves(){
     data = new String[8][8];
     if (yCor + 1 < 8){
       if (xCor + 2 < 8){
        data[yCor + 1][xCor + 2] = "o";
       }
       if (xCor - 2  >= 0){
        data[yCor + 1][xCor - 2] = "o";
       }
     }
     if (yCor + 2 < 8){
       if (xCor + 1 < 8){
        data[yCor + 2][xCor + 1] = "o";
       }
       if (xCor - 1  >= 0){
        data[yCor + 2][xCor - 1] = "o";
       }
     }
     if (yCor - 1 >= 0){
       if (xCor + 2 < 8){
        data[yCor - 1][xCor + 2] = "o";
       }
       if (xCor - 2  >= 0){
        data[yCor - 1][xCor - 2] = "o";
       }
     }
     if (yCor - 2 >= 0){
       if (xCor + 1 < 8){
        data[yCor - 2][xCor + 1] = "o";
       }
       if (xCor - 1  >= 0){
        data[yCor - 2][xCor - 1] = "o";
       }
     }
     data[yCor][xCor] = "x";
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
    possibleMoves();
// I know this is wrong but just need to write it down
    if (data [r][c].equals("o")){

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
