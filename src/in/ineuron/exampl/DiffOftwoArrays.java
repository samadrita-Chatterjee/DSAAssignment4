package in.ineuron.exampl;

import java.util.*;

public class DiffOftwoArrays {
static void findSwapValues(int a[], int m, int b[],
							int n)
{
	HashSet<Integer> x = new HashSet<>();
	HashSet<Integer> y = new HashSet<>();
	
	

	int s1, s2;
	int i;
	s1 = 0;
	for (i = 0; i < m; i++) {
	
	s1 += a[i];
	x.add(a[i]);
	}

	s2 = 0;
	for (i = 0; i < n; i++) {
	s2 += b[i];
	y.add(b[i]);
	}

	if ((s1 - s2) % 2 != 0)
	
	{
	System.out.println("No such values exist.");
	return;
	}

	for (Integer p : x) {
	int q = ((s2 - s1) + 2 * p) / 2;
	if (y.contains(q)) {
		System.out.println(p + " " + q);
		return;
	}
	}
	System.out.println("No such values exist.");
}


public static void main(String[] args)
{
	int a[] = { 4, 1, 2, 1, 1, 2 };
	int b[] = { 1, 6, 3, 3 };
	int m = a.length;
	int n = b.length;
	findSwapValues(a, m, b, n);
}
}



