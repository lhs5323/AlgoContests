import java.util.*;
import java.io.*;
import java.math.*;

public class Contest666A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      //Hashset to store<char, num>
      HashMap<Character, Integer> map = new HashMap<>();
      String ans = "YES";
      int n = Integer.parseInt(br.readLine());
      for(int i = 0; i < n; i++){
        String s = br.readLine();
        for(Character c : s.toCharArray()){
          if(map.containsKey(c)){
            map.put(c, map.get(c) + 1);
          } else{
            map.put(c, 1);
          }
        }
      }
      for(Character c : map.keySet()){
        if(map.get(c) % n != 0){
          ans = "NO";
          break;
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
