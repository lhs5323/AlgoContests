import java.util.*;
import java.io.*;
import java.math.*;

public class Contest788A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int index = n / 2;
      int pos_neg = 0, neg_pos = 0;
      //chk if it is sorted
      int[] copied = Arrays.copyOf(arr, n);
      boolean sorted = true;
      for(int i = 1; i < n; i++){
        if(arr[i-1] > arr[i]){
          sorted = false;
          break;
        }
      }
      int left = 0, right = n - 1;
      while(right - left > 1){
        arr[left] = Math.min(arr[left], ~(arr[left] - 1));
        if(copied[left] != arr[left] && arr[left] < 0){
          pos_neg++;
        } else if(copied[left] != arr[left] && arr[left] > 0){
          neg_pos++;
        }
        left++;

        arr[right] = Math.max(arr[right], ~(arr[right] - 1));
        if(copied[right] != arr[right] && arr[right] < 0){
          pos_neg++;
        } else if(copied[right] != arr[right] && arr[right] > 0){
          neg_pos++;
        }
        right--;
      }
      if(arr[left+1] > arr[right-1]){
        if(pos_neg - neg_pos > 0 ){
          if(arr[left + 1] < 0){
            arr[left+1] = ~(arr[left+1] -1 );
            neg_pos++;
          } else if(arr[right-1] < 0){

          }
        }
      }
      //chk if it sorted
      boolean flag = true;
      for(int i = 1; i < n; i++){
        if(arr[i-1] > arr[i]){
          flag = false;
          break;
        }
      }
      pw.println(pos_neg - neg_pos);
      if(sorted == true || (flag == true && pos_neg - neg_pos == 0)){
        pw.println("YES");
      } else{
        pw.println("NO");
      }
    }
    pw.close();
  }
}
