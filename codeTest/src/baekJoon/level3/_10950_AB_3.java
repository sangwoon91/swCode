package baekJoon.level3;

import java.util.Scanner;

public class _10950_AB_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
		sc.close();
	}
}
