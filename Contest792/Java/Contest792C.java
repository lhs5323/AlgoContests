import java.util.*;
import java.io.*;
import java.math.*;

public class Contest792C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int n = a[0];
      int m = a[1];
      int[][] data = new int[n+1][m+1];
      int[][] sorted_data = new int[n+1][m+1];

      for(int i = 0; i < n; i++){
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copiedArr);
        for(int j = 0; j < m; j++){
          data[i][j] = arr[j];
          sorted_data[i][j] = copiedArr[j];
        }

      }
      int index_one = -1, index_two = -1;
      int left = 0, right = data[0].length - 1;
      for(int i = 0; i < n; i++){
        index_one = -1;
        index_two = -1;
        left = 0;
        right = data[0].length - 1;
        while(left <= right){
          if(data[i][left] != sorted_data[i][left]){
            index_one = left;
          }
          if(data[i][right] != sorted_data[i][right]){
            index_two = right;
          }
          if(index_one == -1){
            left++;
          }
          if(index_two == -1){
            right--;
          }
          if(index_one != -1 && index_two != -1){
            break;
          }
        }
        if(chkVertically(index_one, index_two, m, data, sorted_data)){
          break;
        }
      }
      if(index_one == -1 || index_two == -1){
        pw.println(-1);
      } else{
        pw.println((index_one + 1) + " " + (index_two + 1));
      }


    }
  }
  public static boolean chkVertically(int a, int b, int size, int[][] x, int[][] y){
    boolean flag = false;
    for(int i = 1; i < size; i++){
      if(x[i][a] == y[i][b] && x[i][b] == y[i][a]){
        flag = true;
        break;
      }
    }
    return flag;
  }
}
