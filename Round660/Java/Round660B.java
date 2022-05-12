import java.util.*;
import java.io.*;
import java.math.*;

public class Round660B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      int div = n / 4;
      int mod = n % 4;
      if(mod > 0){
        div = div + 1;
      }
      for(int i = 0; i < n; i++){
        if(i >= n - div){
          sb.append("8");
        } else{
          sb.append("9");
        }

      }
      pw.println(sb);

    }
    pw.close();
  }
}
