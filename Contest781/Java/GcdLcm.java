import java.util.*;
import java.io.*;
import java.math.*;

public class GcdLcm{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int a = 1, b = n - 3, c = 1, d = 1;
      pw.println(a + " " + b + " " + c + " " + d);
    }
    pw.close();
  }
}
