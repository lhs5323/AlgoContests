import java.util.*;
import java.io.*;
import java.math.*;

public class Round20D{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long n = Long.parseInt(br.readLine());
      HashMap<Int[], int[]> map = new HashMap<>();
      long[] arr_one = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] arr_two = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();


    }
  }
}
