package baekJoon.level2;

import java.util.Scanner;

public class _2884_AlarmClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] xy = in.split(" ");
		int x = Integer.parseInt(xy[0]); 
		int y = Integer.parseInt(xy[1]);
		
		if(y < 45) {
			y = 60 - (45 - y);
			
			if(x == 0) {
				x = 23;
			}else {
				x--;
			}
		}else {
			y = y - 45;
		}
		
		System.out.println(x+" "+y);
		sc.close();
	}
}
