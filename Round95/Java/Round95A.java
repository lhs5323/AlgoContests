import java.util.*;
import java.io.*;
import java.math.*;

public class Round95A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    //operationstick => 1) -1 stick and gain x sticks
    // 2) -y sticks and gain 1 coal
    // torch => can be made with 1 stick and 1 coal
    while(t-- > 0){
      //initializing
      long[] input = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      //stick => amount of sticks to buy stick(x)
      //coal => amount of sticks to buy coal(y)
      //torches => number of torches to make
      long x = input[0], y = input[1], stick = 1, coal = 0, torches = input[2], oper = 0, oper2 = 0;

      //logic
      //1) make stick first -> you need to have y * torches + 1 stick to trade to get coal
      //
      /*time limit exceeds
      while(stick < (y * torches) + 1){
        stick += x - 1;
        oper++;
      }*/
      long need_stick = (y * torches) + torches - 1;
      oper = (need_stick) / (x - 1);
      if(need_stick % (x-1) != 0){
        oper++;
      }
      pw.println(oper + torches);

    }
    pw.close();
  }
}
