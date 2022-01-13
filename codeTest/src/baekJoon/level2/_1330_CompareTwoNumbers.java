package baekJoon.level2;

import java.util.Scanner;

public class _1330_CompareTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print(x == y ? "==" : x > y ? ">" : "<");
	}
}
