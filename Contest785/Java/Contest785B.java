import java.util.*;
import java.io.*;
import java.math.*;

public class Contest785B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      String ans = "YES";
      Set<Character> set = new HashSet<>();
      for(int i = 0; i < s.length(); i++){
        if(!set.contains(s.charAt(i))){
          set.add(s.charAt(i));
        }
      }
      for(int i = 0; i <= s.length() - set.size(); i++) {
        String sub = s.substring(i, i + set.size());
        Set<Character> sub_set = new HashSet<>();
        for(int j = 0; j < sub.length(); j++){
          if(!sub_set.contains(sub.charAt(j))){
            sub_set.add(sub.charAt(j));
          }
        }
        if(sub_set.size() != set.size()){
          ans = "NO";
          break;
        }
        sub_set.clear();
      }
      pw.println(ans);



    }
    pw.close();
  }
}
