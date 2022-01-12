import java.util.*;
import java.io.*;
import java.math.*;

public class DiviPermu{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(test);
      for(int i = 0; i < n; i++){
        if(test[i] <= ){

        }
      }
      Arrays.sort(test, Collections.reverseOrder());
      boolean[] chk = new boolean[n];
      for(int i = 0; i < n; i++){
        if(test[i] <= n){
          chk[test[i] - 1] = true;
        }
      }
      for(int i = 0; i < n; i++){
        if(chk[i] != true){
          int num = test[i];
          while(num > n){
            num = num / 2;

          }
          if(chk[num - 1] == false){
            chk[num - 1] == true;
          } else{
            while(chk[num - 1] == false){
              num = num / 2;
            }
          }
        }
      }
    }
  }
}
