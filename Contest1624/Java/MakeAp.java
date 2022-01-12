import java.util.*;
import java.io.*;
import java.math.*;

public class MakeAp{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int min = Math.min(Math.min(test[0], test[1]), test[2]);
      int max = Math.max(Math.max(test[0], test[1]), test[2]);
      int mid, diff = 0;
      //either mid == max || min
      if(min == test[1]){
        if((test[0] < test[2] && test[2] - test[0] % 2 == 0) || ((test[0] == test[1] && test[1] != test[2])) || ((test[1] == test[2] && test[0] != test[1]))){

          diff = (test[2] - test[0]) / 2;
          if((test[0] + diff) % test[1] == 0 && diff != 0){
            pw.println("YES");
          } else{
            pw.println("NO");
          }
        } else if(test[0] > test[2] && test[0] - test[2] % 2 == 0){
          diff = (test[0] - test[2]) / 2;
          if((test[2] + diff) % test[1] == 0){
            pw.println("YES");
          } else{
            pw.println("NO");
          }
        } else { //3 equals
          pw.println("YES");
        }
      } else if(max == test[1]){
        //have to 2 cases
          if((test[1] + (test[1] - test[0])) % test[2] == 0){
            pw.println("YES");
          } else if ((test[0] + (test[1] - test[2])) % test[0] == 0){
            pw.println("YES");
          } else{
            pw.println("NO");
          }
      } else{
        if(test[2] - test[1] == test[1] - test[0]){
          pw.println("YES");
        } else{

           if(test[2] - test[0] % 2 != 0){
             pw.println("NO");
           } else{
             diff = (test[2] - test[0]) / 2;
             if(test[0] + diff % test[1] == 0){
               pw.println("YES");
             } else{
               pw.println("NO");
             }
           }
        }
      }
    }
    pw.close();
  }
}
