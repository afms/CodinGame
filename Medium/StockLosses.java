import java.util.*;

class StockLosses {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int maximumActual = in.nextInt();
		int minimumActual = maximumActual;
		int maximumLoss = 0;
		int lossActual = 0;

		for (int i=1; i<n; i++) {
			int value = in.nextInt();

			while ((value < maximumActual) && (++i < n)) {
				if (value < minimumActual) {
					minimumActual = value;
				}

				value = in.nextInt();
			}

			if (value < minimumActual) {
				minimumActual = value;
			}

			lossActual = minimumActual - maximumActual;
			maximumActual = value;
			minimumActual = maximumActual;

			if (lossActual < maximumLoss) {
				maximumLoss = lossActual;
			}
		}

		System.out.println(maximumLoss);
	}
}