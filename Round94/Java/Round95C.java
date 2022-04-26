import java.util.*;
import java.io.*;
import java.math.*;

public class Round95C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      //int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int n = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      String[] w_arr = new String[s.length()];
      int index = 0;
      while(index < n){
        w_arr[index] = Character.toString(s.charAt(index + n));
        index++;
      }
      index = s.length() - 1; boolean flag = false;
      while(index > s.length() - n - 1){
        if(w_arr[index] != null && w_arr[index] != Character.toString(s.charAt(index))){
          flag = true;
          break;
        } else{
          w_arr[index] = Character.toString(s.charAt(index -n));
        }

        index--;
      }

      for(int i = 0; i < w_arr.length; i++){
        if(w_arr[i] != "0" && w_arr[i] != "1"){
          if(i + n < s.length()){
              w_arr[i] = Character.toString(s.charAt(i + n));
          } else{
            w_arr[i] = Character.toString(s.charAt(i - n));
          }

        }
        sb.append(w_arr[i]);
      }
      if(flag){
        pw.println("-1");
      } else{
        pw.println(sb);
      }


    }
    pw.close();
  }
}
