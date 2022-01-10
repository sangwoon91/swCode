package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class TargetNumber {
	public static void main(String[] args) {
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		int answer = 0;
		int nodeCnt = 1;
		
		List<Integer> array = new ArrayList();
		array.add(0);   
		array.add(0);   //depth 1
		
		//이진 트리 생성
		for(int number : numbers){
			
			int a = number;
			int b = number * -1;
			
			for(int i = 0; i < nodeCnt; i++){
				int parentIndex = ((array.size()-1)+1) / 2;
				int parentValue = array.get(parentIndex);
				
				array.add(parentValue+a);
				array.add(parentValue+b);   
			}
			nodeCnt *= 2;
		}
		
		int lastDepthIndex = (int)Math.pow(2, numbers.length);
		
		for(int i = lastDepthIndex; i < array.size()-1; i++){
			if(array.get(i).intValue() == target ) answer++;
		}
		
		System.out.println(answer);
	}	
}
