import java.util.Scanner;

public class TryCatchFinallyProgram {

  public static void main(String[] args) {
    int num, deno;
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter the numerator: ");
      num = input.nextInt();
      System.out.println("Enter the denominator: ");
      deno = input.nextInt();
      System.out.println("The result is :" + num / deno);
      input.close();
    } catch (Exception e) {
      throw new ArithmeticException("Cannot divide by zero");
    } finally {
      System.out.println("This is the finally block and The ---Code is Ended---");
    }
  }
}