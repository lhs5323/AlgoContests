import java.util.*;
import java.io.*;
import java.math.*;

public class AntiFibonacci{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      int count = 0;
      for(int i = 0; i < n; i++){
        arr[i] = i + 1;
      }
      List<List<Integer>> result = new AntiFibonacci().permute(arr, n);
        for(List<Integer> res : result){
          if(count == n){
            break;
          }
          boolean chk = false;
          for(int i = 2; i < res.size(); i++){
            if(res.get(i-2) + res.get(i-1) == res.get(i)){
              chk = true;
            }
          }
          if(chk != true){
            int[] fin = new int[n];
            for(int j = 0; j < res.size(); j++){
              fin[j] = res.get(j);
              pw.print(res.get(j) + " ");
            }
            pw.println();
            count++;
          }
        }

    }
    pw.close();
  }
  public List<List<Integer>> permute(int[] nums, int n) {
    List<List<Integer>> result = new ArrayList<>();
    int size = n;
    Permutation(0, nums, result, size);
    return result;
  }
  private void Permutation(int i, int[] nums, List<List<Integer>> result, int s) {
    if (result.size() == s){
      return;
    }
    if (i == nums.length - 1) {
      List<Integer> list = new ArrayList<>();
      for (int n : nums) list.add(n);
      result.add(list);
    } else {
      for (int j = i, l = nums.length; j < l; j++) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        Permutation(i + 1, nums, result, s);
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
  }
}
