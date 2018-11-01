class ArrayTest{
	public static void main(String ar[]){
		int[] arr = {1,2,3,2,1};
		System.out.println(arr.length);

		int sum = 0;

		for(int i=0; i<arr.length; i++ ){
			sum+=arr[i];
		}
		System.out.println("Average: "+ sum/arr.length);
	}
}