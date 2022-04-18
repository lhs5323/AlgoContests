import java.util.*;
import java.io.*;
import java.math.*;

public class Contest782B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    //n length, k move = all bits flipped except selected
    while(t-- > 0){
      //input
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      String bitString = br.readLine();

      //initialize
      StringBuilder bitBuilder = new StringBuilder();
      int count = 0;
      int[] arr = new int[test[0]];

      //logic
      for(int i = 0; i < arr.length - 1; i++){
        if(bitString.charAt(i) - '0' == (test[1] % 2)){
          if(count < test[1]){
            count++;
            arr[i]++;;
            bitBuilder.append(1);
          } else{
            bitBuilder.append(0);
          }
        } else{
          bitBuilder.append(1);
        }
      }
      arr[arr.length - 1] += test[1] - count;
      bitBuilder.append((bitString.charAt(arr.length - 1) - '0' == (count % 2) ? 0 : 1));
      pw.println(bitBuilder);
      for(int i = 0; i < arr.length; i++){
        pw.print(arr[i] + " ");
      }
      pw.println();
    }
    pw.close();
  }
}
