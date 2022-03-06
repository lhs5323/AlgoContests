import java.util.*;
import java.io.*;
import java.math.*;

public class PowerWalking{
  public static PrintWriter pw = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] power = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    }
  }
}
