package programmers.level2;

import java.util.*;

public class FunctionDevelop {
    public static void main(String[] args) {
    	int[] answer = {};
    	int[] progresses = {95, 90, 99, 99, 80, 99};
    	int[] speeds = {1, 1, 1, 1, 1, 1};
    	int day = 0;
    	
    	Queue<Integer> jobQue = new LinkedList<Integer>();
    	Queue<Integer> speedQue = new LinkedList<Integer>();
    	List<Integer> list = new ArrayList();
    	
    	for(int job : progresses){
    		jobQue.offer(job);
    	}
    	
    	for(int speed : speeds){
    		speedQue.offer(speed);
    	}        
    	
    	int count = 0;
    	
    	while(!jobQue.isEmpty()){
    		int per = jobQue.peek();
    		int speed = speedQue.peek();
    		
    		per = per + (speed * day);
    		
    		if(per >= 100){
    			jobQue.poll();
    			speedQue.poll();
    			count++;
    			
    			if(jobQue.isEmpty()){
    				list.add(count);
    				break;
    			}
    		}else{
    			if(count > 0){
    				list.add(count);
    				count = 0;
    			}
    			day++;
    			continue;
    		}
    		
    	}
    	
    	int size = list.size();
    	answer = new int[size];
    	
    	for(int i = 0; i < size; i++){
    		answer[i] = list.get(i);
    	}
    	
    	System.out.println(Arrays.toString(answer));
	}

}
