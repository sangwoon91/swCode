package baekJoon.level5;

import java.util.Arrays;
import java.util.Scanner;

public class _1546_Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		int i = 0;
		int max = 0;
		while(sc.hasNext()) {
			int x = sc.nextInt();
			if(x > max) {
				max = x;
			}
			arr[i] = x;
			i++;
		}
		
		double avg = 0;
		for(int j = 0; j < arr.length; j++) {
			avg += (arr[j] / max) * 100;
		}
		
		System.out.println(avg / n);
	}
}
