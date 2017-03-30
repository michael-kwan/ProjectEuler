public class euler38 {
	public static void main(String[] args) {
		
	}

	public static int isPandigital(int n) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; ; ) {
				
			}
		}
	}

	public static boolean checkNumber(String s) {
		if (s.length() != 9) {
			return false;
		}
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c).equals("123456789");
	}
		
}