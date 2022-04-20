import java.util.*;
import java.io.*;
import java.math.*;

public class Round115B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[][] schedule = new int[n][5];
      for(int i = 0; i < n; i++){
        int[] days = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int j = 0; j < 5; j++){
          schedule[i][j] = days[j];
        }
      }

    }
  }
}
