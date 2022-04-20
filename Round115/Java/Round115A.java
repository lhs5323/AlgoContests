import java.util.*;
import java.io.*;
import java.math.*;

public class Round115A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[][] grid = new int[2][n];
      for(int i = 0; i < grid.length; i++){
        String s = br.readLine();
        for(int j = 0; j < s.length(); j++){
          grid[i][j] = s.charAt(j);
        }
      }
      String ans = "YES";
      for(int i = 0; i < n; i++){
        if(grid[0][i] == '1' && grid[1][i] == '1'){
            ans = "NO";
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
