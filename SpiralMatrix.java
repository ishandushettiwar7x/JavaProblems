
public class SpiralMatrix {
	
	public static void traverse(int[][] matrix,int iteration,int n,int row,
			int coloumn,int dir) {
		if (iteration == n*n+1) {
			return;
			}else if ((row == 0)&&(coloumn == n-1) || (row == n-1)&&(coloumn == n-1) ||
				((row == n-1)&&(coloumn == 0))){
			dir++;
		}
		if (dir%4 == 1) {
			matrix[row][coloumn] = iteration;
			if (coloumn == n-1) {
				traverse(matrix,iteration+1,n,row+1,coloumn,dir);
			}else if(matrix[row][coloumn+1] != 0) {
				dir++;
				traverse(matrix,iteration+1,n,row+1,coloumn,dir);
			}else {
				traverse(matrix,iteration+1,n,row,coloumn+1,dir);
			}
		}else if (dir%4 == 2) {
			matrix[row][coloumn] = iteration;
			if (row == n-1) {
				traverse(matrix,iteration+1,n,row,coloumn-1,dir);
			}else if(matrix[row+1][coloumn] != 0) {
				dir++;
				traverse(matrix,iteration+1,n,row,coloumn-1,dir);
			}else {
				traverse(matrix,iteration+1,n,row+1,coloumn,dir);
			}
		}else if (dir%4 == 3) {
			matrix[row][coloumn] = iteration;
			if (coloumn == 0) {
				traverse(matrix,iteration+1,n,row-1,coloumn,dir);
			}else if(matrix[row][coloumn-1] != 0) {
				dir++;
				traverse(matrix,iteration+1,n,row-1,coloumn,dir);
			}else {
				traverse(matrix,iteration+1,n,row,coloumn-1,dir);
			}
		}else if (dir%4 == 0) {
			matrix[row][coloumn] = iteration;
			if(matrix[row-1][coloumn] != 0) {
				dir++;
				traverse(matrix,iteration+1,n,row,coloumn+1,dir);
			}else {
				traverse(matrix,iteration+1,n,row-1,coloumn,dir);
			}
			
		}
		
	}
	
	public static void Spiral(int n) {
		int[][] matrix = new int[n][n];
		int iteration = 1, row = 0,coloumn = 0,dir = 1;
		// Let dir be direction variable where its modulus of 4 will be calculated, where 1 means right,2 means down,3 means left and 0 means up 
		traverse(matrix,iteration,n,row,coloumn,dir);
		for (int i = 0;i < n;i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" "+matrix[i][j]+" ");
				}else {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiral(9);

	}

}
