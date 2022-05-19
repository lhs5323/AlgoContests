import java.util.*;
import java.io.*;
import java.math.*;

public class Round658B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] piles = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

      int count = 0;

        for(int i = 0; i < piles.length; i++){
          if(piles[i] == 1){
            count++;
          } else{
            break;
          }
        }

      if(count % 2 == 0 && count != n){
        pw.println("First");
      } else if(count % 2 == 1 && count == n){
        pw.println("First");
      } else{
        pw.println("Second");
      }

    }
    pw.close();
  }
}
