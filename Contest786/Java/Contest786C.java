import java.util.*;
import java.io.*;
import java.math.*;

public class Contest786C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      String a = br.readLine();
      BigInteger count = BigInteger.ONE;
      BigInteger count_a = BigInteger.ZERO;
      for(char c : s.toCharArray()){
        if(c == 'a'){
          count_a = count_a.add(BigInteger.ONE);
        }
      }

      //exception
      if(a.length() == 1 && a.charAt(0) == 'a'){
        count = BigInteger.ONE;
      } else if(a.indexOf('a') != -1){
        count = BigInteger.valueOf(-1);
      } else{
        BigInteger index = BigInteger.ONE;
        while((index.compareTo(count_a) == -1) || (index.compareTo(count_a) == 0)){
          BigInteger i = index.subtract(BigInteger.ONE);
          BigInteger fact = BigInteger.ONE;
          while((i.compareTo(BigInteger.ZERO) == 1) || (i.compareTo(BigInteger.ZERO) == 0)){
            fact = fact.multiply(count_a.subtract(i));
            i = i.subtract(BigInteger.ONE);
          }
          count = count.add(fact.divide(factorial(index)));
          index = index.add(BigInteger.ONE);
        }
      }
      pw.println(count);
    }
    pw.close();
  }
  public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.ONE;

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }
}
