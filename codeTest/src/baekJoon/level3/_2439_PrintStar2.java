package baekJoon.level3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _2439_PrintStar2 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringBuilder sb;
		
		int x = sc.nextInt();		
		
		for(int i = 1; i <= x; i++) {
			sb = new StringBuilder();			
			for(int j = 1; j <= x; j++) {
				if(j <= x-i) {
					sb.append(" ");
				}else {
					sb.append("*");
				}
			}
			bw.write(sb.toString()+"\n");
		}
		
		bw.flush();
		bw.close();
		sc.close();
	}
}
