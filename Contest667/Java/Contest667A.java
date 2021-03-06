import java.util.*;
import java.io.*;
import java.math.*;

public class Contest667A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int oper = 0, diff = 0;
      if(test[1] > test[0]){
        diff = test[1] - test[0];
        if(diff % 10 == 0){
          oper = diff / 10;
        } else{
          oper = (diff / 10) + 1;
        }
      } else if(test[1] < test[0]){
        diff = test[0] - test[1];
        if(diff % 10 == 0){
          oper = diff / 10;
        } else{
          oper = (diff / 10) + 1;
        }
      }
      pw.println(oper);
    }
    pw.close();
  }
}
