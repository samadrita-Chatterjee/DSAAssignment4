package in.ineuron.exampl;



class Transpose {
	static final int N = 4;

	
	static void transpose(int A[][])
	{
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
	}

	
	public static void main(String[] args)
	{
		int A[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };

		transpose(A);

		System.out.print("Modified matrix is \n");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(A[i][j] + " ");
			System.out.print("\n");
		}
	}
}

