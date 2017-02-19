
public class Ascii {

	public static void main(String[] args) {
		System.out.println("ascii code from 65 to 90");
		for (int i = 65; i <= 90; i++) {
			int ascii = i;
			char c = (char) ascii;
			System.out.println(i + "-" + c);
		}

	}

}
