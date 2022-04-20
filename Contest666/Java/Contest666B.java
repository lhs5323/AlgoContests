import java.util.*;
import java.io.*;
import java.math.*;

public class Contest666B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int n = Integer.parseInt(br.readLine());
    long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    Arrays.sort(test);
    long ans1 = 0, ans2 = 0, ans3 = 0;
    long c1 = (long) Math.round(Math.pow((double)test[n-1],(double)1/(n-1)));
    long c2 = (long) Math.round(Math.pow((double)test[n-1],(double)1/(n-1)) - 1);
    long c3 = (long) Math.round(Math.pow((double)test[n-1],(double)1/(n-1)) + 1);

    //pw.println("c1:" + c1);
    //pw.println("c2:" + c2);
    //pw.println("c3:" + c3);
    for(int i = 0; i < n; i++){
      if(test[i] != (long) Math.pow(c1, i)){
        ans1 += Math.abs(test[i] - (long) Math.pow(c1, i));
        //pw.println("dif: " + Math.abs(test[i] - (long) Math.pow(c1, i)));
      }
      if(test[i] != (long) Math.pow(c2, i)){
        ans2 += Math.abs(test[i] - (long) Math.pow(c2, i));
      }
      if(test[i] != (long) Math.pow(c3, i)){
        ans3 += Math.abs(test[i] - (long) Math.pow(c3, i));
      }
    }
    //pw.println("ans1:" + ans1 + " ans2: " + ans2);
    ans1 = Math.abs(ans1);
    ans2 = Math.abs(ans2);
    ans3 = Math.abs(ans3);
    pw.println(Math.min(Math.min(ans1, ans2), ans3));

    pw.close();
  }
}
