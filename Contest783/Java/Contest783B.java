import java.util.*;
import java.io.*;
import java.math.*;

public class Contest783B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      //long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      //long[] chairs = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] test = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] chairs = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      String ans = "YES";
      long chair = 0;
      if(test[0] > test[1]){
        ans ="NO";
      } else{
        for(int i = 0; i < test[0]; i++){
          chair += chairs[i] * 2;
          if(chair > test[1]){
            ans = "NO";
            break;
          }
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
