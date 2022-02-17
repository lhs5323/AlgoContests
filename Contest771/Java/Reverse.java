import java.util.*;
import java.io.*;
import java.math.*;

public class Reverse{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] ans = new int[n];
      if(n == 1){
        pw.println(test[0]);
      } else{
        for(int i = 0; i < n; i++){
          ans[i] = test[i];
          if(test[i] != i + 1){
            int index = i;
            while(test[index] != i + 1){
              index++;
            }
            int left = i;
            for(int j = index; j >= i; j--){
              ans[left] = test[j];
              left++;
            }
            if(index != n - 1){
              for(int z = index + 1; z < n; z++){
                ans[z] = test[z];
              }
            }
            break;
          }
        }

        for(int i = 0; i < n; i++){
          if(i == n - 1){
            pw.print(ans[i]);
          } else{
            pw.print(ans[i] + " ");
          }
        }
        pw.println();
      }
    }
    pw.close();
  }
}
