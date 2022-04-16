import java.util.*;
import java.io.*;
import java.math.*;

public class Contest668C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      String s = br.readLine();
      if(!chkBalanced(test, s)){
        pw.print("not balnced first!!!");
        pw.println("NO");
      } else{
        int count_one = 0, count_q = 0, count_zero = 0;
        for(int i = 0; i < test[1]; i++){
          if(s.charAt(i) == '1'){
            count_one++;
          } else if(s.charAt(i) == '0'){
            count_zero++;
          } else{
            count_q++;
          }
        }
        if(count_one + count_q == count_zero || count_zero + count_q == count_one || count_one == count_zero){
          pw.println("YES");
        } else{
          pw.print("not balnced second!!!");
          pw.println("NO");
        }
      }
    }
    pw.close();
  }
  public static boolean chkBalanced(int[] t, String num){
    int index = 0;
    while(index + t[1] < t[0]){
      if(num.charAt(index) != num.charAt(index + t[1]) && (num.charAt(index) == '0' || num.charAt(index) == '1') && (num.charAt(index + t[1]) == '0' || num.charAt(index + t[1]) == '1')){
        return false;

      }
      index++;
    }
    return true;
  }
}
