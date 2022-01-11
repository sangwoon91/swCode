package programmers.level2;

import java.util.Arrays;

public class StockPrice {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++){
            int check = prices[i];
            for(int j = i+1; j < prices.length; j++){
                if(check > prices[j]){
                    answer[i] = j - i;
                    break;
                }
                answer[i] = j - i;
            }
        }
        
        System.out.println(Arrays.toString(answer));		
	}
}
