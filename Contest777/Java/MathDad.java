import java.util.*;
import java.io.*;
import java.math.*;

public class MathDad{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
        //pseudo algo: if the num % 3 the answer starts with 1 else starts 2
        int n = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();
        int ans = 0, index = 0;
        // exception


        //chk
        if(n == 1){
          str.append("1");
          ans = 1;
          index++;
        } else if(n == 2){
          str.append("2");
          ans = 2;
          index++;
        } else if(n % 3 == 1){
          str.append("1");
          ans = 1;
          index++;
        } else{
          str.append("2");
          ans = 2;
          index++;
        }
        while(ans < n){
          if(str.charAt(index - 1) == '1'){
            str.append("2");
            ans += 2;
            index++;
          } else{
            str.append("1");
            ans += 1;
            index++;
          }
        }
        pw.println(str);


    }
    pw.close();
  }

}
