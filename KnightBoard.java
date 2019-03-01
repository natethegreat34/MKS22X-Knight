import java.util.*;
public class KnightBoard {
    private int rows;
    private int cols;
    private int num;
    private int [][] data;
    //@throws IllegalArgumentException when either parameter is <= 0.
    //constructor
    public KnightBoard (int startingRows,int startingCols){
        if (startingRows <= 0 || startingCols <= 0){
            throw new IllegalArgumentException ("");
        }
        // System.out.println("hello");
        num = 0;
        rows = startingRows;
        cols = startingCols;
        data = new int [rows] [cols];
        // System.out.println(startingRows);
    }
//Initialize the board to the correct size and make them all 0's
private void preview (){
    // System.out.println("boo");
    for (int r = 0; r < data.length; r ++){
        for (int c = 0; c < data [0].length; c ++){
            data [r] [c] = nmoves(r, c);
            // System.out.println(data [r] [c]);
}
}
}
//updates the board after the night has been added or removed
public void update(int r,int c){
    int n = 0;
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (data[r + 1] [c +2] >= 0 )
              data[r + 1] [c +2] = nmoves(r + 1, c + 2);
          }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0){
          if (data[r + 1] [c - 2] >= 0 )
              data[r + 1] [c - 2] = nmoves(r + 1, c - 2);
      }
    }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (data[r + 2] [c +1] >= 0 )
              data[r + 2] [c +1] = nmoves(r + 2, c + 1);
      }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0){
          if (data[r + 2] [c - 1] >= 0 )
              data[r + 2] [c - 1] = nmoves(r + 2, c - 1);
      }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (data[r - 1] [c +2] >= 0 )
              data[r - 1] [c + 2] = nmoves(r - 1, c + 2);;
          }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0){
          if (data[r - 1] [c - 2] >= 0 )
              data[r - 1] [c - 2] = nmoves(r - 1, c - 2);
          }
    }
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if (data[r -2] [c +1] >= 0 )
              data[r - 2] [c + 1] = nmoves(r - 2, c + 1);

      }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0){
          if (data[r - 2] [c - 1] >= 0 )
              data[r - 2] [c - 1] = nmoves(r - 2, c - 1);
          }
      }

}
//counts the number of out-going moves from the specified square
public int nmoves(int r, int c){
    int n = 0;
    // System.out.println(c);
    // System.out.println(r);
    // System.out.println(this);
    if (r + 1 < rows && r + 1 >=0){
      if (c + 2 < cols && c + 2 >=0){
          if (data[r + 1] [c +2] >= 0 ){
              n ++;
          }
      }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0 && c - 2 < cols){
          if (data[r + 1] [c - 2] >= 0 ){
              n ++;
          }
      }
    }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows && r + 2 >=0){
      if (c + 1 < cols && c+ 1 >=0){
          if (data[r + 2] [c +1] >= 0 ){
              // System.out.println("helpfagsfdd");
              n ++;
          }
      }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0 && c -1  < cols){
          if (data[r + 2] [c - 1] >= 0 ){
              n ++;
          }
      }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0 && r - 1 < rows){
      if (c + 2 < cols && c + 2 >=0){
          if (data[r - 1] [c + 2] >= 0 ){
              n ++;
          }
      }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0 && c - 2 < cols){
          if (data[r - 1] [c - 2] >= 0 ){
              n ++;
          }
        }
    }
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0 && r -2 < rows){
      if (c + 1 < cols && c + 1 >=0){
          if ( data[r - 2] [c + 1] >= 0 ){
              n ++;
          }
      }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0 && c - 1 < cols){
          if (data[r - 2] [c - 1] >= 0 ){
              n ++;
          }
      }
    }
    // System.out.println(n);
    return n;
    }
//checks to see if one can add a knight
private boolean addKnight(int r, int c){
    if (data [r] [c] < 0) {
        return false;
    }
    return true;
}
// -you get a blank board if you never called solve or when there is no solution
// -blank boards display 0's as underscores
// @returns the properly formatted string (see format for toString later in the post)
public String toString(){
    int i = 0;
    String display = "";
    // System.out.println(data.length);
    for (int r = 0; r < data.length; r ++){
        // System.out.println("ppodle");
        for (int c = 0; c < data [0].length; c ++){
            // System.out.println("hello??");
                if (data [r] [c] * -1 < 10){
                    display = display + "  " + data [r] [c] * -1;
                }
                else display = display +  " " + data [r][c] * -1;
                i ++;
            }
            // System.out.println("life");
            display = display + "\n";
    }
    return display;
  }
