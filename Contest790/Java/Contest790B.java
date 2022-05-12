import java.util.*;
import java.io.*;
import java.math.*;

public class Contest790B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int min = Integer.MAX_VALUE;
      int count = 0;
      for(int i = 0; i < arr.length; i++){
        if(arr[i] < min){
          min = arr[i];
        }
      }
      for(int i = 0; i < arr.length; i++){
        if(arr[i] > min){
          count += arr[i] - min;
        }
      }
      pw.println(count);

    }
    pw.close();
  }
}
