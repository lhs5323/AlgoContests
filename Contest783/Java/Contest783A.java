import java.util.*;
import java.io.*;
import java.math.*;

public class Contest783A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long ans = 0;
      //exception
      if((test[0] == 1 && test[1] >= 3) || (test[0] >= 3 && test[1] == 1)){
        ans = -1;
      } else if(test[0] > test[1]){
        if((test[0] - test[1]) % 2 != 0){
          ans = ((test[0] - 1) * 2) - 1;
        } else{
          ans = (test[0] - 1) * 2;
        }
      } else if(test[1] > test[0]){
          if((test[1] - test[0]) % 2 != 0){
            ans = ((test[1] - 1) * 2) - 1;
          } else{
            ans = (test[1] - 1) * 2;
          }

      } else{
        ans = (test[1] - 1) * 2;
      }
      pw.println(ans);
    }
    pw.close();
  }
}
