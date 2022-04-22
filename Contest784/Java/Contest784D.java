import java.util.*;
import java.io.*;
import java.math.*;

public class Contest784D{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      //long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      String s = br.readLine();
      String ans = "YES";
      //Exception
      if(s.length() == 1 && s.charAt(0) != 'W'){
        ans = "NO";
      }
      //at least 1R and 1B between "w"
      int count_r = 0, count_b = 0;
      for(int i = 0; i < n; i++){
        if(s.charAt(i) == 'R'){
          count_r++;
          if(i == n-1){
            if((count_r != 0 && count_b == 0) || (count_b != 0 && count_r == 0)){
              ans = "NO";
              break;
            }
          }
        } else if(s.charAt(i) == 'B'){
          count_b++;
          if(i == n - 1){
            if((count_r != 0 && count_b == 0) || (count_b != 0 && count_r == 0)){
              ans = "NO";
              break;
            }
          }
        } else{
          if((count_r != 0 && count_b == 0) || (count_b != 0 && count_r == 0)){
            ans = "NO";
            break;
          }
          count_r = 0;
          count_b = 0;
        }
      }


      pw.println(ans);
    }
    pw.close();
  }
}
