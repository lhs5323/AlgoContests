import java.util.*;
import java.io.*;
import java.math.*;

public class Contest665A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //test[0] = initial point, test[1] = desirable absolute value
      int oper = 0;
      if(test[1] >= test[0]){
        oper = test[1] - test[0];
      } else{
        if((test[0] % 2 == 0 && test[1] % 2 == 0) || (test[0] % 2 == 1 && test[1] % 2 == 1)){
          oper = 0;
        } else {
          oper = 1;
        }
      }
      pw.println(oper);

    }
    pw.close();
  }
}
