package ArrayPrograms;

public class FindElemntAppearOnce {

	
	public static int FindElemntsusingBinarySearch(int[] arr) {		
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
		
		if (start==end) {
			return arr[start];
		}else if (mid % 2!=0) {
			if(arr[mid-1]==arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
		}
		else {
			if(arr[mid]==arr[mid+1]) {
				start=mid+2;
			}else {
				end=mid;
			}
		}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] num= {1,1,2,2,3,4,4,5,5};
		
		System.out.println(FindElemntsusingBinarySearch(num));

	}

}
