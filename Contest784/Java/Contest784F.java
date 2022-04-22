import java.util.*;
import java.io.*;
import java.math.*;

public class Contest784F{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long candies = 0;
      long[] alice = new long[n/2];
      long[] bob = new long[n/2];
      int left = 0, right = n - 1;
      while(left < right){
        alice[left] = test[left];
        bob[left] = test[right];
        left++;
        right--;
      }

      long[] alice_sum = new long[n/2];
      alice_sum[0] = alice[0];
      for(int i = 1; i < alice.length; i++){
        alice_sum[i] = alice_sum[i-1] + alice[i];
      }

      long[] bob_sum = new long[bob.length];
      bob_sum[0] = bob[0];
      for(int i = 1; i < alice.length; i++){
        bob_sum[i] = bob_sum[i-1] + bob[i];
      }

      for(int i = 0; i < alice.length; i++){
        if(alice_sum[i] == bob_sum[i]){
          candies += (i + 1) * 2;
        } else if(i + 1 < alice.length && alice_sum[i] == bob_sum[i + 1]){
          candies = ((i + 1)) * 2 + 1;
          break;
        } else if(i + 1 < alice.length && alice[i + 1] == bob[i]){
          candies = ((i + 1)) * 2 + 1;
          break;
        } else if()
      }
      if(n % 2 == 1 && candies == 0){
        if((alice_sum[alice.length - 1] + test[n/2] == bob_sum[bob.length - 1]) || (bob_sum[bob.length - 1] + test[n/2] == alice_sum[alice.length - 1])){
          candies = n;
        }
      }
      pw.println(candies);
    }
    pw.close();
  }
}
