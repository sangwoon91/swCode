package baekJoon.level4;

import java.util.Scanner;

public class _10954_AB_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x+y > 0) {
				System.out.println(x+y);				
			}
		}
	}
}
