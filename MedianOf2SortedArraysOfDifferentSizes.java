// Given two sorted arrays, a[] and b[], the task is to find the median of these 
// sorted arrays, where N is the number of elements in the first array, and M is the 
// number of elements in the second array. 

// nput: a[] = {-5, 3, 6, 12, 15}, b[] = {-12, -10, -6, -3, 4, 10}
// Output: The median is 3.

// Input: a[] = {2, 3, 5, 8}, b[] = {10, 12, 14, 16, 18, 20}
// Output: The median is 11.

import java.io.*;
import java.util.Arrays;

public class MedianOf2SortedArraysOfDifferentSizes {
	public static int Solution(int[] arr) {
		int n = arr.length;
		
		if (n % 2 == 0) {
			int z = n / 2;
			int e = arr[z];
			int q = arr[z - 1];

			int ans = (e + q) / 2;
			return ans;
		}
		
		else {
			int z = Math.round(n / 2);
			return arr[z];
		}
	}

	public static void main(String[] args)	{
		int[] arr1 = { -5, 3, 6, 12, 15 };
		int[] arr2 = { -12, -10, -6, -3, 4, 10 };

		int i = arr1.length;
		int j = arr2.length;

		int[] arr3 = new int[i + j];
		System.arraycopy(arr1, 0, arr3, 0, i);
		System.arraycopy(arr2, 0, arr3, i, j);
		Arrays.sort(arr3);
		System.out.print("Median = " + Solution(arr3));
	}
}
