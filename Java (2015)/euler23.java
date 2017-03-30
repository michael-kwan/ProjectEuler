public class euler23 {
	public static boolean[] isAbundant = new boolean[28123];
	public static void main (String[] args) {
		long sum = 0;
		for (int i = 1;i < isAbundant.length; i++) {
			isAbundant[i] = isAbundant(i);
			if (!canBeSum(i))
				sum += i;
		}
		System.out.println(sum);
	}

	public static boolean isAbundant(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n%i == 0) {
				sum += i;
			}
		}
		return sum > n;
	}

	public static boolean canBeSum(int n)
	{
		for (int i = 1; i < n; i++) {
			if(isAbundant[i] && isAbundant[n-i])
				return true;
		}
		return false;
	}
}