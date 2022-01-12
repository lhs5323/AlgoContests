import java.util.*;
import java.io.*;
import java.math.*;

public class PlusSubset{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int min = Integer.MAX_VALUE;
      int max = 0;
      for(int i = 0; i < n; i++){
        if(min > test[i]){
          min = test[i];
        }
        if(max < test[i]){
          max = test[i];
        }
      }
      pw.println(max - min);
    }
    pw.close();
  }
}
