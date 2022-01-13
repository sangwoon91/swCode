package baekJoon.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818_Max_Min {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		int max = -1000000;
		int min = 1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(max < x) max = x;
			if(min > x) min = x;
		}
		
		System.out.println(min +" "+ max);
		br.close();
	}
}
