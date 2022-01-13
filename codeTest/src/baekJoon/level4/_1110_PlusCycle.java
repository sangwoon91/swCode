package baekJoon.level4;

import java.util.Scanner;

public class _1110_PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = x;		
		int cnt = 0;

		do {
			y = (y % 10) * 10 + (((y / 10)+(y % 10)) % 10) ;
			cnt++;
		}while(x != y);
		
		System.out.println(cnt);
		sc.close();		
	}
}
