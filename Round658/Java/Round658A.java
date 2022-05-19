import java.util.*;
import java.io.*;
import java.math.*;

public class Round658A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      //int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] arr_one = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] arr_two = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      HashMap<Integer, Integer> map = new HashMap<>();
      int ans = 0;
      for(int i = 0; i < arr_one.length; i++){
        if(!map.containsKey(arr_one[i])){
          map.put(arr_one[i], 1);
        }
      }
      for(int i = 0; i < arr_two.length; i++){
        if(map.containsKey(arr_two[i])){
          ans = arr_two[i];
        }
      }

      if(ans != 0){
        pw.println("YES");
        pw.println(1 + " " + ans);
      } else{
        pw.println("NO");
      }


    }
    pw.close();
  }
}
