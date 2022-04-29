import java.util.*;
import java.io.*;
import java.math.*;

public class DfsPractice{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int[] s = Arrays.stream(br.readLine().split("")).mapToInt(Long::parseInt).toArray();
    //s[0] = n, s[1] = m, s[2] = starting node
    int n = s[0];
    int m = s[1];
    int start = s[2];
    int[] v = new int[1001];
    Vector<int[]> v = new Vector<int[]>();
    v.add(new int[]{1,2,3});
    v.add(new int[]{5,6});
    //Vector<Integer> [1001]v;
    int[] ans = v.get(0);
    pw.println(ans[1]);


    pw.close();
  }

}
