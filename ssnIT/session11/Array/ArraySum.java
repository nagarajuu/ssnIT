class ArraySum{
	public static void main(String ag[]){
		int row=3,col=3;
		int add=0;
		int[][] arr = new int[row][col];
		if(row==col){
			int count = 0;
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					arr[i][j]=count++;
					System.out.print(arr[i][j]+"  ");

				}
				System.out.println();
			}

		}
		System.out.println("Side Triangle");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j){
					add=add+arr[i][j];
					System.out.println("add:"+add);
				}
				

			}
			System.out.println();
		}	
	}
}