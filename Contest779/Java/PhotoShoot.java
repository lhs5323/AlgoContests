import java.util.*;
import java.io.*;
import java.math.*;

public class PhotoShoot{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String s = br.readLine();
      int count_male = 0, count_female = 0;
      int ans = 0, index = 0;
      while(index + 3 <= n){
        if(s.substring(index, index+3).equals("010")){
          ans++;
        }
        index++;
      }
      for(char c : s.toCharArray()){
        if(c == '0' && count_male == 0){
          count_male++;
        } else if(c == '0' && count_male != 0){
          count_male++;
        } else if(c == '1' && count_male > 1){
          ans += (count_male - 1) * 2;
          count_male = 0;
        } else{
          count_male = 0;
        }
      }
      if(count_male != 0){
        ans += (count_male - 1) * 2;
      }
      pw.println(ans);
    }
    pw.close();
  }
}
