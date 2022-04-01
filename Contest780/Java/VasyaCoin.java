import java.util.*;
import java.io.*;
import java.math.*;

public class VasyaCoin{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] burle = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int ans = 0;
      if(burle[0] == 0 && burle[1] != 0){
        ans = 1;
      } else if(burle[1] == 0 && burle[0] != 0){
        ans = burle[0] + 1;
      } else if(burle[0] == 0 && burle[1] == 0){
        ans = 1;
      } else {
        ans = (burle[1] * 2) + burle[0] + 1;
      }
      pw.println(ans);
    }
    pw.close();
  }
}
