import java.util.*;
import java.io.*;
import java.math.*;

public class Round671A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      //raze -> oddposition mark, Breach -> evenposition mark
      //odd Raze win, even Breach win
      //Pseudo: if Raze can save odd number than win
      int n = Integer.parseInt(br.readLine());
      String num = br.readLine();
      int ans = 2;
      if(n == 2){
        if((num.charAt(1) - '0') % 2 != 0){
          ans = 1;
        }
      } else{
        if(n > 2 && n % 2 == 0){
          for(int i = 1; i < num.length(); i+=2){
            if((num.charAt(i) - '0') % 2 == 0){
              ans = 2;
              break;
            }
            ans = 1;
          }
        } else{
          for(int i = 0; i < num.length(); i+=2){
            if((num.charAt(i) - '0') % 2 != 0){
              ans = 1;
              break;
            }
          }
        }

      }

      pw.println(ans);
    }
    pw.close();
  }
}
