import java.util.*;
import java.io.*;
import java.math.*;

public class Contest790C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      String[] equal = new String[arr[0]];
      for(int i = 0; i < arr[0]; i++){
        equal[i] = br.readLine();
      }
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < equal.length; i++){
        String s = equal[i];
        for(int j = i + 1; j < equal.length; j++){
          String s_plus = equal[j];
          int dif = 0;
          for(int z = 0; z < arr[1]; z++){
            dif += Math.abs((s.charAt(z) - 'a') - (s_plus.charAt(z) - 'a'));
          }
          if(dif < min){
            min = dif;
          }
        }
      }
      pw.println(min);
    }
    pw.close();
  }
}
