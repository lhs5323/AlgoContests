import java.util.*;
import java.io.*;
import java.math.*;

public class Round124B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      if(Math.pow(3, n-1) > 1000000000){
        pw.println("NO");
      } else{
        int num = 1;
        pw.println("YES");
        for(int i = 0; i < n; i++){

          pw.print(num + " ");
          num = num * 3;
        }
        pw.println();
      }
    }
    pw.close();
  }
}
