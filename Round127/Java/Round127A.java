import java.util.*;
import java.io.*;
import java.math.*;

public class Round127A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      char first = s.charAt(0);
      int count = 1; String ans = "YES";
      if(s.length() == 1){
        ans = "NO";
      } else{
        for(int i = 1; i < s.length(); i++){
          if(first == s.charAt(i)){
            count++;
          } else{
            if(count == 1){
              ans = "NO";
              break;
            }
            count = 1;
            first = s.charAt(i);
          }
        }
        if(s.charAt(s.length() - 1) != s.charAt(s.length() - 2)){
          ans = "NO";
        }
      }

      pw.println(ans);


    }
    pw.close();
  }
}
