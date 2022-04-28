import java.util.*;
import java.io.*;
import java.math.*;

public class Round10B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] b = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      //length of array = a[0], operation = a[1]
      /*
      Psuedo Algo: 1) find max first
      2) and do one operation and sort
      3)
      */

      long[] temp = new long[b.length];
      for(int i = 0; i < b.length; i++){
        temp[i] = b[i];
      }
      Arrays.sort(temp);
      long max = temp[temp.length - 1];
      if(temp[0] < 0){

          for(int i = 0; i < b.length; i++){
            b[i] = max - b[i];
          }
          max = max - (temp[0]);
          HashMap<Long, long[]> map = new HashMap<>();
          for(int i = 0; i < b.length; i++){
            long[] index = new long[2];
            index[0] = max - b[i];
            index[1] = b[i];
            map.put(b[i], index);
          }
          if(a[1] % 2 == 0){
            for(int j = 0; j < b.length; j++){
              long[] ans = map.get(b[j]);
              b[j] = ans[0];
            }
          }
      } else{
        if(b.length == 1){
          b[0] = 0;
        }

        HashMap<Long, long[]> map = new HashMap<>();
        for(int i = 0; i < b.length; i++){
          long[] index = new long[2];
          index[0] = max - b[i];
          index[1] = b[i];
          map.put(b[i], index);
        }
        if(a[1] % 2 != 0){
          for(int j = 0; j < b.length; j++){
            long[] ans = map.get(b[j]);
            b[j] = ans[0];
          }
        }
      }
      for(int x = 0; x < b.length; x++){
        pw.print(b[x]+ " ");
      }
      pw.println();

    }
    pw.close();
  }
}
