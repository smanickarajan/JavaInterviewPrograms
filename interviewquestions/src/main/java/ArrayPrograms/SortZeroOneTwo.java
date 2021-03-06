package ArrayPrograms;

import java.util.Arrays;


public class SortZeroOneTwo {
public static int[] sort(int[] arr) {
	
	int start=0;
	int mid=0;
	int high=arr.length-1;
	
	while(mid<=high) {
		switch(arr[mid]) {
		case 0:{
			swap(arr,start,mid);
			start++;
			mid++;
			
			break;}
			
			
			case 1: {
				mid++;
				break;}
	
			case 2:{
				swap(arr,mid,high);
				high--;
				break;}
		
	}}
	return arr;
	
}

public static void swap(int[] arr, int start,int end) {
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	
}
	public static void main(String[] args) {
		int[] num= {0,1,2,2,1,0,1};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int[] sortedarray = sort(num);
		System.out.println(Arrays.toString(sortedarray));

	}

}
