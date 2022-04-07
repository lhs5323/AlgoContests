import java.util.*;
import java.io.*;
import java.math.*;

public class PracticeA{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    int index = 1;
    while(t-- > 0){
      int[] row_col = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int row = row_col[0];
      int col = row_col[1];
      Character ans[][] = new Character[row*2 + 1][col*2 + 1];

      for(int i = 0; i < row*2 + 1; i++){
        for(int j = 0; j < col*2 + 1; j++){
          if(i % 2 == 0 && j % 2 == 0){
            ans[i][j] = '+';
          } else if(i % 2 != 0 && j % 2 == 0){
            ans[i][j] = '|';
          } else if(i % 2 == 0 && j % 2 != 0){
            ans[i][j] = '-';
          } else{
            ans[i][j] = '.';
          }
        }
      }
      pw.print("Case #" + index + ":");
      pw.println();
      for(int i = 0; i < ans.length; i++){
          for(int j = 0; j < ans[0].length; j++){
            if(i <= 1 && j <= 1){
              pw.print('.');
            } else{
              pw.print(ans[i][j]);
            }
          }
          pw.println();
      }
      index++;
    }
    pw.close();
  }
}
