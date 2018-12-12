import java.util.*;

class Chuck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		
		message = convertToBinary(message);
		message = convertToZeros(message);

		System.out.println(message);
	}

    private static String convertToBinary(String str) {
		String messageConverted = "";

		for (int i=0; i<str.length(); i++) {
			String aux;
			int character = (int) str.charAt(i);
			aux = Integer.toBinaryString(character);
			aux = ("0000000" + aux).substring(aux.length());
			messageConverted += aux;
		}

		return messageConverted;
	}

	private static String convertToZeros(String str) {
		String answer = "";
		int index = 0;
		int lastIndex = 0;
		boolean firstTime = true;

		while (index < str.length()) {
			String s;

			if (str.charAt(index) == '0') {
				if ((lastIndex = str.indexOf('1', index)) != -1) { 
					s = str.substring(index, lastIndex);
					index = str.indexOf('1', index);
				} else {
					s = str.substring(index, str.length());
					index = str.length();
				}
			} 
			else {
				if ((lastIndex = str.indexOf('0', index)) != -1) {
					s = str.substring(index, lastIndex);
					index = str.indexOf('0', index);
				} else {
					s = str.substring(index, str.length());
					index = str.length();	
				}
			}

			if (!firstTime) {
				answer += " ";
			}
			if (s.contains("1")) {
				answer += "0 ";
			} else if (s.contains("0")) {
				answer += "00 ";
			}
			
			for (int i=0; i<s.length(); i++) {
				answer += "0";
			}

			firstTime = false;
		}

		return answer;
	}
}