import java.util.*;
import java.io.*;
import java.math.*;

public class Equidistant{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      StringBuilder s_new = new StringBuilder();
      HashMap<Character, Integer> map = new HashMap<>();
      for(char c : s.toCharArray()){
        if(!map.containsKey(c)){
          map.put(c, 1);
        } else{
          map.put(c, 2);
        }
      }
      map = sortByValue(map);
      for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if(en.getValue() == 2){
              s_new.append(en.getKey());
              s_new.append(en.getKey());
            } else{
              s_new.append(en.getKey());
            }
      }
      pw.println(s_new);
    }
    pw.close();
  }
  public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
