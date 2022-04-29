import java.util.*;
import java.io.*;
import java.math.*;

public class DfsPractice{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    //s[0] = n, s[1] = m, s[2] = starting node
    int n = s[0];
    int m = s[1];
    int start = s[2];
    //int[] arr = new int[];
    ArrayList<Integer>[] a = new ArrayList<Integer>[n + 1];
    for(int i = 1; i < n + 1; i++){
      a[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < m; i++){
      int[] edge = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      a[edge[0]].add(edge[1]);
    }

    pw.println(ans[1]);
    pw.close();


  }
  public static void dfs()


}
