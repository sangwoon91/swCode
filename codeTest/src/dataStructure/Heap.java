package dataStructure;

import java.util.ArrayList;


public class Heap {

	public static void main(String[] args) throws Exception {
		int[] scoville = {0,0,0,0,0,0,0};
		int K = 1;
		
        int answer = 0;
        
        Heap heap = new Heap();
        
        for(int a : scoville){
        	 heap.add(a);
        }

        System.out.println(heap.toString());
        
        while(heap.size() > 1 && heap.getFirstValue() < K){
            int a = heap.getFirstValue();
            heap.pull();
            int b = heap.getFirstValue();
            heap.pull();

            
            heap.add(a + (b*2));          

            System.out.println(heap.toString());
            
            answer++;
        }        
	}
	private ArrayList<Integer> array;
	
	public Heap() {
		array = new  ArrayList<Integer>();
		array.add(0);
	}
	
	public int getParentIndex(int index) throws Exception {
		if(index == 1) throw new Exception("root node"); 
		return index / 2;
		
	}
	
	public int getLeftChildIndex(int index) {
		return index * 2;
	}
	
	public int getRightChildIndex(int index) {
		return index * 2 + 1;
	}	
	
	public int getParentValue(int index) throws Exception {
		if(index == 1) throw new Exception("root node"); 
		return array.get(index / 2);
	}
	
	public int getLeftChildValue(int index) throws Exception {
		if(index * 2 > size()) throw new ArrayIndexOutOfBoundsException();
		return array.get(index * 2);
	}
	
	public int getRightChildValue(int index) {
		if(index * 2 + 1 > size()) throw new ArrayIndexOutOfBoundsException();
		return array.get(index * 2 + 1);
	}	
	
	public int getLastValue() {
		return array.get(size());
	}
	
	public int getFirstValue() {
		return array.get(1);
	}	
	
	public void add(int value) throws Exception {
		array.add(value);
		
		int index = size(); 
		while(index != 1 && getParentValue(index) > value) {
			array.set(index, getParentValue(index));
			index = getParentIndex(index);
		}
		
		array.set(index, value);
	}
	
	public void pull() throws Exception {
		if(size() < 1) {
			throw new Exception("not in node"); 
		}
		
		int lastValue = getLastValue();
		
		array.set(1,lastValue);
		array.remove(this.size());
		
		if(size() < 1) {
			return;
		}		
		
		int index = 1;
		
		while(size() >= index * 2) {
			int temp = getLeftChildValue(index);
			boolean isLeft = true;
			
			if(size() >= getRightChildIndex(index) 
					&& getLeftChildValue(index) > getRightChildValue(index) ) {
				temp = getRightChildValue(index);
				isLeft = false;
			}
			
			
			if(lastValue < temp) {
				break;
			}
			
			
			array.set(index, temp);
			if(isLeft) {
				index = index * 2;
			}else {
				index = index * 2 + 1;
			}
		}
		
		array.set(index, lastValue);
	}
	
	public int size() {
		return array.size() - 1;
	}
	
	public String toString() {
		return array.toString();
	}	
}
