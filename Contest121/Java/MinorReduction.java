import java.util.*;
import java.io.*;
import java.math.*;

public class MinorReduction{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String num = br.readLine();
      String res = "";
      String head = "";
      BigInteger max = BigInteger.ZERO;
      if(num.length() == 1){
        res = num;
      } else{
        for(int i = 0; i < num.length() - 1; i++){
          //char + char
          if(i != 0){
            head = num.substring(0, i);
          }
          int sum = num.charAt(i) - '0' + num.charAt(i + 1) - '0';
          res = head + Integer.toString(sum) + num.substring(i+2);
          BigInteger comp = new BigInteger(res);
          //pw.println("comp" + comp);
          max = max.max(comp);
        }
      }
      pw.println(max);
    }
    pw.close();
  }
}
