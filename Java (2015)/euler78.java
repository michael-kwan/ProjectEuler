public class euler78 {
	public static int count = 0;

	public static void main(String[] args) {
		partition(9);
		System.out.println(count);
	}

	public static void partition(int n) {
		partition(n,n,"");
	}

	public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            count++;
            return;
        }
  
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }
		
}