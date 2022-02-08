import java.util.*;
import java.io.*;
import java.math.*;

public class ABC{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String s = br.readLine();
      if(s.equals("0") || s.equals("1") || s.equals("01") || s.equals("10")){
        pw.println("YES");
      } else{
        pw.println("NO");
      }
    }
    pw.close();
  }
}
