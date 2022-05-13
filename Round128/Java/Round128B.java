import java.util.*;
import java.io.*;
import java.math.*;

public class Round128B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Character[][] robot = new Character[arr[0]][arr[1]];
      int count_robot = 0;
      for(int i = 0; i < arr[0]; i++){
        String r = br.readLine();
        for(int j = 0; j < arr[1]; j++){
          robot[i][j] = r.charAt(j);
        }
      }
      boolean flag_one = false;
      int left = 0, up = 0;
      String ans = "YES";
      robotLoop:
      for(int i = 0; i < arr[0]; i++){
        for(int j = 0; j < arr[1]; j++){
          if(robot[i][j] == 'R' && flag_one == false){
            flag_one = true;
            left = i;
            up = j;
          }
          if(robot[i][j] == 'R' && flag_one == true){
            if(i - left < 0 || j - up < 0){
              ans = "NO";
              break robotLoop;
            }
          }
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
}
