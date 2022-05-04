import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Map.Entry;

public class Round662B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    int[] p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
    int count = 0;
    for(int i = 0; i < p.length; i++){
      if(!map.containsKey(p[i])){
        map.put(p[i], 1);
      } else{
        map.put(p[i], map.get(p[i]) + 1);
      }
      count++;
    }
    List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
    sortMap(list_entries);
    int oper = Integer.parseInt(br.readLine());
    for(int i = 0; i < oper; i++){
      String[] s = Arrays.stream(br.readLine().split(" ")).toArray(String[]::new);
      String ans = "NO";
      int n_plank = Integer.parseInt(s[1]);
      if(s[0].equals("+")){
        count++;
        if(!map.containsKey(n_plank)){
          map.put(n_plank, 1);
        } else{
          map.put(n_plank, map.get(n_plank) + 1);
        }
        list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        sortMap(list_entries);
        if(count >= 8){
          boolean chkSquare = false;
          int remain = 0;
          for(Entry<Integer, Integer> entry : list_entries) {
                if(!chkSquare){
                  if(entry.getValue() >= 4){
                    chkSquare = true;
                    remain = entry.getValue() - 4;
                  }
                } else{
                  if((entry.getValue() >= 2 && remain >= 2) || entry.getValue() >= 4){
                    ans = "YES";
                    break;
                  }
                }
		      }
        }
      } else if(s[0].equals("-")){
        count--;
        if(!map.containsKey(n_plank)){
          map.put(n_plank, 1);
        } else{
          map.put(n_plank, map.get(n_plank) - 1);
        }
        list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        sortMap(list_entries);
        if(count >= 8){
          boolean chkSquare = false;
          int remain = 0;
          for(Entry<Integer, Integer> entry : list_entries) {
                if(!chkSquare){
                  if(entry.getValue() >= 4){
                    chkSquare = true;
                    remain = entry.getValue() - 4;
                  }
                } else{
                  if((entry.getValue() >= 2 && remain >= 2) || entry.getValue() >= 4){
                    ans = "YES";
                    break;
                  }
                }
		      }
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
  public static void sortMap(List<Entry<Integer, Integer>> list){
    Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
  }
}
