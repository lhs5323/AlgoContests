import java.util.*;
import java.io.*;
import java.math.*;

public class BracketDeletion{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String s = br.readLine(), r = "";
      int op = 0, index = 1;
      while(s.length() > 1){
        if(s.startsWith("(") == true){
          Stack<Character> stck = new Stack<>();
          int ind = 0;
          stck.push('(');
            while(!stck.isEmpty() && ind < s.length() ){

                if(s.charAt(ind++) == ')'){
                  stck.pop();
                } else{
                  stck.push(s.charAt(ind++));
                }
            }
            if(ind >= s.length()){
              s = s.substring(2);
            } else{
                s = s.substring(ind+1);
            }

            op++;

        } else{
          for(int i = s.length() -1; i >= 0; i--){
            r += s.charAt(i);
          }
          if(s.equals(r) == false){
            while(s.equals(r) != true){
              for(int i = s.length() -1; i >= 0; i--){
                r += s.charAt(i);
              }
              index++;
              System.out.println("wow");
              s = s.substring(0, s.length() - index);
            }
            op++;
          } else{
            System.out.println("ok");
            s = s.substring(s.length() - index);

            op++;
          }
        }
      }
      pw.println(op + " " + s.length());

    }
    pw.close();
  }
}
