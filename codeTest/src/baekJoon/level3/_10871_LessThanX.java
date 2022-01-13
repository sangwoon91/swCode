package baekJoon.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10871_LessThanX {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			int y = Integer.parseInt(st.nextToken());
			
			if(x > y) {
				if(sb.length() == 0) {
					sb.append(y);
				}else {
					sb.append(" "+y);					
				}
			}
		}
		br.close();
		System.out.println(sb.toString());
	}
}
