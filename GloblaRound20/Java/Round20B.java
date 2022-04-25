import java.util.*;
import java.io.*;
import java.math.*;

public class Round20B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      //1) cant have s.length == 1
      //2) cant have s starts with B
      //3) cant have s contains only with b or a
      //4) cant have s b more than a
      long count_a = 0, count_b = 0;
      String ans = "YES";
      for(char c : s.toCharArray()){
        if(c == 'A'){
          count_a++;
        } else{
          count_b++;
        }
        if(count_b > count_a){
          ans = "NO";
          break;
        }
      }
      if(s.length() == 1){
        ans = "NO";
      } else if(s.charAt(0) == 'B' || s.charAt(s.length() - 1) == 'A'){
        ans = "NO";
      } else if(s.length() > 2){
        if(s.charAt(0) == 'A' && s.charAt(1) == 'B' && s.charAt(2) == 'B'){
            ans = "NO";
        }

      }

      pw.println(ans);
    }
    pw.close();
  }
}
