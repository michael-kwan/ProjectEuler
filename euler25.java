package java.math;

import java.util.*;
import java.*;

public class euler25 {
	public static void main (String[] args) {
		BigInteger a = BigInteger.TEN.pow(1001);
		BigInteger b = BigInteger.TEN.pow(1000);
		BigInteger curr = BigInteger.ONE;
		BigInteger prev = BigInteger.ZERO;
		int index = 2;
		while(curr.compareTo(a) < 0 && curr.compareTo(b) < 0) {
			BigInteger temp = curr;
			curr = curr.add(prev);
			prev = temp;
			index++;
		}
		System.out.println(index);
	}
}