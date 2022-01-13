package baekJoon.level5;

import java.util.Scanner;

public class _2577_NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		String xyz = x*y*z+"";
		int[] cnt = new int[10];
		
		for(int i=0; i < xyz.length(); i++) {
			int n = xyz.charAt(i)-'0';
			cnt[n]++;
		}
		
		for(int i =0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
