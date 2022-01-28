import java.util.*;
import java.io.*;
import java.math.*;

public class EvenSubArrays{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = test[test.length - 1 - i];
      }
      int first = arr[0];
      int count = 0;
      for(int i = 0; i < n; i++){
        if(arr[i] != first){
          count++;
          i = i * 2-1;
        }
      }
      pw.println(count);
    }
    pw.close();
  }
}
