import java.util.*;
import java.io.*;
import java.math.*;

public class Contest787C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      int left = 0, right = s.length() - 1;
      int left_one = 0, right_zero = s.length() -1 ;
      while(left <= s.length() - 1 && right >= 0){
        if(s.charAt(left) == '1'){
          left_one = left;
        }
        if(s.charAt(right) == '0'){
          right_zero = right;
        }
        left++;
        right--;
      }




      pw.println(right_zero - left_one + 1);
    }
    pw.close();
  }
}
