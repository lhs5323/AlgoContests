import java.util.*;
import java.io.*;
import java.math.*;

public class Round127C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] price = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long budget = test[1];
      Arrays.sort(price);
      long[] mem = new long[price.length];
      mem[0] = price[0];
      for(int i = 1; i < price.length; i++){
        mem[i] = mem[i - 1] + price[i];
      }
      long pack = 0;
      for(int i = 0; i < mem.length; i++){
        if(budget >= mem[i]){
          pack += ((budget - mem[i])/(i + 1)) + 1;
        }
      }
      pw.println(pack);
    }
    pw.close();
  }
}
