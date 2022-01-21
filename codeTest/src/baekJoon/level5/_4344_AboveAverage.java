package baekJoon.level5;

import java.util.Scanner;

public class _4344_AboveAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			int sum = 0;
			for(int k = 0; k < n; k++) {
				int score = sc.nextInt();
				arr[k] = score;
				sum += score;
			}
			
			double avg = (double)sum / n;
			
			double cnt = 0;
			for(int k = 0; k < n; k++) {
				if(arr[k] > avg) cnt++;
			}			

			double round = Math.round((cnt / n)*100*1000) / 1000.0;				
			System.out.println(String.format("%.3f",round)+"%");				
		}
	}
}
