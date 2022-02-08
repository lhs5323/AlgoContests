import java.util.*;
import java.io.*;
import java.math.*;

public class ReverseNConcatenate{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      String s = br.readLine();
      StringBuffer sb = new StringBuffer(s);
      String reversed = sb.reverse().toString();
      int ans = 2;
      if(s.equals(reversed) || test[1] == 0){
        ans = 1;
      }
      pw.println(ans);
    }
    pw.close();
  }
}