// makes a list of all possible moves sorted from lowest nmoves to greatest
private ArrayList <Place> generatemoves(int r, int c){
    // System.out.println(num);
    ArrayList <Place> moves = new ArrayList <Place> ();
        //   __ __
    //  |
    //  x
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (data[r + 1] [c +2] >= 0 ){
              Place p = new Place(r+1, c+2);
              p.setp(nmoves(r+1, c+2));
              moves.add(p);
          }
      }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0){
          if (data[r + 1] [c - 2] >= 0 ){
              Place p = new Place(r+1, c-2);
              p.setp(nmoves(r+1, c-2));
              moves.add(p);
          }
      }
  }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (data[r + 2] [c +1] >= 0 ){
              Place p = new Place(r+2, c+1);
              p.setp(nmoves(r+2, c+1));
              moves.add(p);
          }
      }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0){
          if (data[r + 2] [c - 1] >= 0 ){
              Place p = new Place(r+2, c-1);
              p.setp(nmoves(r+2, c-1));
              moves.add(p);
          }
      }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (data[r - 1] [c + 2] >= 0 ){
              Place p = new Place(r-1, c+2);
              p.setp(nmoves(r-1, c+2));
              moves.add(p);
          }
      }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0){
          if (data[r - 1] [c - 2] >= 0 ){
              Place p = new Place(r-1, c-2);
              p.setp(nmoves(r-1, c-2));
              moves.add(p);
          }
        }
    }
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if ( data[r - 2] [c + 1] >= 0 ){
              Place p = new Place(r-2, c+1);
              p.setp(nmoves(r-2, c+1));
              moves.add(p);
          }
      }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0){
          if (data[r - 2] [c - 1] >= 0 ){
              Place p = new Place(r-2, c - 1);
              p.setp(nmoves(r-2, c - 1));
              moves.add(p);
          }
      }
  }
  // System.out.println(this);
  //   Collections.sort(moves);
  //   System.out.println(this);
    return moves;
}
// Modifies the board by labeling the moves from 1 (at startingRow,startingCol) up to the area of the board in proper knight move steps.
// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
// @returns true when the board is solvable from the specified starting position
public boolean solve(int startingRow, int startingCol){
    if (startingRow < 0 || startingCol < 0 || startingRow > rows || startingCol > cols ){
        throw new IllegalArgumentException ("");
    }
    for (int r = 0; r < rows; r ++){
        for (int c = 0; c < cols; c ++){
            if (data [r] [c] != 0){
                throw new IllegalStateException ("");
            }
        }
    }
    preview();
    solver(startingRow,startingCol, 1);
    if (num > 0){
        return true;
    }
    return false;
}
private void solver( int r, int c, int n){
    // System.out.println("helpndjwkbkw");
if (rows > 5 && cols > 5 && num > 0){
    ;
}
    else{
    if (r < 0 || r > rows - 1 || c < 0 || c > cols - 1){
        // System.out.println("supuspuspuspu");
        ;
        // em.out.println("uisfjhbfkdsbk");;
    }

    // System.out.println(nomoves(r,c));
    else if(addKnight(r,c)){
            // System.out.println(this);
        // System.out.println("lolol");
        int o = data [r][c];
    data[r][c] = -n;
    if (checker()){
        // System.out.println(this);
        num ++;
        // System.out.println("UFFBKSBDFDJSBFJDSBFKU");
    }
    update(r,c);
        ArrayList <Place> moves = generatemoves(r,c);
    // System.out.println("kokokoko");
    for (int i = 0; i < moves.size(); i ++){
        Place q = moves.get(i);
        solver (q.getrow(), q.getcol(), n +1);
    }
        data [r][c] = o;
            update(r,c);

    }
}
}
// goes through board to see if it is filled with negative numbbers (what the knight leves behind)
public boolean checker(){
    for (int r = 0; r < rows; r ++){
        for (int c = 0; c < cols; c ++){
            if (data [r] [c] >= 0 ){
                return false;
            }
        }
    }
    return true;
}


// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
public int countSolutions(int startingRow, int startingCol){
    if (startingRow < 0 || startingCol < 0 || startingRow > rows || startingCol > cols ){
        throw new IllegalArgumentException ("");
    }
    for (int r = 0; r < rows; r ++){
        for (int c = 0; c < cols; c ++){
            if (data [r] [c] != 0){
                throw new IllegalStateException ("");
            }
        }
    }
    solve(startingRow, startingCol);
    // System.out.println(this);
    return num;
}
}
