import java.util.*;
import java.io.*;
import java.math.*;

public class FortuneTelling{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      for(int i = 0; i < test[0]; i++){
        test[1] += arr[i];
      }
      if((test[1] - test[2]) % 2 == 0){
        pw.println("Alice");
      } else{
        pw.println("Bob");
      }
    }
    pw.close();
  }
}
