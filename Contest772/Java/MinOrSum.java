import java.util.*;
import java.io.*;
import java.math.*;

public class MinOrSum{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int ans = 0;
      for(int i = 0; i < test.length; i++){
        ans |= test[i];
      }
      pw.println(ans);
    }
    pw.close();
  }
}
