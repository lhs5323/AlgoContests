import java.util.*;
import java.io.*;
import java.math.*;

public class Contest784C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      boolean chk = true; long cur_odd = test[0], cur_even = test[1];
      for(int i = 2; i < n; i+=2){
        if(cur_odd % 2 == 0 && test[i] % 2 != 0){
          chk = false;
          break;
        } else if(cur_odd % 2 == 1 && test[i] % 2 != 1){
          chk = false;
          break;
        }

      }
      for(int i = 3; i < n; i += 2){
        if(cur_even % 2 == 0 && test[i] % 2 != 0){
          chk = false;
          break;
        } else if(cur_even % 2 == 1 && test[i] % 2 != 1){
          chk = false;
          break;
        }
      }
      if(chk){
        pw.println("YES");
      } else{
        pw.println("NO");
      }
    }
    pw.close();
  }
}
