import java.util.*;
import java.io.*;
import java.math.*;

public class Round124A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int round = (int) Math.pow(2, n);
      pw.println(round - 1);
    }
    pw.close();
  }
}
