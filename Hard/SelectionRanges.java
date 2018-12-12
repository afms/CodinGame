import java.util.*;

class SelectionRanges {
	private static final int ARRAY_SIZE = 100;
	private static int arrayRealSize;

	public static void main(String[] args) {
		int array[] = new int[ARRAY_SIZE];
		
		readInput(array);

		int newArray[] = new int[arrayRealSize];
		for (int i=0; i<arrayRealSize; i++) {
			newArray[i] = array[i];
		}
		Arrays.sort(newArray);
		calculateRanges(newArray);
		System.out.println();
	}

	private static void readInput(int[] array) {
		Scanner in = new Scanner(System.in);

		String line = in.nextLine();
		int lastIndex = 1;

		for (arrayRealSize=0; lastIndex<line.length()-1 ; arrayRealSize++) {
			int index;

			if ((index = line.indexOf(',', lastIndex + 1)) < 0) {
				index = line.length() - 1;
			}
			array[arrayRealSize] = Integer.parseInt(line.substring(lastIndex, index));
			lastIndex = index + 1;
		}
	}

	private static void calculateRanges(int[] array) {
		int start, end;
		boolean first = true;

		for (int i=0; i<arrayRealSize; i++) {
			int rangeSize = 1;
			start = i;
			end = i + 1;

			if (end == arrayRealSize) {
				System.out.print("," + array[start]);
				break;
			}

			while ((array[end - 1] + 1) == array[end]) {
				end++;
				rangeSize++;

				if (end == arrayRealSize) {
					break;
				}
			}

			end--;
			if (!first) {
				System.out.print(",");
			}

			if (rangeSize > 2) {
				System.out.print(array[start] + "-" + array[end]);
			} else if (rangeSize == 2) {
				System.out.print(array[start] + "," + array[end]);
			} else {
				System.out.print(array[start]);
			}

			first = false;
			i = end;
		}
	}
}