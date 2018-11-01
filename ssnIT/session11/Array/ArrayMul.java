import java.lang.*;

class ArrayMul{
	public static void main(String ag[]){
		int row=3,col=3,r,i,j,k,n;
		int[][] arr = new int[row][col];
		if(row==col){
			int count = 0;
			for( i=0;i<row;i++){
				for( j=0;j<col;j++){
					arr[i][j]=count++;
					System.out.print(arr[i][j]+"  ");

				}
				System.out.println("  ");
			}

		}
			
		if(row==col){
			int count = 0;
			for( k=0;k<row;k++){
				for( n=0;n<col;n++){
					arr[k][n]=count++;
					System.out.print(arr[k][n]+"  ");

				}
				System.out.println("   ");
			}

		}
                if(arr[i=1][j=1]==arr[k=1][n=1]){
		r=arr[i][j]*arr[k][n];	
		System.out.println(arr[i][j]*arr[k][n]+"   ");
		}
		
	               
		System.out.println("   ");
	}
}