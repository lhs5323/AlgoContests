import java.util.*;
import java.io.*;
import java.math.*;

public class EvenString{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String s = br.readLine();
      char c = s.charAt(0);
      int forwardque = 0, forwardstck = 0, index = 1, backwardque = 0, backwardstck = 0;

      Queue<Character> charQue =  new LinkedList<>();
      Stack<Character> charStck = new Stack<>();
      charQue.add(c);
      charStck.push(c);
      while(index < s.length()){
        if(charQue.isEmpty()){
          charQue.add(s.charAt(index));
        } else{
          if(charQue.peek() != s.charAt(index)){
            forwardque++;
          } else{
            charQue.poll();
          }
        }
        if(charStck.isEmpty()){
          charStck.push(s.charAt(index));
        } else{
          if(charStck.peek() != s.charAt(index)){
            charStck.push(s.charAt(index));
          } else{
            charStck.pop();
          }
        }
        index++;
      }
      if(!charQue.isEmpty()){
        forwardque++;
      }
      forwardstck = charStck.size();
      int forwardmin = Math.min(forwardque, forwardstck);
      index = s.length() - 2;
      Queue<Character> charBackQue =  new LinkedList<>();
      Stack<Character> charBackStck =  new Stack<>();
      charBackQue.add(s.charAt(index+1));
      charBackStck.push(s.charAt(index+1));
      while(index >= 0){
        if(charBackQue.isEmpty()){
          charBackQue.add(s.charAt(index));
        } else{
          if(charBackQue.peek() != s.charAt(index)){
            backwardque++;
          } else{
            charBackQue.poll();
          }
        }
        if(charBackStck.isEmpty()){
          charBackStck.push(s.charAt(index));
        } else{
          if(charBackStck.peek() != s.charAt(index)){
            charBackStck.push(s.charAt(index));
          } else{
            charBackStck.pop();
          }
        }
        index--;
      }
      if(!charBackQue.isEmpty()){
        backwardque++;
      }
      backwardstck = charBackStck.size();
      int backwardmin = Math.min(backwardque, backwardstck);
      pw.println(Math.min(forwardmin, backwardmin));
    }
    pw.close();
  }
}
