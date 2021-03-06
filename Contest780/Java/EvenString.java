import java.util.*;
import java.io.*;
import java.math.*;

public class EvenString{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      int ans = 0;
      HashSet<Character> set = new HashSet<Character>();
      for(int i = 0; i < s.length(); i++){
        if(set.contains(s.charAt(i))){
          ans += set.size() - 1;
          set.clear();
        } else{
          set.add(s.charAt(i));
        }
      }
      pw.println(ans + set.size());
    }
    pw.close();
  }
}
