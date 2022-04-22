import java.util.*;
import java.io.*;
import java.math.*;

public class Round127B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
        int n = Integer.parseInt(br.readLine());
        long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        String ans = "YES";
        //Exception
        if(n != 1){
          long dif = test[n - 1] - test[0];
          if(dif - n > 1){
            ans = "NO";
          }

        }
        pw.println(ans);
    }
    pw.close();
  }
}
