import java.util.*;
import java.io.*;
import java.math.*;

public class Contest792B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      //int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] ans = new int[3];
      ans[2] = arr[2];
      ans[1] = ans[2] + arr[1];
      ans[0] = ans[1] + arr[0];
      pw.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
    pw.close();
  }
}
