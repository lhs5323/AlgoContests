import java.util.*;
import java.io.*;
import java.math.*;

public class Round20C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

      long comp = test[0];
      int count = 0, length = 1;
      for(int i = 1; i < n; i++){
        if(length >= 3){
          count++;
        }
        if(comp == test[i]){

          length++;
        } else{
          comp = test[i];
          if(length == 2){
            count++;
          }
          length = 1;
        }
      }
      pw.println(count);
    }
    pw.close();
  }
}
