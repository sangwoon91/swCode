package baekJoon.level3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _2741_NPrint {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++ ) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		bw.close();
		sc.close();
	}
}
