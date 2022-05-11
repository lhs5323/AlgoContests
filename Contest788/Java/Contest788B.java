import java.util.*;
import java.io.*;
import java.math.*;

public class Contest788B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String s = br.readLine();
      String k = br.readLine();
      int a = k.charAt(0);
      Character[] special = new Character[a];
      int index = 2;
      for(int i = 0; i < a; i ++){
        special[i] = k.charAt(index);
        index+=2;
      }
      StringBuilder pass = new StringBuilder(s);
      int chck = 0, ans = 0;
      outloop:
      while(true){
        for(int i = 0; i < pass.length(); i++){
          for(int j = 0; j < special.length; j++){
            if(pass.charAt(i) == special[j]){
                if(i == 0){
                  break outloop;
                }
                pass = pass.deleteCharAt(i - 1);
            }
          }
        }
        ans++;
      }
      pw.println(ans);
    }
    pw.close();
  }
}
