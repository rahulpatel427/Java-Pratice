import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyProgram2 {
  public static void main(String[] args) {
    int choice = 0;
    Scanner input = new Scanner(System.in);

    int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
    System.out.println("Enter the Index of array : ");
    try {
      choice = input.nextInt();
      System.out.printf("arr [%d] = %d%n", choice, arr[choice]);
      input.close();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error : Index is invalid");
    } catch (InputMismatchException e) {
      System.out.println();
    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());
    }
  }
}
