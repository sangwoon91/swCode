package baekJoon.level5;

import java.util.Scanner;

public class _2562_Maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int maxIndex = 1;
		int index = 1;
		
		while(sc.hasNext()) {
			int x = sc.nextInt();
			
			if(max < x){
				max = x;
				maxIndex = index;
			}
			index++;
		}
		
		System.out.println(max);
		System.out.println(maxIndex);
		
		sc.close();
	}
}
