import java.util.*;
import java.io.*;
import java.math.*;

public class Contest668B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //finding minimum number of coins in which with less operation
      int max = 0, min = Integer.MAX_VALUE, oper = 0, count_zero = 0;
      int max_index = 0, min_index = 0;
      while(chkZero(test) == false){
        for(int i = 0; i < n; i++){
          int temp_max = max;
          max = Math.max(max, test[i]);
          if(max == test[i] && temp_max != test[i]){
            max_index = i;
          }
          int temp_min = min;
          min = Math.min(min, test[i]);
          if(min == test[i] && temp_min == test[i]){
            min_index = i;
          }
        }
        pw.println("max: " + max + " max_pos: " + max_index + " min: " + min + " min_pos: " + min_index);
        if(max_index > min_index){
          test[max_index] = test[max_index] - 1;
          test[min_index] = test[max_index] + 1;
          oper++;
        } else{
            if(max > -min){
              test[max_index] -= test[min_index];
              test[min_index] = 0;
            } else if(max < -min){
              test[min_index] += test[max_index];
              test[max_index] = 0;
            } else{
              test[max_index] = 0;
              test[min_index] = 0;
            }
        }
      }
      pw.println(oper);
    }
    pw.close();
  }
  public static boolean chkZero(int[] arr){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != 0){
        return false;
      }
    }
    return true;
  }
}
