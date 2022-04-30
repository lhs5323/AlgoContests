import java.util.*;
import java.io.*;
import java.math.*;

public class Contest664A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long min = Long.MAX_VALUE;
      String ans = "NO";
      int count_even = 0, count_odd = 0;
      for(int i = 0; i < 4; i++){
        if(a[i] % 2 == 0){
          count_even++;
        } else{
          count_odd++;
        }
        if(min > a[i]){
          min = a[i];
        }
      }
      if(count_even == 4 || (count_even == 3 && count_odd == 1) || (count_odd == 3 && count_even == 1 && min != 0) || (count_odd == 4)){
        ans = "YES";
      }
      if(a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0){
        ans = "YES";
      }
      pw.println(ans);
    }
    pw.close();
  }
}
