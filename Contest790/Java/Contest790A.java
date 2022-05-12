import java.util.*;
import java.io.*;
import java.math.*;

public class Contest790A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      String ans = "NO";
      int a = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
      int b = (s.charAt(s.length()-1) - '0') + (s.charAt(s.length()-2) - '0') + (s.charAt(s.length()-3) - '0');
      if(a == b){
        ans = "YES";
      }
      pw.println(ans);
    }
    pw.close();
  }
}
