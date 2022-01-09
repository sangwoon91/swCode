package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {1,1,1,2,3,4,1,1,2,1,1,5,1};
		int location = 9;
		
        int answer = 0;
        int target = priorities[location];
        int max = 0;
                    
        while(max != target){
            int index = 0;
            max = 0;
            
            for(int i = 0; i < priorities.length; i++){
                if(max < priorities[i]){
                    max = priorities[i];
                    index = i;
                }
            }        
            
            if(max == target) break;
            
            int size = priorities.length-1;
            int[] arr = new int[size];

            //뒷 배열 복사
            if(index+1 < priorities.length){
                System.arraycopy(priorities, index+1, arr, 0, priorities.length-(index+1));
            }

            //앞 배열 복사
            if(index > 0){
                System.arraycopy(priorities, 0, arr, priorities.length-(index+1), index);   
            }    

            //위치 변경
            if(location < index){
                location = location + priorities.length-(index+1);
            }else{
                location = location - index - 1;
            }
            
            
            priorities = arr;
            answer++;
        }

        for(int i = 0; i <= location; i++){
            if(priorities[i] == max){
                answer++;
            }
        }
        
        System.out.println(answer);
        
	}
}
