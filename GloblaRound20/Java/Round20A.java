import java.util.*;
import java.io.*;
import java.math.*;

public class Round20A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int sum = 0, count_one = 0, count_even = 0;
      for(int i = 0; i < n; i++){
        sum += test[i];
        if(test[i] == 1){
          count_one++;
        }
        if(test[i] % 2 == 0){
          count_even++;
        }
      }

      if(n == 1){
        if(test[0] % 2 == 1){
          pw.println("maomao90");
        } else{
          pw.println("errorgorn");
        }
      } else if(count_one == n){
        pw.println("maomao90");
      } else if(count_even % 2 == 1){
        pw.println("errorgorn");
      } else if(count_even % 2 == 0){
        pw.println("maomao90");
      }


    }
    pw.close();
  }
}
