import java.util.*;
public class KnightBoard {
    private int rows;
    private int cols;
    private int num;
    private int [] grand;
    private int [][] data;
    private int o;
    private ArrayList<int[]> prev;
    private ArrayList<int[]> yes;
    //         /
    //        /
    //       /
    // \    /
    //  \  /
    //   v
    public KnightBoard (int startingRows,int startingCols){
        prev = new ArrayList<int[]>();
        yes = new ArrayList<int[]>();
        grand = new int [2];
        rows = startingRows;
        cols = startingCols;
        data = new int [rows] [cols];
        // System.out.println(startingRows);
    }
//Initialize the board to the correct size and make them all 0's
//         /
//        /
//       /
// \    /
//  \  /
//   v
private void preview (){
    for (int r = 0; r < data.length; r ++){
        for (int c = 0; c < data [0].length; c ++){
            data [r] [c] = nmoves(r, c);
            // System.out.println(data [r] [c]);
}
}
}
//         /
//        /
//       /
// \    /
//  \  /
//   v
public int nmoves(int r, int c){
    int n = 0;
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (data[r + 1] [c +2] != -1){
              n ++;
          }
      }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0){
          if (data[r + 1] [c - 2] != -1){
              n ++;
          }
      }
    }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (data[r + 2] [c +1] != -1){
              n ++;
          }
      }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0){
          if (data[r + 2] [c - 1] != -1){
              n ++;
          }
      }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (data[r - 1] [c + 2] != -1){
              n ++;
          }
      }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0){
          if (data[r - 1] [c - 2] != -1){
              n ++;
          }
        }
    }
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if ( data[r - 2] [c + 1] != -1){
              n ++;
          }
      }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0){
          if (data[r - 2] [c - 1] != -1){
              n ++;
          }
      }
    }
    return n;
    }
    //         /
    //        /
    //       /
    // \    /
    //  \  /
    //   v
private boolean addKnight(int r, int c){
    if (data [r] [c] == -1) {
        return false;
    }
    return true;
}
//         /
//        /
//       /
// \    /
//  \  /
//   v
public String toString(){
    int i = 0;
    String display = "";
    // System.out.println(data.length);
    for (int r = 0; r < data.length; r ++){
        for (int c = 0; c < data [0].length; c ++){
            // System.out.println("hello??");
                // if (data [r] [c] == 0){
                    display = display + " " + data [r] [c];
            //     }
            //     else display = display + " " + data [r][c];
            //     i ++;
             }
            // System.out.println("life");
            display = display + "\n";
    }
    return display;

}

