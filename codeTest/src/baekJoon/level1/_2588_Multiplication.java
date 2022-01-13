package baekJoon.level1;

import java.util.Scanner;

public class _2588_Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int x100 = x / 100;
		int x10 = (x - (x100 * 100)) / 10;
		int x1 = x - (x100*100) - (x10 * 10);

		int y100 = y / 100;
		int y10 = (y - (y100 * 100)) / 10;
		int y1 = y - (y100*100) - (y10 * 10);
		
		System.out.println( ((x100 * y1)*100) + ((x10 * y1)*10) + ((x1 * y1)));
		System.out.println( ((x100 * y10)*100) + ((x10 * y10)*10) + ((x1 * y10)));
		System.out.println( ((x100 * y100)*100) + ((x10 * y100)*10) + ((x1 * y100)));
		System.out.println(((x100 * y1)*100) + ((x10 * y1)*10) + ((x1 * y1))
						+ (((x100 * y10)*100) + ((x10 * y10)*10) + ((x1 * y10))) * 10 
						+ (((x100 * y100)*100) + ((x10 * y100)*10) + ((x1 * y100))) * 100
				);
	}
}
