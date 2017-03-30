import java.util.*;

public class euler32 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isPandigital(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPandigital(int n) {
		for (int i = 1; i < Math.floor(Math.sqrt(n)); i++) {
			if (n%i == 0 && checkDivisors("" + n/i + n + i)) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkDivisors(String s) {
		if (s.length() != 9) {
			return false;
		}
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c).equals("123456789");
	}
		
		
}