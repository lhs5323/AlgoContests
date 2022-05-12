import java.util.*;
import java.io.*;
import java.math.*;

public class Contest790E{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] candies = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int query = arr[1];
      int[] numCandies = new int[query]
      int index = 0;
      while(query-- > 0){
        int target = Integer.parseInt(br.readLine());
        numCandies[index] = target;
        index++;
      }
      Arrays.sort(candies);
      int[] sum = new int[arr[0]];
      sum[0] = candies[candies.length - 1];
      for(int i = 1; i < sum.length; i++){
        sum[i] = candies[candies.length - (i + 1)] + sum[i - 1];
      }
      while(query-- > 0){
        int target = Integer.parseInt(br.readLine());
        int ans = -1;
        for(int i = 0; i < sum.length; i++){
          if(sum[i] >= target){
            ans = i + 1;
            break;
          }
        }
        pw.println(ans);
      }

    }
    pw.close();
  }
}
