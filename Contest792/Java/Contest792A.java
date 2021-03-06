import java.util.*;
import java.io.*;
import java.math.*;

public class Contest792A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      //int n = Integer.parseInt(br.readLine());
      //int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      String s = br.readLine();
      int min = Integer.MAX_VALUE;
      //int ans = 0;
      if(s.length() == 2){
        min = s.charAt(1) - '0';
      } else{
        for(char c : s.toCharArray()){
          int n = c - '0';
          if(min > n){
            min = n;
          }
        }
      }
      pw.println(min);
    }
    pw.close();
  }
}
