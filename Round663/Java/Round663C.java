import java.util.*;
import java.io.*;
import java.math.*;

public class Round663C{
  public static PrintWriter pw = new PrintWriter(System.out);
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
      int n = Integer.parseInt(br.readLine());
      BigInteger number = BigInteger.valueOf(n);
      BigInteger two = BigInteger.valueOf(2);
      BigInteger eight = BigInteger.valueOf(8);
      BigInteger four = BigInteger.valueOf(4);
      BigInteger ten = BigInteger.TEN;
      BigInteger modulo = ten.pow(9).add(BigInteger.valueOf(7));
      BigInteger num = two.pow(n-1);
      BigInteger ans = factorial(number);
      BigInteger ans1 = ans.subtract(num);

      //trying ramanujan's formula approcimatiion of factorial
      //first term
      BigInteger first = number.pow(3);
      BigInteger first_term = eight.multiply(first);

      //second term
      BigInteger second = number.pow(2);
      BigInteger second_term = four.multiply(second);

      //first - second - third - fourth
      BigInteger equation = first.add(second);
      pw.println("equation: " + equation);
      BigInteger equation_two = number.add(BigInteger.valueOf(1/30));
      pw.println("equation_two: " + equation_two);
      BigInteger total = equation.add(equation_two);
      pw.println("total: " + total);
      BigInteger ans2 = total.pow(1/6);
      pw.println("ans2: " + ans2);
      BigInteger pi = BigDecimal.valueOf(Math.sqrt(n)).toBigIntegerExact();
      double euler = n / 2.718;
      BigInteger euler_one = BigDecimal.valueOf(euler).toBigInteger();
      BigInteger euler_two = euler_one.pow(n);
      BigInteger ans3 = pi.multiply(euler_two);
      ans2 = ans2.multiply(ans3);
      pw.println(ans1.mod(modulo));
      pw.println(ans2.mod(modulo));


    pw.close();
  }
  public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.ONE;

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }
}
