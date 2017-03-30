public class euler92 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10000000;i++ ) {
			if (getFinal(i) == 89) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static int getFinal(int n) {
		while(true) {
			if (n == 1) return 1;
			if (n == 89) return 89;
			n = nextNumber(n);
		}
	}

	private static int nextNumber(int x) {
		int sum = 0;
		while (x != 0) {
			sum += (x % 10) * (x % 10);
			x /= 10;
		}
		return sum;
	}
}