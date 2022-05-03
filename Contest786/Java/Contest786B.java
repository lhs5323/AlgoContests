import java.util.*;
import java.io.*;
import java.math.*;

public class Contest786B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      int ans = 0;
      int first = s.charAt(0) - '`';
      if(s.charAt(0) != 'a'){
        ans = (s.charAt(0) - 'a') * 25;
      }

      if(s.charAt(0) - 'a' > s.charAt(1) - 'a'){
        ans += (s.charAt(1) - 'a') + 1;
      } else{
        ans += (s.charAt(1) - 'a');
      }
      pw.println(ans);
    }
    pw.close();
  }
}
