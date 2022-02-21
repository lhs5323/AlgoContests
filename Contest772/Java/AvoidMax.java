import java.util.*;
import java.io.*;
import java.math.*;

public class AvoidMax{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] dup = new int[n];
      for(int i = 0; i < test.length; i++){
        dup[i] = test[i];
      }
      int ans = 0;
      for(int i = 1; i < test.length - 1; i++){
        //local max found
        if(test[i] > test[i-1] && test[i] > test[i+1]){
          if(test[i-1] != dup[i-1]){
            test[i-1] = test[i];
          } else{
            ans++;
            test[i+1] = test[i];
          }
        }
      }
      pw.println(ans);
      for(int i = 0; i < dup.length; i++){
        pw.print(test[i] + " ");
      }
      pw.println();
    }
    pw.close();
  }
}
