import java.util.*;
import java.io.*;
import java.math.*;

public class ElementaryParticles{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //Algo: Construct harmo funtion
      //Using: Head and Tail algo
      ArrayList<Integer> head = new ArrayList<>();
      ArrayList<Integer> tail = new ArrayList<>();
      int res = 0;
      for(int i = 0, j = test.length -1; i < test.length && j >= 0; i++, j--){
        head.add(test[i]);
        tail.add(test[j]);

        if(harmonious(head.stream().mapToInt(a -> a).toArray(), tail.stream().mapToInt(a -> a).toArray()) && res < head.size()){
          res = head.size();
          pw.println("res: " + res);
        }
      }
      pw.println(res);
    }
    pw.close();
  }
  public static boolean harmonious(int[] x, int[] y){
    boolean chk = false;
    Collections.reverse(Arrays.asList(y));
    for(int i = 0; i < x.length; i++){
      if(x[i] == y[i]){
        pw.println("x[i] " + x[i]);
        pw.println("y[i] " + y[i]);
        chk = true;
      }
    }
    return chk;
  }
}
