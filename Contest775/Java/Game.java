import java.util.*;
import java.io.*;
import java.math.*;

public class Game{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] location = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int hole = 0;
      //two pointer
      int head = 0, tail = n - 1;
      int curr_location = 0, last_location = n - 1;
      boolean tail_chk = false, head_chk = false;
      while(head < n && location[head] == 1){
        head++;
      }
      while(tail >= 0 && location[tail] == 1){
        tail--;
      }
      pw.println(Math.max(0, (tail + 1) - (head - 1)));
    }
    pw.close();
  }
}
