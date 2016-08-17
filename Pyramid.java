import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of lines to print the star for pyramid:");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("  ");
		}
		s.close();
	}
}
