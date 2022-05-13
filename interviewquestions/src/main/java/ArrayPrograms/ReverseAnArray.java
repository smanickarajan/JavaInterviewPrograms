package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int temp;
		int start = 0;
		int end = size - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		System.out.println(Arrays.toString(arr));
	}

}
