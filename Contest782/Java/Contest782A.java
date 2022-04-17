import java.util.*;
import java.io.*;
import java.math.*;

public class Contest782A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //test[0] = n, test[1] = R won, test[2] = B won
      //Algo test[1] / test[2] + 1 form string with 'R'
      //concat test[2] once than decrement
      //test[1] becomes test[1] - test[1] / test[2] + 1
      StringBuilder match = new StringBuilder();
      int section = test[2] + 1;
      int count = section - 1;
      while(count > 0){
        int red = test[1] / section;
        while(red > 0){
          match.append("R");
          red--;
        }
        test[1] -= test[1] / section;
        section--;
        match.append("B");
        count--;
      }
      if(match.length() < test[0]){
        while(match.length() < test[0]){
          match.append("R");
        }
      }
      pw.println(match);
    }
    pw.close();
  }
}
