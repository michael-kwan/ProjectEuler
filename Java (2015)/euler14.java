import java.util.*;

class euler14 {
	public static void main(String[] args) {
		long ans = -1;
		long max = -1;
		Hashtable<Long, Long> map = new Hashtable<Long, Long>();
		map.put((long)1,(long)1);
		for (long i = 2; i < 1000000; i++) {
			long n = i;
			long count = 0;
			while (n != 1 || !(map.containsKey(n))) {
				n = n%2 == 0 ? n/2 : 3*n+1;
				count++;
			}
			if (map.containsKey(n)) {
				map.put(i,map.get(n) + count);
			} else {
				map.put(i,count);
			}
		}
		Long maxKey=null;
		Long maxValue = Long.MIN_VALUE; 
		for(Map.Entry<Long, Long> entry : map.entrySet()) {
		     if(entry.getValue() > maxValue) {
		         maxValue = entry.getValue();
		         maxKey = entry.getKey();
		     }
		}
		System.out.println(maxValue + ", " + maxKey);
	}
	
	
}