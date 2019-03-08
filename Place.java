public class Place implements Comparable<Place>{
private int row;
private int col;
private int possible;

public Place (int a, int b){
    row = a;
    col = b;
}

public int getp (){
 return possible;
}

public int getrow (){
 return row;
}
public int getcol (){
 return col;
}
public void setp (int n){
 possible = n;
}

public int compareTo(Place o){
    return possible - o.possible;
}




}
