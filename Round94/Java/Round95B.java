import java.util.*;
import java.io.*;
import java.math.*;

public class Round94B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      long[] capacity = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] shop = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      long[] weight = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
      //capacity[0] = my capacity, capacity[1] = followers
      //shop[0] = number of sword, shop[1] = number of axes
      //weight[0] = sword weight, weight[1] = axes weight
      //algo: three operation to compare
      //1) choose only sword
      //2) choose only axeschoose
      //3) choose both sword + axes

      int max = 0, max_one = 0, max_two = 0, max_three = 0;
      //both swords and axes
      int sword_axes = weight[0] + weight[1];
      int cur_sword = shop[0];
      int cur_axes = shop[1];
      int cur_mCapacity = capacity[0];
      int cur_fCapacity = capacity[1];
      int bGCapcity = cur_mCapacity < cur_fCapacity ? cur_fCapacity : cur_mCapacity;
      if(sword_axes <= bGCapcity){
        cur_sword = cur_sword - (bGCapcity / sword_axes);
        cur_axes = cur_axes - (bGCapcity / sword_axes);
        if(bGCapcity == cur_mCapacity){
          cur_mCapacity = cur_mCapacity - (sword_axes * (capacity[0] / sword_axes));
        } else{
          cur_fCapacity = cur_fCapacity - (sword_axes * (capacity[0] / sword_axes));
        }
        max_one = max_one + (bG / sword_axes);
        if(weigth[0] <= weight[1] && cur_sword > 0 && ){
            max_one++;
            cur_mCapacity -= weight[0];
            cur_sword--;
          } else if(weight[1] > weight[0] && cur_axes > 0){
            max_one++;
            cur_mCapacity -= weight[1];
            cur_axes--;
          }
      }
    }
  }
}
