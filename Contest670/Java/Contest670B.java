import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Collectors;

public class Contest670B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      Arrays.sort(test);
      ArrayList<Long> integerArray = (ArrayList<Long>) Arrays.stream(test).boxed().collect(Collectors.toList());
      for(int i = 0; i < 4; i ++){
        integerArray.add(test[i]);
      }
      long[] dp = new long[n];
      dp[0] = test[0] * test[1] * test[2] * test[3] * test[4];
      int count = 0;
      for(int i = 1; i < n; i++){
          dp[i] = 1;
          while(count < 5){
            int index = i + count;
            if(index >= n){
              index = i + count - n;
            } else{
              index = i + count;
            }
            dp[i] = dp[i] * test[index];
            count++;
          }
          count = 0;
      }

      long ans = dp[0];
      for(int i = 0; i < dp.length; i++){
        ans = Math.max(ans, dp[i]);
      }
      pw.println(ans);

    }

  pw.close();
  }
}
