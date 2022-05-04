import java.util.*;
import java.io.*;
import java.math.*;

public class Round663B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Character[][] convey = new Character[size[0]][size[1]];
      for(int i = 0; i < convey.length; i++){
        String s = br.readLine();
        for(int j = 0; j < convey[0].length; j++){
          convey[i][j] = s.charAt(j);
        }
      }
      int count = 0;
      for(int i = 0; i < convey[0].length; i++){
        if(convey[convey.length - 1][i] == 'D'){
          count++;
        }
      }
      for(int i = 0; i < convey.length; i++){
        if(convey[i][convey[0].length - 1] == 'R'){
          count++;
        }
      }
      pw.println(count);
    }
    pw.close();
  }
}
