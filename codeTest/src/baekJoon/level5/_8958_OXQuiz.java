package baekJoon.level5;

import java.util.Scanner;

public class _8958_OXQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String ox = sc.nextLine();
			int sum = 0;
			int k = 1;
			
			for(int j=0; j < ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					sum += k;
					k++;
				}else {
					k = 1;
				}
			}
			
			System.out.println(sum);
		}
	}
}
