import java.util.*;
import java.io.*;
import java.math.*;

public class IntegerMove{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      //int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int ans = 0;
      double euc = 0.00;
      if(test[0] == 0 && test[1] == 0){
        ans = 0;
      } else{
        euc = Math.sqrt(Math.pow(test[0],2) + Math.pow(test[1],2));
        if(Math.floor(euc) == euc){
          ans = 1;
        } else{
          ans = 2;
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
