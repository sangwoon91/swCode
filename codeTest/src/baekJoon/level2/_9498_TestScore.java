package baekJoon.level2;

import java.util.Scanner;

public class _9498_TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String result = "";
		if(x >= 90) {
			result = "A";
		}else if(x >= 80) {
			result = "B";
		}else if(x >= 70) {
			result = "C";
		}else if(x >= 60) {
			result = "D";
		}else {
			result = "F";
		}
		
		System.out.println(result);
	}
}
