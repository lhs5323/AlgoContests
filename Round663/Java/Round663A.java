import java.util.*;
import java.io.*;
import java.math.*;

public class Round663A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      for(int i = n; i > 0; i--){
        pw.print(i + " ");
      }
      pw.println();
    }
    pw.close();
  }
}
