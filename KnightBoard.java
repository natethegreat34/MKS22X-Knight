public class KnightBoard {
    private int rows;
    private int cols;
    private int num;
    private int [][] data;
    public KnightBoard (int startingRows,int startingCols){
        rows = startingRows;
        cols = startingCols;
        data = new int [rows] [cols];
        // System.out.println(startingRows);
    }
//Initialize the board to the correct size and make them all 0's


public String toString(){
    String display = "";
    // System.out.println(data.length);
    for (int r = 0; r < data.length; r ++){
        // System.out.println("ppodle");
        for (int c = 0; c < data [0].length; c ++){
            // System.out.println("hello??");
                if (data [r] [c] == 0){
                    display = display + " " + "__";
                }
                else display = display +" " + "xx";
            }
            // System.out.println("life");
            display = display + "\n";
    }
    return display;
  }

// // see format for toString below
// // blank boards display 0's as underscores
// // you get a blank board if you never called solve or
// // when there is no solution
// //
// // @throws IllegalStateException when the board contains non-zero values.
// // @throws IllegalArgumentException when either parameter is negative
// //  or out of bounds.
// public boolean solve(int startingRow, int startingCol){
//     return solver(startingRow,startingCol, -1, -1);
// }
// private boolean solver( int r, int c, int prevr, int prevc){
//     // if prevr and prevc are equal to one of the options, make it false
//     if (checker()){
//         num ++;
//     }
//     data[r][c] = "x";
//     //   __ __
//     //  |
//     //  x
//     if (r + 1 < rows ){
//       if (c + 2 < cols){
//           if (r + 1 != prevr || c + 2 != prevc){
//           if (!(data[r + 1] [c +2].equals("x"))){
//               return solver (r + 1, c + 2,r,c);
//           }
//       }
//   }
//      //   __ __
//      //        |
//      //        x
//       if (c - 2  >= 0){
//           if (!(data[r + 1] [c - 2].equals("x"))){
//               return solver (r + 1, c - 2,r,c);
//           }
//       }
//     }
//     //   __
//     //  |
//     //  |
//     //  x
//     if (r + 2 < rows){
//       if (c + 1 < cols){
//           if (!(data[r + 2] [c +1].equals("x"))){
//        return solver(r + 2,c + 1,r,c);
//       }
//     }
//       //  __
//       //    |
//       //    |
//       //    x
//       if (c - 1  >= 0){
//           if (!(data[r + 1] [c - 1].equals("x"))){
//        return solver(r + 2,c - 1,r,c);
//         }
//         }
//     }
//     //  x
//     //  |
//     //   __ __
//     if (r - 1 >= 0){
//       if (c + 2 < cols){
//           if (!(data[r - 1] [c + 2].equals("x"))){
//        return solver(r - 1,c + 2,r,c);
//       }
//   }
//       //        x
//       //        |
//       //   __ __
//       if (c - 2  >= 0){
//           if (!(data[r - 1] [c - 2].equals("x"))){
//        return solver(r - 1,c - 2,r,c);
//       }
//     }
// }
//     //  x
//     //  |
//     //  |
//     //   __
//     if (r - 2 >= 0){
//       if (c + 1 < cols){
//           if (!(data[r - 2] [c + 1].equals("x"))){
//               return solver(r - 2,c + 1,r,c);
//       }
//   }
//       //     x
//       //     |
//       //     |
//       //   __
//       if (c - 1  >= 0){
//           if (!(data[r + 1] [c - 1].equals("x"))){
//       return solver(r - 2,c - 1,r,c);
//       }
//     }
//     }
//     data[r][c] = "_";
//     return solver(prevr, prevc, r,c);
//   }
// public boolean checker(){
//     for (int r = 0; r < rows; r ++){
//         for (int c = 0; c < cols; c ++){
//             if (data [r] [c].equals("x")){
//                 ;
//             }
//             else return false;
//         }
//     }
//     return true;
// }
//
//
// // @throws IllegalStateException when the board contains non-zero values.
// // @throws IllegalArgumentException when either parameter is negative
// //  or out of bounds.
// public int countSolutions(int startingRow, int startingCol){
//     solve(startingRow, startingCol);
//     return num;
// }
}
