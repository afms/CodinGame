import java.util.*;

class Ascii {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		int height = in.nextInt();
		in.nextLine();
		String text = in.nextLine();
		String[] asciiModel = new String[height];

		for (int i=0; i<height; i++) {
			asciiModel[i] = in.nextLine();
		}

		text = text.toUpperCase();
		convertToAsciiArt(width, height, text, asciiModel);
	}

	private static void convertToAsciiArt(int w, int h, String t, String[] model) {
		char c;
		String[] answer = new String[h];

		for (int i=0; i<h; i++) {
			answer[i] = "";
		}

		for (int i=0; i<t.length(); i++) {
			c = t.charAt(i);

			int charPosition = c - 'A';
			for (int k=0; k<h; k++) {
				if ((charPosition < 0) || (charPosition > 25)) {
					answer[k] += model[k].substring(26 * w, 26 * w + w);
				} else {
					answer[k] += model[k].substring(charPosition * w, charPosition * w + w);
				}
			}
		}
		
		printAnswer(answer, h);
	}

	private static void printAnswer(String[] answer, int h) {
		for (int i=0; i<h; i++) {
			System.out.println(answer[i]);
		}
	}
}