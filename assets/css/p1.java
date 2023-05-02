//count number of even or odd number from an array of n numbers
import java.util.Scanner;
public class p2 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of elements in the array: ");
 int n = scanner.nextInt();
 int[] arr = new int[n];
 int sum = 0;
 System.out.println("Enter the elements of the array:");
 for (int i = 0; i < n; i++) {
 arr[i] = scanner.nextInt();
 if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
 sum += arr[i];
 }
 }
 System.out.println("Sum of elements in the array divisible by either 3 or 5: " + sum);
 scanner.close();
 }
}
