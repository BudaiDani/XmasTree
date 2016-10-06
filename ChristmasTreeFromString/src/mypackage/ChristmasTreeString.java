package mypackage;

public class ChristmasTreeString {

	public static void main(String[] args) {
		makeTriangle("Hello");
	}

	public static void makeTriangle(String input) {
		for (int i = 0; i < input.length(); i++) {

			for (int j = 0; j < input.length() - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= 2 * i; k++) {
				char c;
				c = input.charAt(i);
				System.out.print(c);
			}
			System.out.println(" ");
		}
	}
}
