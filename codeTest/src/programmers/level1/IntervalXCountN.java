package programmers.level1;

import java.util.Arrays;

public class IntervalXCountN {
	public static void main(String[] args) {
		int x = -1;
		int n = 10;

        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++){
            answer[i] = (long)x * (i+1);
        }
        
        System.out.println(Arrays.toString(answer));
	}
}
