import java.util.*;
import java.io.*;
import java.math.*;

public class Round93C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static long count;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] s = Arrays.stream(br.readLine().split("")).mapToLong(Long::parseLong).toArray();
      count = 0;
      subArrays(s,0,0);
      pw.println(count);
    }
    pw.close();
  }
  public static void subArrays(long[] arr, int start, int end){
    if (end == arr.length){
      return;
    } else if(start > end){
      subArrays(arr, 0, end + 1);
    } else{
      long sum = 0;
      for(int i = start; i <= end; i++){
        sum += arr[i];
      }
      if(sum == (end - start) + 1){
        count++;
      }
      subArrays(arr, start + 1, end);
    }
    return;
  }
}
