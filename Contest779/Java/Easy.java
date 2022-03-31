import java.util.*;
import java.io.*;
import java.math.*;

public class Easy{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(arr);
      int ans = 0;
      if(size[1] == arr[arr.length -1]){
        ans = 0;
      } else if(size[1] < arr[arr.length -1]){
        ans = arr[arr.length -1];
      } else{
        ans = arr[0];
      }
      pw.println(ans);
    }
    pw.close();
  }
}
