import java.util.*;
import java.io.*;
import java.math.*;

public class Contest669A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n= Integer.parseInt(br.readLine());
      int [] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //alter sum of test has to be "0" after removing
      //remove at most n/2 elements
      int sum = 0, count_zero = 0, count_one =0;
      Arrays.sort(test);
      ArrayList<Integer> arr = new ArrayList<Integer>();
      for(int i = 0; i < n; i++){
        if(test[i] == 0){
          count_zero++;
        } else{
          count_one++;
        }
        if(i == n - 2 && count_one % 2 == 0){
          break;
        }
        arr.add(test[i]);

      }
      pw.println(arr);

    }
    pw.close();
  }
}
