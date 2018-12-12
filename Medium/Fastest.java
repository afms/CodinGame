import java.util.*;

class Fastest {
	private static int n;

	public static void main(String[] args) {
		int[][] times = readInput();
		int indexOfFastestTime = fastestTime(times);
		printOutput(times, indexOfFastestTime);
	}

	private static int[][] readInput() {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		in.nextLine();
		int[][] times = new int[n][3];

		for (int i=0; i<n; i++) {
			String time = in.nextLine();
			times[i][0] = Integer.parseInt(time.substring(0, 2));
			times[i][1] = Integer.parseInt(time.substring(3, 5));
			times[i][2] = Integer.parseInt(time.substring(6, 8));
		}

		return times;
	}

	private static int fastestTime(int[][] times) {
		int indexOfFastestTime = 0;

		for (int i=1; i<n; i++) {
			if (times[i][0] < times[indexOfFastestTime][0]) {
				indexOfFastestTime = i;
			} else if (times[i][0] == times[indexOfFastestTime][0]) {
				if (times[i][1] < times[indexOfFastestTime][1]) {
					indexOfFastestTime = i;
				} else if (times[i][1]== times[indexOfFastestTime][1]) {
					if (times[i][2] < times[indexOfFastestTime][2]) {
						indexOfFastestTime = i;
					}
				}
			}
		}

		return indexOfFastestTime;
	}

	private static void printOutput(int[][] times, int indexOfFastestTime) {
		System.out.printf("%02d:%02d:%02d\n", times[indexOfFastestTime][0], times[indexOfFastestTime][1], times[indexOfFastestTime][2]);
	}
}

