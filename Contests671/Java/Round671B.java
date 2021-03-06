import java.util.*;
import java.io.*;
import java.math.*;

public class Round95B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] locked = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      ArrayList<Integer> unlocked = new ArrayList<>();
      for(int i = 0; i < n; i++){
        if(locked[i] == 0){
          unlocked.add(test[i]);
        }
      }
      Collections.sort(unlocked, Collections.reverseOrder());
      for(int i = 0; i < n; i++){
        if(locked[i] == 0){
          unlocked.get(i);
        }
        pw.print(locked[i] + " ");
      }
      pw.println();
    }
    pw.close()
  }
}
