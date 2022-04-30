import java.util.*;
import java.io.*;
import java.math.*;

public class Contest785A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      int ans = 0;
      if(s.length() % 2 == 0){
        for(char c : s.toCharArray()){
          ans += c - '`';
        }
        pw.println("Alice " + ans);
      } else{
        if(s.length() == 1){
          pw.println("Bob " + (s.charAt(0) - '`'));
        } else{
          for(int i = 1; i < s.length() - 1; i++){
            ans += (s.charAt(i) - '`');
          }
          if((s.charAt(0) - '`') > (s.charAt(s.length() - 1) - '`')){
            ans = ans + (s.charAt(0) - '`');
            ans = ans - (s.charAt(s.length() - 1) - '`');
          } else{
            ans = ans + (s.charAt(s.length() - 1) - '`');
            ans = ans - (s.charAt(0) - '`');
          }
          pw.println("Alice " + ans);
        }


      }

    }
    pw.close();
  }
}
