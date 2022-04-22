import java.util.*;
import java.io.*;
import java.math.*;

public class Contest784A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      if(n >= 1900){
        pw.println("Division 1");
      } else if(n >= 1600 && n <= 1899){
        pw.println("Division 2");
      } else if(n >= 1400 && n <= 1599){
        pw.println("Division 3");
      } else{
        pw.println("Division 4");
      }

    }
    pw.close();
  }
}
