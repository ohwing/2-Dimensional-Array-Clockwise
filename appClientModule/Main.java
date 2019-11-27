class Main {

	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
		};
		
		int r = 4;
		
		int[][] answer = new int[matrix.length][matrix.length];
		int[][] temp = new int[matrix.length][matrix.length];
		for (int c = 0; c < r; c++) {
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix.length; col++) {
					int a = matrix.length - 1;
					temp[row][a - col] = matrix[col][row];
					answer = temp;
				}
			}
			matrix = arr_copy(temp);
		}
		arr_print(answer);
		
	}

	public static int[][] arr_copy(int[][] arr) {
		int[][] temp = new int[arr.length][arr.length];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				temp[row][col] = arr[row][col];
			}
		}
		return temp;
	}

	public static void arr_print(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}

//[실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
/*
 * if (r >= 1) { for (row = 0; row < matrix.length; row++) { for (col = 0; col <
 * matrix.length; col++) { int a = matrix.length - 1; temp[row][a - col] =
 * matrix[col][row]; answer = arr_copy(temp); } } } if (r >= 2) { for (row = 0;
 * row < matrix.length; row++) { for (col = 0; col < matrix.length; col++) { int
 * a = matrix.length - 1; matrix[row][a - col] = temp[col][row]; answer =
 * matrix; } } } if (r >= 3) { for (row = 0; row < matrix.length; row++) { for
 * (col = 0; col < matrix.length; col++) { int a = matrix.length - 1;
 * temp[row][a - col] = matrix[col][row]; answer = temp; } } } if (r >= 4) { for
 * (row = 0; row < matrix.length; row++) { for (col = 0; col < matrix.length;
 * col++) { int a = matrix.length - 1; matrix[row][a - col] = temp[col][row];
 * answer = matrix; } } }
 */