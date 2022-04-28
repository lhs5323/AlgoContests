import java.util.*;
import java.io.*;
import java.math.*;

public class Round93B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      ArrayList<Integer> one = new ArrayList<>();
      boolean check = false;
      int count_one = 0;
      for(char c : s.toCharArray()){
        if(c == '1' && check == false){
          count_one++;
          check = true;
        } else if(c == '0' && check == true){
          one.add(count_one);
          count_one = 0;
          check = false;
        } else if(c == '1' && check == true){
          count_one++;
        }
      }
      one.add(count_one);
      Collections.sort(one, Collections.reverseOrder());
      int ans = 0;
      for(int i = 0; i < one.size(); i += 2){
        ans += one.get(i);
      }
      pw.println(ans);
    }
    pw.close();
  }
}
