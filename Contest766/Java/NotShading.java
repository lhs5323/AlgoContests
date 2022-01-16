import java.util.*;
import java.io.*;
import java.math.*;

public class NotShading{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] form = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Character[][] map = new Character[form[0]][form[1]];
      int count_w = 0;
      for(int i = 0; i < map.length; i++){
        String line = br.readLine();
        for(int j = 0; j < map[i].length; j++){
          map[i][j] = line.charAt(j);
          if(map[i][j] == 'W'){
            count_w++;
          }
        }
      }
      int res = 2;
      if(count_w == form[0] * form[1]){
        res = -1;
      } else if(map[form[2] - 1][form[3] - 1] == 'B'){
        res = 0;
      } else{
          for(int i = 0; i < form[1]; i++){
            if(map[form[2] - 1][i] == 'B'){
              res = 1;
            }
          }
          for(int i = 0; i < form[0]; i++){
            if(map[i][form[3] - 1] == 'B'){
              res = 1;
            }
          }
      }
      pw.println(res);
    }
    pw.close();
  }
}
