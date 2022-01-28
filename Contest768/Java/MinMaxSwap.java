import java.util.*;
import java.io.*;
import java.math.*;

public class MinMaxSwap{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] first = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] second = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int temp = 0;
      for(int i = 0; i < n; i++){
        if(first[i] < second[i]){
          temp = second[i];
          second[i] = first[i];
          first[i] = temp;
        }
      }
      int first_max = 0;
      int second_max = 0;
      for(int i = 0; i < n; i++){
        if(first[i] > first_max){
          first_max = first[i];
        }
        if(second[i] > second_max){
          second_max = second[i];
        }
      }
      pw.println(first_max * second_max);
    }
    pw.close();
  }
}
