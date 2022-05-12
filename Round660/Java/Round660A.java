import java.util.*;
import java.io.*;
import java.math.*;

public class Round660A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String ans = "NO";
      if(n > 30){
        ans = "YES";
      }
      pw.println(ans);
      if(ans == "YES"){
        int[] nearly = new int[]{6, 10, 14, 15, 21, 35};
        printloop:
        for(int i = 0; i < nearly.length; i++){
          for(int j = i + 1; j < nearly.length; j++){
            for(int z = j + 1; z < nearly.length; z++){
              int notPrime = n - (nearly[i] + nearly[j] + nearly[z]);
              if(notPrime > 0 && notPrime != nearly[i] && notPrime != nearly[j] && notPrime != nearly[z]){
                  pw.println(nearly[i] + " " + nearly[j] + " " + nearly[z] + " " + notPrime);
                  break printloop;
              }
            }
          }
        }
      }

    }
    pw.close();
  }
}
