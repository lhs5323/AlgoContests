import java.util.*;
import java.io.*;
import java.math.*;

public class Round10A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
/*
Psuedo Algo:
1) form ArrayList
2) every i in for loop check if it contains i + (i+1)th element


      ArrayList<Long> arr = new ArrayList<>();
      for(int i = 0; i < n; i++){
        arr.add(a[i]);
      }

      int index = 0; long sum = 0;
      while(index + 1 < arr.size()){
        long x = arr.get(index);
        long y = arr.get(index+1);
        if(x != y){
          sum = x + y;
          arr.remove(index);
          arr.remove(index);
          arr.add(index, sum);
          index = 0;
        } else{
          index++;
        }

      }*/
      long temp = a[0];
      int ans = 1;
      for(int i = 1; i < n; i++){
        if(temp == a[i]){
          ans++;
        }
      }
      if(ans == a.length){
        pw.println(ans);
      } else{
        ans = 1;
        pw.println(ans);
      }
    }
    pw.close();
  }
}
