import java.util.*;
import java.io.*;
import java.math.*;

public class Contest787A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] shop = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      String ans = "NO";
      if(shop[3] - shop[0] > 0){
        long dog = shop[3] - shop[0];
        if(shop[4] - shop[1] > 0){
          long cat = shop[4] - shop[1];
          if(dog + cat <= shop[2]){
            ans = "YES";
          }
        } else{
          if(dog <= shop[2]){
            ans = "YES";
          }
        }
      } else{
        if(shop[4] - shop[1] > 0){
          long cat = shop[4] - shop[1];
          if(cat <= shop[2]){
            ans = "YES";
          }
        } else{
          ans = "YES";
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
