import java.util.*;
import java.io.*;
import java.math.*;

public class Contest784B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      Arrays.sort(test);
      long ans = test[0], count = 1;
      for(int i = 1; i < n; i++){
        if(ans == test[i]){
          count++;
          if(count == 3){
            break;
          }
        } else{
          ans = test[i];
          count = 1;
        }
      }
      if(count < 3){
        ans = -1;
      }
      pw.println(ans);

    }
    pw.close();
  }
}
