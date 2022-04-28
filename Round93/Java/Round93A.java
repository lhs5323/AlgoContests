import java.util.*;
import java.io.*;
import java.math.*;

public class Round93A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      int index_i = 0, index_j = 1, index_z = 2;
      boolean flag = false;
      if(a[0] + a[1] <= a[a.length - 1]){
        pw.println(1 + " " + 2 + " " + a.length);
      } else{
        pw.println(-1);
      }
    }
    pw.close();
  }
}
