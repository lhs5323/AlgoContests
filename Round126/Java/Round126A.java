import java.util.*;
import java.io.*;
import java.math.*;

public class Round126A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] b = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long sumA = 0, sumB = 0;

      //Logic
      for(int i = 1; i < n; i++){
        if(Math.abs(a[i] - a[i-1]) + Math.abs(b[i] - b[i-1]) > Math.abs(b[i] - a[i-1]) + Math.abs(a[i] - b[i-1])){
          long temp = a[i];
          a[i] = b[i];
          b[i] = temp;
        }
        sumA += Math.abs(a[i] - a[i-1]);
        sumB += Math.abs(b[i] - b[i-1]);
      }
      pw.println(sumA + sumB);
    }
    pw.close();
  }
}
