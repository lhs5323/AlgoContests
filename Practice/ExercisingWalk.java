import java.util.*;
import java.io.*;
import java.math.*;

public class ExercisingWalk{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
    int[] catMove = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] pos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if(Math.abs(pos[4] - pos[2]) < Math.abs(catMove[0] - catMove[1]) || Math.abs(pos[5] - pos[3]) < Math.abs(catMove[2] - catMove[3])){
      pw.println("No");
    } else{
      pw.println("Yes");
    }
    }
    pw.close();
  }
}
