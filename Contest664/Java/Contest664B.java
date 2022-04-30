import java.util.*;
import java.io.*;
import java.math.*;

public class Contest664B{
  public static boolean[][] visited;
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    visited = new boolean[test[0] + 1][test[1] + 1];
    visited[test[2]][test[3]] = true;
    pw.println(test[2] + " " + test[3]);
    Queue<int[]> que = new LinkedList<>();
    que.add(new int[]{test[2],test[3]});
    while(!que.isEmpty()){
      int[] a = que.poll();
      int[] b = que.peek();
      while(a[0])
      pw.println(a[0] + " " + a[1]);
      for(int i = a[0]; i < n + 1; i++){
        for(int j = a[1]; j < m + 1; j++){
          if(visited[i][j] != true){
            que.add(new int[]{i, j});
            visited[i][j] = true;
          }
        }
      }
    }

  }
  public static moveChess(int a, int b){

  }
}
