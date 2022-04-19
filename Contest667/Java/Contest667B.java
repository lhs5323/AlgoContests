import java.util.*;
import java.io.*;
import java.math.*;

public class Contest667B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long a = test[0], b = test[1], x = test[2], y = test[3], n = test[4];
      //first compare a and b and choose smallest
      long num_a = 0, num_b = 0;
      long ans = Long.MAX_VALUE, ans2 = Long.MAX_VALUE;
      if(a < b){
        if(a - n >= x){
          num_a = a - n;
          num_b = b;
        } else{

        }
      }
      if(test[0] <= test[1]){
        //second make product with the limiation;
        if(test[0] - test[4] < test[2]){
          ans = test[2] * (test[1] - (test[4] - (test[0] - test[2])));
        } else{
          ans = test[2] * test[1];
        }
      }
      if(test[1] < test[0]){
        //second make product with the limiation;
        if(test[1] - test[4] < test[3]){
          ans2 = test[3] * (test[0] - (test[4] - (test[1] - test[3])));
        } else{
          ans2 = test[3] * test[0];
        }
      }
      pw.println(Math.min(ans, ans2));

    }
    pw.close();
  }
}
