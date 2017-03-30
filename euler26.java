import java.util.*;

public class euler26 {
	public static void main (String[] args) {
		int length = -1;
		int number = -1;
		for (int i = 1; i < 1000; i++) {
			if (findLength(i) > length) {
				length = Math.max(length, findLength(i));
				number = i;
			}
		}
		System.out.println(number);
	}

	public static int findLength(int n) {
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		int numb = 1;
		int counter = 0;
		while(!map.containsKey(numb)) {
			map.put(numb, counter);
			numb = numb*10 % n;
			counter++;
		}
		return counter - map.get(numb);
	}
}