import java.util.*;
import java.io.*;
import java.math.*;

public class DfsPractice{
  public static boolean[] chk;
  public static ArrayList<Integer>[] a;
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    //s[0] = n, s[1] = m, s[2] = starting node
    int n = s[0];
    int m = s[1];
    int start = s[2];
    chk = new boolean[n+1];
    for(int i = 1; i <= n; i++){
      chk[i] = false;
    }
    a = (ArrayList<Integer>[]) new ArrayList<ArrayList>[n+1];
    for(int i = 1; i < n + 1; i++){
      a[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < m; i++){
      int[] edge = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      a[edge[0]].add(edge[1]);
      a[edge[1]].add(edge[0]);
    }
    for(int i = 1; i <= n; i++){
      Collections.sort(a[i]);
    }
    dfs(start);
    for(int i = 1; i <= n; i++){
      chk[i] = false;
    }
    bfs(start);
    pw.close();


  }
  public static void dfs(int x){
    System.out.print(x + " ");
    chk[x] = true;
    for(int i = 0; i < a[x].size(); i++){
      if(chk[a[x].get(i)] == false){
          dfs(a[x].get(i));
      }
    }
  }

  public static void bfs(int x){
    Queue<Integer> q = new LinkedList<>();
    q.add(x);
    chk[x] = true;
    while(!q.isEmpty()){
      int now = q.poll();
      System.out.print(now + " ");
      for(int i = 0; i < a[now].size(); i++){
        if(chk[a[now].get(i)] == false){
          chk[a[now].get(i)] = true;
          q.add(a[now].get(i));
        }
      }
    }
  }


}
