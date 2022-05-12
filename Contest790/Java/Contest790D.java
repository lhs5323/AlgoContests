import java.util.*;
import java.io.*;
import java.math.*;

public class Contest790D{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[][] board = new int[arr[0]][arr[1]];
      long[][] sum = new long[arr[0]][arr[1]];
      int[][] pos = new int[][]{{1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
      for(int i = 0; i < arr[0]; i++){
        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int j = 0; j < arr[1]; j++){
          board[i][j] = line[j];
          sum[i][j] = board[i][j];
        }
      }
      long max = 0;
      for(int x = 0; x < arr[0]; x++){
        for(int y = 0; y < arr[1]; y++){
          int[] cur = new int[]{x, y};
          int pos_x = cur[0];
          int pos_y = cur[1];
          for(int i = 0; i < pos.length; i++){
            while(((pos_x + pos[i][0] < arr[0]) && (pos_x + pos[i][0] >= 0)) && ((pos_y + pos[i][1] < arr[1]) && (pos_y + pos[i][1] >= 0))){
              pos_x = pos_x + pos[i][0];
              pos_y = pos_y + pos[i][1];
              sum[cur[0]][cur[1]] += board[pos_x][pos_y];
              //pw.println("pos_x: " + pos_x + " pos_y:" + pos_y);
              //pw.println("inner sum: " + sum[cur[0]][cur[1]]);
            }
            pos_x = cur[0];
            pos_y = cur[1];
          }
          //pw.println("x: " + x + " y:" + y);
          //pw.println("sum: " + sum[x][y]);
          if(sum[x][y] > max){
            max = sum[x][y];
          }
        }
      }
      pw.println(max);
    }
    pw.close();
  }
}
