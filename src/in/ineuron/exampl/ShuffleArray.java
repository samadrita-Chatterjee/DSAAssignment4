package in.ineuron.exampl;


import java.util.Arrays;

public class Solution {
	
	static void shufleArray(int a[], int f, int l)
	{
		if (f > l)
			return;

		// If only 2 element, return
		if (l - f == 1)
			return;

		// finding mid to divide the array
		int mid = (f + l) / 2;

		// using temp for swapping first half of second array
		int temp = mid + 1;

		// mmid is use for swapping second half for first array
		int mmid = (f + mid) / 2;

		// Swapping the element
		for (int i = mmid + 1; i <= mid; i++) {
			
			int temp1 = a[i];
			a[i] = a[temp];
			a[temp++] = temp1;
		}

		
		shufleArray(a, f, mid);
		shufleArray(a, mid + 1, l);
	}

	
	public static void main(String[] args)
	{
		int a[] = { 1, 3, 5, 7, 2, 4, 6, 8 };

		shufleArray(a, 0, a.length - 1);

		System.out.println(Arrays.toString(a));
	}
}

