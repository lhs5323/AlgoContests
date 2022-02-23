import java.util.*;
import java.io.*;
import java.math.*;

public class DoorsKeys{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      String map = br.readLine();
      boolean r = false;
      boolean g = false;
      boolean b = false;
      String ans = "YES";
      for(char c : map.toCharArray()){
        if(c == 'r'){
          r = true;
        } else if(c == 'g'){
          g = true;
        } else if(c == 'b'){
          b = true;
        } else{
          if(c == 'R' && r != true){
            ans = "NO";
            break;
          } else if(c == 'G' && g != true){
            ans = "NO";
            break;
          } else if(c == 'B' && b != true){
            ans = "NO";
            break;
          }
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
