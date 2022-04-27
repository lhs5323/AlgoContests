import java.util.*;
import java.io.*;
import java.math.*;

public class Contest665B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //algo count 2s in a and count 1s in br
      /*ArrayList<Long> a_arr = new ArrayList<>();
      ArrayList<Long> b_arr = new ArrayList<>();*/
      int sum = a[0] + a[1] + a[2];
      int[] a_arr = new int[sum];
      int[] b_arr = new int[sum];

      int zero_a = a[0], one_a = a[1], two_a = a[2];
      int zero_b = b[0], one_b = b[1], two_b = b[2];

      //1) check two_a * one_b
      //2) check if we can decrease two_b < two_a + zero_a

      //3cases with algo 1
      int ans = 0;
      if(two_a > one_b && one_b != 0){
        ans = one_b * 2;
        one_b = 0;
        two_a = two_a - one_b;
      } else if(two_a < one_b && one_b != 0){
        ans = two_a * 2;
        two_a = 0;
        one_b = one_b - two_a;
      } else if(two_a == one_b && one_b != 0){
        ans = two_a * 2;
        one_b = 0;
        two_a = 0;
      }

      if(two_b > two_a + zero_a){
        ans = ans + ((two_b - (two_a + zero_a)) * -2);
      }

      pw.println(ans);
    }
    pw.close();
  }
}
