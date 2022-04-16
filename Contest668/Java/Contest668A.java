import java.util.*;
import java.io.*;
import java.math.*;

public class Contest668A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int left = 0, right = n - 1;
      while(left < right){
        int temp = test[left];
        test[left] = test[right];
        test[right] = temp;
        left++;
        right--;
      }
      for(int i = 0; i < n; i++){
        pw.print(test[i] + " ");
      }
      pw.println();
    }
    pw.close();
  }
}
