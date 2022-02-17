import java.util.*;
import java.io.*;
import java.math.*;

public class OddSwapSort{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int first = test[0];
      String ans = "";
      if(n == 1){
        ans = "Yes";
        pw.println(ans);
      } else{
        for(int i = 1; i < n; i++){
            int index =
            if(first > test[i]){
              if((first + test[i]) % 2 == 0){
                ans = "No";
                break;
              }
            }
            first = test[i];
        }
        if(ans == "No"){
          pw.println(ans);
        } else{
          pw.println("Yes");
        }
      }

    }
    pw.close();
  }
}
