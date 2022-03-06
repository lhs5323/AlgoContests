import java.util.*;
import java.io.*;
import java.math.*;

public class HardWay{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      // pseudo algo: determine the slope of the triangle
      // 1) if the slope of the triangle contains 0 then it's unsafe
      //  condition: only one vertex's y position has to be smaller than those of two vertexes
      // 2) ummmm;;;; 5 wrong...
      // 3)
      float[][] triangle  = new float[3][2];
      float ans = 0;
      for(int i = 0; i < 3; i++){
        int[] test = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        triangle[i][0] = test[0];
        triangle[i][1] = test[1];
      }
      double[] slope = new double[3];
      slope[0] = slope(triangle[0][0], triangle[0][1], triangle[1][0], triangle[1][1]);
      slope[1] = slope(triangle[1][0], triangle[1][1], triangle[2][0], triangle[2][1]);
      slope[2] = slope(triangle[0][0], triangle[0][1], triangle[2][0], triangle[2][1]);
      int count = 0;
      for(int i = 0; i < 3; i++){
        if(slope[i] == 0){
          count++;
        }
      }
      if(count == 1){
        if(triangle[0][1] == triangle[1][1]){
          if(triangle[0][1] > triangle[2][1]){
            if(triangle[0][0] > triangle[1][0]){
              ans = triangle[0][0] - triangle[1][0];
            } else{
              ans = triangle[1][0] - triangle[0][0];
            }
          }
        } else if(triangle[1][1] == triangle[2][1]){
          if(triangle[1][1] > triangle[0][1]){
            if(triangle[1][0] > triangle[2][0]){
              ans = triangle[1][0] - triangle[2][0];
            } else{
              ans = triangle[2][0] - triangle[1][0];
            }
          }
        } else if(triangle[0][1] == triangle[2][1]){
          if(triangle[0][1] > triangle[1][1]){
            if(triangle[0][0] > triangle[2][0]){
              ans = triangle[0][0] - triangle[2][0];
            } else{
              ans = triangle[2][0] - triangle[0][0];
            }
          }
        } else{
          break;
        }
      }
      pw.println(ans);
    }
    pw.close();
  }
  public static double slope(double x1, double y1, double x2, double y2)
    {
      if(x1 == x2){
        return Integer.MAX_VALUE;
      }
      return (y2 - y1) / (x2 - x1);
    }
}
