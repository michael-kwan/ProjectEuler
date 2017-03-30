class euler21 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if(isAmicable(i))
				sum += i;
		}
		System.out.println(sum);
	}
	
	public static boolean isAmicable(int n) {
		int m = sumOfDivisors(n);
		return m != n && n == sumOfDivisors(m);
	}
	
	public static int sumOfDivisors(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
}