package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class MoreSpicy {
	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		
        int answer = 0;
        
        Heap heap = new Heap();
        
        for(int a : scoville){
             heap.add(a);
        }
        
        while(heap.size() > 1  && heap.get(1) < K){
            int a = heap.get(1);
            heap.remove();
            int b = heap.get(1);
            heap.remove();
            heap.add(a + (b*2));          
            
            answer++;
        }
        
        if(heap.get(1) < K){
            System.out.println("-1");
        }
        
        System.out.println(answer);
	}
}

class Heap {
    
    List<Integer> heap;
    
    Heap(){
        heap = new ArrayList();
        heap.add(0);
    }
    
    public void add(Integer a){
        heap.add(a);
        
        int index = this.size();

        while(index > 1 && a < heap.get(index/2) ){
            heap.set(index, heap.get(index/2));
            index = index / 2;
        }
        
        heap.set(index, a);
    }
    
    public void remove(){
        if(this.size() < 1){
            return;
        }
        
        int lastValue = heap.get(this.size());
        int index = 1;
        
        heap.set(index,lastValue);
        heap.remove(this.size());   
                
        if(this.size() < 1) {
        	return;
        }
        
        index = index * 2;
        
        while(index < heap.size()){
            
            int temp = heap.get(index);
            
            if(this.size() > index+1 && temp > heap.get(index+1)){
                temp = heap.get(index+1);
                index = index+1;
            }
            
            if(lastValue > heap.get(index)){
                heap.set(index/2, temp);
                index = index * 2;
            }else{
                break;
            }

        }
        
        heap.set(index/2,lastValue);
    }
    
    public String toString(){
        return heap.toString();
    }
    
    public int size(){
        return heap.size()-1;
    }
    
    public Integer get(int i){
        return heap.get(i);
    }
}