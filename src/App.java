import java.util.Scanner;

public class App {
	static String one[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ",
			"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ",
			"nineteen " };

	static String ten[] = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ",
			"ninety " };

	static String num2Word(int n, String s) {
		String str = "";
		if (n > 19) {
			str += ten[n / 10] + one[n % 10];
		} else {
			str += one[n];
		}
		if (n != 0) {
			str += s;
		}

		return str;
	}

	static String conv2word(long n) {
		String out = "";
		out += num2Word((int) (n / 10000000), "crore ");
		out += num2Word((int) ((n / 100000) % 100), "lakh ");
		out += num2Word((int) ((n / 1000) % 100), "thousand ");
		out += num2Word((int) ((n / 100) % 10), "hundred ");

		if (n > 100 && n % 100 > 0) {
			out += "and ";
		}

		out += num2Word((int) (n % 100), "");

		return out;
	}

	public static void main(String[] args) {

		System.out.println("Enter value");
		Scanner input = new Scanner(System.in);
		String strVal = input.nextLine();
		strVal = "1111";
		
		if (strVal != null && !strVal.isEmpty()) {
			int i = 0;
			try {
				i = Integer.parseInt(strVal);
				if (i > 0) {
					long num = Long.valueOf(i);
					String output=conv2word(num);
					if(!output.isEmpty()) {
						System.out.printf(output);
					}
				} else if (i==0) {
					System.out.println("Zero");
				} 
				else {
					System.out.println("not a valid number"); // optional check..not needed..
				}
			} catch (NumberFormatException e) {	// Integer check
				System.out.println("not a valid number 123");
			}
			
		}

	}

}
