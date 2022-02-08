import java.util.*;
import java.io.*;
import java.math.*;

public class RoofConstruction{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static int min;
  public static int[] ans;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = i;
      }
      ans = new int[n];
      int[] output = new int[n];
      boolean[] visited = new boolean[n];
      int max = 0;
      min = Integer.MAX_VALUE;
      perm(arr, output, visited, 0, n, max);
      pw.println(min);
    }
    pw.close();
  }
  public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int max) {
        if (depth == n) {
            for(int i = 0; i < output.length; i++){
              if( i+1 < output.length){
                System.out.println(output[i] ^ output[i+1]);
                  if(max < (output[i] ^ output[i+1])){
                    max = output[i] ^ output[i+1];
                  }
              }
            }
            if(min > max){
              min = max;
              System.out.println("min changed");
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, max);
                visited[i] = false;
            }
        }
    }
}