// see format for toString below
// blank boards display 0's as underscores
// you get a blank board if you never called solve or
// when there is no solution
//
// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
//         /
//        /
//       /
// \    /
//  \  /
//   v
public void update(int r,int c){
    int n = 0;
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (data[r + 1] [c +2] != -1){
              data[r + 1] [c +2] --;
          }
      }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0){
          if (data[r + 1] [c - 2] != -1){
              data[r + 1] [c - 2] --;
          }
      }
    }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (data[r + 2] [c +1] != -1){
              data[r + 2] [c +1] --;
          }
      }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0){
          if (data[r + 2] [c - 1] != -1){
              data[r + 2] [c - 1] --;
          }
      }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (data[r - 1] [c + 2] != -1){
              data[r - 1] [c + 2] --;
          }
      }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0){
          if (data[r - 1] [c - 2] != -1){
              data[r - 1] [c - 2] --;
          }
        }
    }
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if ( data[r - 2] [c + 1] != -1){
              data[r - 2] [c + 1] --;
          }
      }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0){
          if (data[r - 2] [c - 1] != -1){
              data[r - 2] [c - 1] --;
          }
      }

    }
}
//         /
//        /
//       /
// \    /
//  \  /
//   v
public boolean nomoves(int r, int c){
        //   __ __
    //  |
    //  x
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (data[r + 1] [c +2] != -1){
              return false;
          }
      }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0){
          if (data[r + 1] [c - 2] != -1){
              return false;
          }
      }
  }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (data[r + 2] [c +1] != -1){
              return false;
          }
      }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0){
          if (data[r + 2] [c - 1] != -1){
              return false;
          }
      }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (data[r - 1] [c + 2] != -1){
              return false;
          }
      }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0){
          if (data[r - 1] [c - 2] != -1){
              return false;
          }
        }
    }
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if ( data[r - 2] [c + 1] != -1){
              return false;
          }
      }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0){
          if (data[r - 2] [c - 1] != -1){
              return false;
          }
      }
  }
    return true;
}
private void leastnmove(int r,int c){
    int [] a = new int [3];
    int [] b = new int [3];
    int [] q = new int [3];
    int [] d = new int [3];
    int [] e = new int [3];
    int [] f = new int [3];
    int [] g = new int [3];
    int [] h = new int [3];

//   __ __
//  |
//  x
if (r + 1 < rows ){
  if (c + 2 < cols){
          a[0] = data[r + 1] [c +2];
          a[1] = r + 1;
          a[2] = c + 2;
          yes.add(a);

  }
 //   __ __
 //        |
 //        x
  if (c - 2  >= 0){
      if (data[r + 1] [c - 2] != -1){
              b[0] = data[r + 1] [c - 2];
              b[1] = r + 1;
              b[2] = c -  2;
              yes.add(b);

      }
  }
}
//   __
//  |
//  |
//  x
if (r + 2 < rows){
  if (c + 1 < cols){
      if (data[r + 2] [c +1] != -1){
             q[0] = data[r + 2] [c +1];
              q[1] = r + 2;
              q[2] = c + 1;
              yes.add(q);

      }
  }
  //  __
  //    |
  //    |
  //    x
  if (c - 1  >= 0){
      if (data[r + 2] [c - 1] != -1){
              d[0]= data[r + 2] [c - 1];
              d[1] = r + 2;
              d[2] = c - 1;
              yes.add(d);
          }

    }
    }
//  x
//  |
//   __ __
if (r - 1 >= 0){
  if (c + 2 < cols){
      if (data[r - 1] [c + 2] != -1){
              e[0] = data[r - 1] [c +2];
              e[1]= r - 1;
              e[2] = c + 2;
              yes.add(e);

      }
  }
  //        x
  //        |
  //   __ __
  if (c - 2  >= 0){
      if (data[r - 1] [c - 2] != -1){
              f[0] = data[r - 1] [c - 2];
              f[1] = r - 1;
              f[2] = c - 2;
              yes.add(f);

    }
}
}
//  x
//  |
//  |
//   __
if (r - 2 >= 0){
  if (c + 1 < cols){
      if ( data[r - 2] [c + 1] == 0){
          g[0] = data[r - 2] [c + 1];
          g[1] = r - 2;
          g[2] = c + 1;
          yes.add(g);

  }
  //     x
  //     |
  //     |
  //   __
  if (c - 1  >= 0){
      if (data[r - 2] [c - 1] == 0){
          h[0] = data[r -2] [c - 1];
          h[1] = r -2;
          h[2] = c - 1;
          yes.add(h);

  }
}
}
}
sort();

}
private void sort (){
    int m = yes.get(0)[0];
    int [] n = new int [3];
    int p = 0;
    for(int i = 1; i < yes.size(); i ++){
        if (yes.get(i)[0] < m){
            m = yes.get(i)[0];
            n = yes.get(i);
            p = i;
        }
        yes.remove(p);
        yes.add(0, n);
    }
}
public boolean solve(int startingRow, int startingCol){
    preview();
    // System.out.println(data.toString());
    solver(startingRow,startingCol, 0);
    if (num > 0){
        return true;
    }
    return false;
}
private void solver( int r, int c, int n){
    // System.out.println("ko");
    if (r < 0 || r > rows - 1 || c < 0 || c > cols - 1){
        // System.out.println("uisfjhbfkdsbk");;
    }
    else if (data [r][c] == -1){
    ;
    }

    // System.out.println(nomoves(r,c));



        // System.out.println("YGDGIYDGFIYVZSFIVDSGUFVAGYSVFHAVFGHDAVFHDVFUVFUGDVFKHGVFKGHVDKGHVFGUVDFUKVDDVYKEVK" + "\n" + data);
    // if prevr and prevc are equal to one of the options, make it false
    // if the number of moves equals the area, then we are done and return true


    // once the knight moves, its other options are put on hold while it finishes
    else if(addKnight(r,c)){
        // System.out.println("uisfjhbfkdsbk");
        o = data[r][c];
    data[r][c] = -1;
    // System.out.println(this.toString());
    update(r,c);
        // System.out.println(this.toString());
    if (checker()){
        num ++;
        System.out.println("UFFBKSBDFDJSBFJDSBFKU");
    }
    else{
        leastnmove(r,c);
        prev = yes;
    // System.out.println("kokokoko");
    solver(prev.get(0)[1], prev.get(0)[2], 0);
        yes = new ArrayList<int[]>();
}
// System.out.println("HELEPEPEP");
data[r][c] = o;
}
// System.out.println("nononnonon");
if (n + 1 < yes.size()){
solver(yes.get(n + 1)[1], yes.get(n + 1)[2], n+ 1);

}
}
//         /
//        /
//       /
// \    /
//  \  /
//   v
public boolean checker(){
    for (int r = 0; r < rows; r ++){
        for (int c = 0; c < cols; c ++){
            if (data [r] [c] != -1){
                return false;
            }
        }
    }
    return true;
}


// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
//         /
//        /
//       /
// \    /
//  \  /
//   v
public int countSolutions(int startingRow, int startingCol){
    solve(startingRow, startingCol);
    return num;
}
}
