import java.util.*;
import java.io.*;
import java.math.*;

public class PracticeB{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    int index = 1;
    while(t-- > 0){
      int[] printer_one = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] printer_two = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] printer_three = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int max = 1000000;
      int cyan = Math.min(printer_one[0], Math.min(printer_two[0], printer_three[0]));
      int magneta = Math.min(printer_one[1], Math.min(printer_two[1], printer_three[1]));
      int yellow = Math.min(printer_one[2], Math.min(printer_two[2], printer_three[2]));
      int black = Math.min(printer_one[3], Math.min(printer_two[3], printer_three[3]));
      //int[] min = new int[4];
      //min[0] = cyan; min[1] = magneta; min[2] = yellow; min[3] = black;
      if(cyan + magneta + yellow + black < max){
        pw.println("Case #" + index + ": " + "IMPOSSIBLE");
      } else{
          /*if(cyan + magneta + yellow + black == max){
            pw.println("Case #" + index + ": " + cyan + " " + magneta + " " + yellow + " " + black);
          } else{
          }*/
          int sum = 0;
          int num1 = Math.min(max - sum, cyan);
          sum += num1;
          int num2 = Math.min(max - sum, magneta);
          sum += num2;
          int num3 = Math.min(max - sum, yellow);
          sum += num3;
          int num4 = Math.min(max - sum, black);
          sum += num4;
          pw.println("Case #" + index + ": " + num1 + " " + num2 + " " + num3 + " " + num4);
        }
      
      index++;
    }
    pw.close();
  }
}
