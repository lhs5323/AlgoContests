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
      HashMap<Integer, Integer> map = new HashMap<Integer>();
      for(int num : test){
        if(!map.containsKey(num)){
          map.put(num, 1);
        } else{
          map.put(num, map.get(num) + 1);
        }
      }
      int max = getMaxEntryInMapBasedOnKey(map);
      if(i == 2 && max == 1){
        ans = 1;
      } else if(i == 3 && max == 1){
        ans = 4;
      } else if(i == 4 && max == 1){
        ans = 5;
      } else if(i > 4 && max == 1){
        ans = i + 2;
      } else



    }
  }
  public static <K extends Comparable<K>, V> Map.Entry<K, V>
    getMaxEntryInMapBasedOnKey(Map<K, V> map)
    {
        // To store the result
        Map.Entry<K, V> entryWithMaxKey = null;

        // Iterate in the map to find the required entry
        for (Map.Entry<K, V> currentEntry : map.entrySet()) {

            if (

                // If this is the first entry,
                // set the result as this
                entryWithMaxKey == null

                // If this entry's key is more than the max key
                // Set this entry as the max
                || currentEntry.getKey()
                           .compareTo(entryWithMaxKey.getKey())
                       > 0) {

                entryWithMaxKey = currentEntry;
            }
        }

        // Return the entry with highest key
        return entryWithMaxKey;
    }
}
