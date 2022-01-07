import java.util.*;
import java.io.*;
import java.math.*;

public class StableRooks{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int size = test[0];
      int rooks = test[1];
      //constructing algo if size % 2 == 0(even) than the rooks have to be smaller than equal to half of the size
      // else size % 2 == 1(odd) num of rooks may be smaller than equal to half of the size +1
      //pw.println(size/2 + 1);
      //Exception
      
      int pos_i = 0;
      int pos_j = 0;
      if(size % 2 == 0 && rooks <= size/2){
          for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(pos_i == i && pos_j == j && rooks > 0){
                  pw.print("R");
                  rooks--;
                  pos_i += 2;
                  pos_j += 2;
                } else{
                  pw.print(".");
                }
            }
            pw.println();
          }

      } else if(size % 2 == 1 &&  rooks <= (size/2) +1){
          for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(pos_i == i && pos_j == j && rooks > 0){
                  pw.print("R");
                  rooks--;
                  pos_i += 2;
                  pos_j += 2;
                } else{
                  pw.print(".");
                }
            }
            pw.println();
          }

      } else{
        pw.println(-1);
      }

    }
    pw.close();
  }
}
