import java.util.*;
import java.io.*;
import java.math.*;

public class Contest670A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(test);
      int a = -1; int b = -1;
      for(int i = 0; i < n; i++){
        if(test[i] == a + 1){
          a++;
        } else if(test[i] == b + 1){
          b++;
        }
      }
      pw.println(a + 1 + b + 1);
    }
    pw.close();
  }
}
