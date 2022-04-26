import java.util.*;
import java.io.*;
import java.math.*;

public class Round94A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String s = br.readLine();
      //String ans = s.substring(s.length() - n, s.length());
      String zero = "";
      String one = "";
      for(int i = 0; i < n; i++){
        zero = zero + "0";
        one = one + "1";
      }
      int index = 0, zero_count = 0, one_count = 0;
      boolean zeroFlag = false;
      while(index + n < s.length()+1){
        String split = s.substring(index, index+n);
        for(int i = 0; i < zero.length(); i++){
          if(zero.charAt(i) == split.charAt(i)){
            zeroFlag = true;
            break;
          }
        }
        if(zeroFlag){
          zero_count++;
          zeroFlag = false;
        }
        index++;
      }
      index = 0; zeroFlag = false;
      while(index + n < s.length()+1){
        String split = s.substring(index, index+n);
        for(int i = 0; i < one.length(); i++){
          if(one.charAt(i) == split.charAt(i)){
            zeroFlag = true;
            break;
          }
        }
        if(zeroFlag){
          one_count++;
          zeroFlag = false;
        }
        index++;
      }

      if(zero_count != n){
        pw.println(one);
      } else{
        pw.println(zero);
      }

    }
    pw.close();
  }
}
