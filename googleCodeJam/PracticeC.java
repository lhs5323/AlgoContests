import java.util.*;
import java.io.*;
import java.math.*;

public class PracticeC{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    int index = 1;
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(s);
      int num = 1;
      for(int dice_num : s){
        if(num <= dice_num){
          num++;
        }
      }

      pw.println("Case #" + index + ": " + (num - 1));
      index++;
    }
    pw.close();
  }
}
