import java.util.*;
import java.io.*;
import java.math.*;

public class VladCandies{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int type = Integer.parseInt(br.readLine());
      int[] candies = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(candies);
      String ans = "";
      if(candies.length == 1 && candies[0] > 1){
        ans = "NO";
      } else if(candies.length == 1 && candies[0] == 1){
        ans = "YES";
      } else{
        if(candies[candies.length -1] - 1 > candies[candies.length - 2]){
          ans = "NO";
        } else{
          ans = "YES";
        }
      }

    

      pw.println(ans);
    }
    pw.close();
  }
}
