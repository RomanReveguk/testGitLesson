package Dz;

public class MaxNumberOfArray {
	public static void Mass( int[] array) {
		int max = array[0];

for (int i = 0; i < array.length; i++) {
			if (max < array[i])
			max = array[i];
}
		System.out.println(max);
	
}

	public static void main(String[] args) {

		int[] arr = new int [5]; 
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int [] arr2 = {1,3,5,4,6,7};
		
		Mass(arr);
		Mass(arr2);
		
		
		
	}

}
