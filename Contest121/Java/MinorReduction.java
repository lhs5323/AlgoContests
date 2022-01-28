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
      ArrayList<Character> chars = new ArrayList<Character>();
      for(char c: num.toCharArray()){
        chars.add(c);
      }
      BigInteger max = BigInteger.ZERO;
      if(num.length() == 1){
        res = num;
      } else{
        BigInteger length = BigInteger.valueOf(num.length()-1);
        BigInteger index = BigInteger.ZERO;
        while(index.compareTo(length) == -1){
          //char + char
          if(!index.equals(BigInteger.ZERO)){
            head = num.substring(0, index);
          }
          int sum = chars.get(index) - '0' + chars.get(index.add(BigInteger.ONE)) - '0';
          res = head + Integer.toString(sum) + num.substring(index.add(BigInteger.TWO));
          BigInteger comp = new BigInteger(res);
          //pw.println("comp" + comp);
          max = max.max(comp);
          index = index.add(BigInteger.ONE);
        }
      }
      pw.println(max);
    }
    pw.close();
  }
}
