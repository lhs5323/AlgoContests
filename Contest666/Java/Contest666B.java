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
    long ans1 = 0, ans2 = 0;
    long c1 = (long) Math.ceil(Math.pow((double)test[n-1],(double)1/(n-1)));
    long c2 = (long) Math.floor(Math.pow((double)test[n-1],(double)1/(n-1)));
    pw.println("c1: " + c1);
    pw.println("c2: " + c2);
    for(int i = 0; i < n; i++){
      if(test[i] != (long) Math.pow(c1, i)){
        ans1 += Math.abs(test[i] - (long) Math.pow(c1, i));
      }
      if(test[i] != (long) Math.pow(c2, i)){
        ans2 += Math.abs(test[i] - (long) Math.pow(c2, i));
      }
    }
    if(ans1 < 0){
      pw.println(ans2);
    } else if(ans2 < 0){
      pw.println(ans1);
    } else{
      pw.println(Math.min(ans1, ans2));
    }
    pw.close();
  }
}
