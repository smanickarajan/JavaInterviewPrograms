package ArrayPrograms;

public class SearchElementinSortedandRotatedArray {

	public static int SearchTarget(int[] arr, int target) {

		if (arr.length == 0)
			return -1;

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target)
				return mid;
			if (arr[start] <= arr[mid]) {
				if (target <= arr[start] && target >= arr[mid]) {
					end = mid - 1;
				} else {

					start = mid + 1;
				}
			}
			else {
				if (target >= arr[mid] && target <= arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
					
				}
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] num= {4,5,6,7,-1,0,1,2};
		
		int index = SearchTarget(num,0);
		
		System.out.println(index);
		

	}

}
