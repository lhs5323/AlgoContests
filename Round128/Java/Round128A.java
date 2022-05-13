import java.util.*;
import java.io.*;
import java.math.*;

public class Round128A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        int min = arr[0];
        int max = arr[2];
        if(min >= arr[2] && min <= arr[3]){
          ans = min;
        } else if(max >= arr[0] && max <= arr[1]){
          ans = max;
        } else{
          ans = min + max;
        }
        pw.println(ans);

    }
    pw.close();
  }
}
