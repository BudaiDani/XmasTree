package mypackage;

public class ChristmasTreeString {

	public static void main(String[] args) {
		makeTriangle("Hello World!");
	}

	public static void makeTriangle(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int k = 0; k < input.length() - i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				char c;
				c = input.charAt(i);
				System.out.print(c + " ");
			}
			System.out.println(" ");
		}
	}
}
