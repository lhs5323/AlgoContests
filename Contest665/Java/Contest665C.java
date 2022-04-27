import java.util.*;
import java.io.*;
import java.math.*;

public class Contest665C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] sorted = a;
      pw.println(sorted[0]);
      Arrays.sort(sorted);
        for(int i = 0; i < a.length; i++){
          for(int j = 0; j < sorted.length; j++){
            if(a[i] == sorted[j] && i != j && GCD(a[i], a[j]) == sorted[0]){
              int temp = a[i];
              a[i] = a[j];
              a[j] = temp;
              i = 0;
            }
          }
          if(i == a.length - 1){
            break;
          }
        }
        boolean check = Arrays.equals(a, sorted);
        if(check){
          pw.println("YES");
        } else{
          pw.println("NO");
        }



    }
    pw.close();
  }
  private static int GCD(int a,int b) { if (b==0) { return a; } return GCD(b,a%b); }

}
