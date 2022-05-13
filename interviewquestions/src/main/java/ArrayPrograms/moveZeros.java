package ArrayPrograms;

import java.util.Arrays;

public class moveZeros {

	
	public static  void MoveZeros(int[] arr) {
		int len=arr.length;
		int count=0;
		
		for (int i=0;i<len;i++) {
			if (arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		
		while(count<len) {
			arr[count++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] num= {0,3,2,0,5};
		MoveZeros(num);

	}

}
