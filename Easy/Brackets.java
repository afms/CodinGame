import java.util.*;

class Brackets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(expressionProcessment(input.nextLine()));
	}

	private static boolean expressionProcessment(String expression) {
		Stack<Character> brackets = new Stack<Character>();

		for (int i=0; i<expression.length(); i++) {
			char bracket = expression.charAt(i);

			if ((bracket == '(') || (bracket == '[') || (bracket == '{')) {
				brackets.push(bracket);
			} else if ((bracket == ')') || (bracket == ']') || (bracket == '}')) {
				if (brackets.isEmpty()) { return false; }
				char bracketOnStack = brackets.pop();

				if (((bracket == ')') && (bracketOnStack != '(')) || 
					((bracket == ']') && (bracketOnStack != '[')) ||
					((bracket == '}') && (bracketOnStack != '{'))) {
				return false;
			}
		}
	}
	if (brackets.empty()) { return true; } 
	else { return false; }
	}
}