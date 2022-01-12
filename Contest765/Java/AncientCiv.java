import java.util.*;
import java.io.*;
import java.math.*;

public class AncientCiv{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] form = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] words = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] count = new int[form[1]];
      StringBuilder y = new StringBuilder();
      for(int i = 0; i < words.length; i++){
        String num = toBinary(words[i], form[1]);
        for(int j = 0; j < num.length(); j++){
          if (num.charAt(j) == '1'){
            count[j] = count[j]+1;
          }
        }
      }
      for(int i = 0; i < count.length; i++){
        if(count[i] > form[0] / 2){
          y.append("1");
        } else{
          y.append("0");
        }
      }
      int res = Integer.parseInt(y.toString() , 2);
      pw.println(res);
    }
    pw.close();
  }

  public static String toBinary(int x, int len)
    {
        StringBuilder result = new StringBuilder();

        for (int i = len - 1; i >= 0 ; i--)
        {
            int mask = 1 << i;
            result.append((x & mask) != 0 ? 1 : 0);
        }

        return result.toString();
    }
}
