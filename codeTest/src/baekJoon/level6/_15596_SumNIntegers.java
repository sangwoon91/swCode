package baekJoon.level6;

public class _15596_SumNIntegers {	
    long sum(int[] a) {
        long ans = 0;
        
		for(int i : a) {
			ans += i;
		}        
        return ans;
    }
}
