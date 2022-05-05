import java.util.*;
import java.io.*;
import java.math.*;

public class Contest787B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

      int index = 0;
      int count= 0;
      int zero_count = 0;
      if(arr.length == 1){

      }
      while(index + 1 < arr.length){
        if(arr[index] >= arr[index + 1]){
          if(arr[index] / 2 == 0){
            zero_count++;
            if(zero_count > 1){
              count = -1;
              break;
            }
          }
          arr[index] = arr[index] / 2;
          index = 0;
          count++;
        } else{
          index++;
        }
      }
      pw.println(count);
    }
    pw.close();
  }
}
