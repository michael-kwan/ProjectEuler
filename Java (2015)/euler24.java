public class euler24{
	private static int[] arr = {0,1,2,3,4,5,6,7,8,9};

	public static void main (String[] args) {
		for (int i = 0; i < 999999 ; i++ ) {
			nextPermutation(arr);
		}
		System.out.println(arr[0]+""+arr[1]+""+arr[2]+""+arr[3]+""+arr[4]+""+arr[5]+""+arr[6]+""+arr[7]+""+arr[8]+""+arr[9]);
	}

	public static void nextPermutation(int[] num) {
        int i = 0;
        int j = 0;
        //From right to left, find the first one that is not in ascending order.
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] >= num[i + 1])
                continue;
            //From right to left, find the first one that is larger than num[i]
            for (j = num.length - 1; j > i; j--) {
                if (num[j] > num[i])
                    break;
            }
            break;
        }
        //If we find i, swap the number on position i and j
        if (i >= 0) {
            int tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
        }
        //Reverse the numbers which are on the right of i
        int start = i + 1;
        int end = num.length - 1;
        while (start < end) {
            int tmp = num[start];
            num[start] = num[end];
            num[end] = tmp;
            start++;
            end--;
        }
    }
}
