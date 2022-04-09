import java.util.*;
import java.io.*;
import java.math.*;

public class Cloning{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int i = Integer.parseInt(br.readLine());
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int ans = 0;
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(int num : test){
        if(!map.containsKey(num)){
          map.put(num, 1);
        } else{
          map.put(num, map.get(num) + 1);
        }
      }

				int max = Collections.max(map.values());
				int cnt = i - max;
				while(max < i) {
					ans++;
					max <<= 1;
				}
        pw.println(cnt + ans);



    }
    pw.close();
  }
}
