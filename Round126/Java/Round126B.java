import java.util.*;
import java.io.*;
import java.math.*;

public class Round126B{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] pow_two = new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768};
    for(int i = 0; i < t; i++){
      int count = 0, num = test[i], comp = 15, divTwo = 0;
      //Exception when num = 0
      //check if the num == prime
      if(num % 2 == 1){
        num++;
        count++;
      } else{ //Exception when num == 0
        if(num == 0){
          count = 0;
        }
      }

      //factorization
      while(num % 2 == 0 && test[i] != 0){
        num = num / 2;
        divTwo++;
      }
      int min = Integer.MAX_VALUE;
      for(int j = 0; j < pow_two.length; j++){
        min = Math.min(min, Math.abs(pow_two[j] - test[i]));
      }
      //fix count
      int count_two = 0, second_num = 32768/(test[i] + min);
      while(second_num != 1){
        second_num = second_num / 2;
        count_two++;
      }

      if(comp - divTwo + count > min + count_two){
        count = min + count_two;
      } else{
        if(test[i] == 0){
          count = 0;
        } else{
          count = count + (comp - divTwo);
        }
      }

      if(i == t - 1){
        pw.print(count);
      } else{
        pw.print(count + " ");
      }
    }
    pw.close();
  }
  public static boolean isPrime(int num){
    boolean isPrime = true;
    if(num <= 1){
      isPrime = false;
    } else{
      for(int i = 2; i <= num / 2; i++){
        if(num % i == 0){
          isPrime = false;
          break;
        }
      }
    }
    return isPrime;
  }
}
