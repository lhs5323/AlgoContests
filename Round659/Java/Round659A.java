import java.util.*;
import java.io.*;
import java.math.*;

public class Round659A{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int leftLimit = 97; // letter 'a'
      int rightLimit = 122; // letter 'z'
      String[] answer = new String[n + 1];
      Random random = new Random();
      String beginGeneratedString = random.ints(leftLimit, rightLimit + 1)
        .limit(50)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
      StringBuilder k = new StringBuilder();
      answer[0] = beginGeneratedString;
      String generatedString = beginGeneratedString;
      k.append(beginGeneratedString);
      for(int i = 0; i < arr.length-1; i++){
        /*int targetStringLength = arr[i];
        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();*/
        if(arr[i] == 0){
          answer[i+1] = k.reverse().toString();

        } else{
          generatedString = generatedString.substring(0, arr[i]) + beginGeneratedString;
          answer[i+1] = generatedString;
        }
      }
      beginGeneratedString = random.ints(leftLimit, rightLimit + 1)
        .limit(5)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
      answer[answer.length - 1] = generatedString.substring(0, arr[arr.length-1]) + beginGeneratedString;
      for(int i = 0; i < answer.length; i++){
        pw.println(answer[i]);
      }


    }
    pw.close();
  }
}
