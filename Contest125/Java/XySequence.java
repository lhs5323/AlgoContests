import java.util.*;
import java.io.*;
import java.math.*;

public class XySequence{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //pseudo: each operation chk whether it exceeds 'B'
      //test[0] = n, test[1] = B, test[2] = x, test[3] = y
      int ans = 0, n = test[0], i = 0;
      int[] arr = new int[n];
      while(n-- > 0){
        if(ans + test[2] > test[1]){
          ans -= test[3];
          arr[i] = ans;
        } else{
          ans += test[2];
          arr[i] = ans;
        }
        i++;
      }
      long res = 0;
      for(int s = 0; s < arr.length; s++){
          res += arr[s];
      }
      pw.println(res);
    }
    pw.close();
  }
}
