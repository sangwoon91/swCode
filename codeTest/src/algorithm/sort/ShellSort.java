package algorithm.sort;

import java.util.Arrays;

public class ShellSort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 51);
		}

		System.out.println("쉘소팅 전 : "+Arrays.toString(arr));
		
		int gapIndex = 0;
		
		int n = arr.length / 2;
		
		while(n >= 1) {
			
			shellSort(arr , n);
			
			System.out.println("GAP : "+n+ " | 정렬 : "+ Arrays.toString(arr));
			n /= 2;
		}
		
	}
	
	private static void shellSort(int [] arr, int n) {
		for(int i=0; i < n; i++) {
			
			insertSort(arr, n, i);
		}		
	}
	
	private static void insertSort(int [] arr, int n, int begin) {
		for(int i = begin+n; i < arr.length; i += n) {
			int target = arr[i];
			int j = i-n;
			
			while(j >= 0 && target < arr[j]) {
				arr[j+n] = arr[j];
				j -= n;
			}
			
			arr[j+n] = target;
		}
	}
}
