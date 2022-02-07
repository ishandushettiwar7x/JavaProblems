
public class SpiralMatrix {
	
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int UP = 0;
	
	
	public static void traverse(int[][] matrix, int currentNumber, int input, 
			int row, int column, int dir) {
		if (currentNumber == input * input + 1) {
			return;
			} 
		
		matrix[row][column] = currentNumber;
		currentNumber++;
		
		if (dir % 4 == RIGHT) {
			if (((row == 0) && (column == input-1)) || (matrix[row][column + 1] != 0)) {
				dir++;
				row++;
			} else {
				column++;
			}
		} else if (dir % 4 == DOWN) {
			if (((row == input-1) && (column == input-1)) || (matrix[row + 1][column] != 0)) {
				dir++;
				column--;
			} else {
				row++;
			}
		} else if (dir % 4 == LEFT) {
			if (((row == input-1) && (column == 0)) || (matrix[row][column - 1] != 0)) {
				dir++;
				row--;
			} else {
				column--;
			}
		} else if (dir % 4 == UP) {
			if (matrix[row - 1][column] != 0) {
				dir++;
				column++;
			} else {
				row--;
			}
			
		}
		traverse(matrix,currentNumber,input,row,column,dir);
		
	}
	
	public static void spiral(int input) {
		int[][] matrix = new int[input][input];
		int currentNumber = 1, row = 0,column = 0,dir = RIGHT;
		// Let dir be direction variable where its modulus of 4 will be calculated, where 1 means right,2 means down,3 means left and 0 means up 
		traverse(matrix,currentNumber,input,row,column,dir);
		for (int i = 0;i < input;i++) {
			for (int j = 0; j < input; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" " + matrix[i][j] + " ");
				}else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spiral(4);

	}

}
