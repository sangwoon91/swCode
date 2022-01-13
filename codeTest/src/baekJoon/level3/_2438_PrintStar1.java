package baekJoon.level3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _2438_PrintStar1 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringBuilder sb = new StringBuilder();
		
		int x = sc.nextInt();		
		
		for(int i = 0; i < x; i++) {
			sb.append("*");
			bw.write(sb.toString()+"\n");
		}
		
		bw.flush();
		bw.close();
		sc.close();
	}
}
