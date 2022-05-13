import java.util.*;
import java.io.*;
import java.math.*;

public class Round128C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    long t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      //int left = 0, right = s.length() - 1;
      int count_zero = 0, count_one = 0;
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i = 0; i < s.length(); i++){
        if(s.charAt(0) == '0'){
          count_zero++;
        } else{
          count_one++;
          arr.add(i);
        }
      }
      int left = 0, right = arr.size() - 1;
      int max = count_zero;
      while(left <= right){

        if(max > Math.max(count_one - (right - left) , count_zero - ((arr.get(right) - arr.get(right - 1)) - 1))){
          max = Math.max(count_one - (right - left) , count_zero - ((arr.get(right) - arr.get(right - 1)) - 1));
        }
        if(max > Math.max(count_one - (right - left) , count_zero - ((arr.get(left + 1) - arr.get(left)) - 1))){
          max = Math.max(count_one - (right - left) , count_zero - ((arr.get(left + 1) - arr.get(left)) - 1));
        }
        right--;
        left++;
      }
      pw.println(max);

    }
    pw.close();
  }
}
