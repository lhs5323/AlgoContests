import java.util.*;
import java.io.*;
import java.math.*;

public class Contest786A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(a[1] % a[0] != 0){
        pw.println(0 + " " + 0);
      } else{
        pw.println(1 + " " + a[1] / a[0]);
      }

    }
    pw.close();
  }
}
