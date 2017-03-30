public class euler27 {
	public static void main (String[] args) {
		int maxNum = 0;
		int maxA = 0;
		int maxB = 0;
		for (int i = -1000; i <= 1000; i++) {
			for (int j = -1000; j <= 1000; j++) {
				if (maxNum < getConsecutive(i,j)) {
					maxNum = getConsecutive(i,j);
					maxA = i;
					maxB = j;
				}
			}
		}
		System.out.println(maxB*maxA);
	}

	public static int getConsecutive(int a, int b) {
		for (int i= 1; ; i++) {
			if((i*i + a*i + b) < 0 || !isPrime(i*i + a*i + b)) {
				return i;
			}
		}
	}

	public static boolean isPrime(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Negative number");
		if (x == 0 || x == 1)
			return false;
		else if (x == 2)
			return true;
		else {
			if (x % 2 == 0)
				return false;
			for (int i = 3, end = Math.floor(Math.sqrt(x)); i <= end; i += 2) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}
}