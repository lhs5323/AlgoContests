import java.util.*;
import java.io.*;
import java.math.*;

public class Contest782B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    //n length, k move = all bits flipped except selected
    while(t-- > 0){
      // test[0] = bit size, test[1] = k moves
      // if the movement is even fin
      int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //int bit = Integer.parseInt(br.readLine());
      String bitString = br.readLine();
      int bit = Integer.parseInt(bitString, 2);
      //int cut = bitString.length() - test[0];
      //pw.println("Bit BinaryString len: " + (bitString.length() - test[0]));
      //String bitBinary = bitString.substring(cut);
      int[] arr = new int[test[0]];
      int k = test[1];
      pw.println("Bit Integer: " + bit);
      pw.println("Bit BinaryString: " + bitString);
      pw.println("Bit BinaryString len: " + bitString.length());
      //pw.println("Bit BinaryString fixed: " + bitBinary);
      while(k > 0){
        int index = 0;
        pw.println("Bit BinaryString after toggle: " + bitString);
        if(k == 1 && bitString.charAt(0) == '1'){
          bitString = toBinaryExcept(bitString, 0);
          break;
        } else if(k == 1 && bitString.charAt(0) == '0'){
          bitString = toBinaryExcept(bitString, bitString.length() - 1);
          break;
        }
        if(k % 2 == 0){
          for(char c : bitString.toCharArray()){
            if(c == '0' && index != 0){
              break;
            }
            index++;
          }
          arr[index] += 1;
          bitString = toBinaryExcept(bitString, index);
        } else{
          for(char c : bitString.toCharArray()){
            if(c == '1' && index != 0){
              break;
            }
            index++;
          }
          arr[index] += 1;
          bitString = toBinaryExcept(bitString, index);
        }

        k--;
      }
      pw.println(bitString);
      for(int i = 0; i < arr.length; i++){
        pw.print(arr[i] + " ");
      }

    }
    pw.close();
  }
  public static String toBinaryExcept(String s, int pos){
    int ind = 0;
    for(char c : s.toCharArray()){
      if(c == '0' && pos != ind){
        c = '1';
      } else if (c == '1' && pos != ind){
        c = '0';
      }
      ind++;
    }/*
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '0' && pos != i){
        s.charAt(i) = '1';
      } else if (s.charAt(i) == '1' && pos != i){
        s.charAt(i) = '0';
      }
    }*/
    return s;
  }
}
