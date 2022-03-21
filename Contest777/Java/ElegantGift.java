import java.util.*;
import java.io.*;
import java.math.*;

public class ElegantGift{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[][] map = new int[size[0]][size[1]];
      boolean[][]chk = new boolean[map[0].length][map.length]
      for(int i = 0; i < map[0].length; i++){
        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int j = 0; j < map.length; j++){
          map[i][j] = line[j];
          chk[i][j] = false;
        }
      }
      //algo
      //search col if it is 1 and row if it is 1

      for(int i = 0; i < map[0].length; i++){
        for(int j = 0; j < map.length; j++){
          if(map[i][j] == 1)
        }
      }
    }
  }
}
