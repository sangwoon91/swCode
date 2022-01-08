package programmers.level1;

public class MockExam {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arrC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] abc = new int[3];        
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == arrA[i % arrA.length]){
                abc[0]++;
            }
            if(answers[i] == arrB[i % arrB.length]){
                abc[1]++;
            }            
            if(answers[i] == arrC[i % arrC.length]){
                abc[2]++;     
            }
        }
        
        int max = Math.max(Math.max(abc[0],abc[1]),abc[2]);
        
        if(abc[0] == max && abc[1] == max && abc[2] == max) {
//            return new int[] {1,2,3};
        }else if(abc[0] == max && abc[1] == max) {
//            return new int[] {1,2};
        }else if(abc[0] == max && abc[2] == max) {
//            return new int[] {1,3};
        }else if(abc[1] == max && abc[2] == max) {
//            return new int[] {2,3};
        }else if(abc[0] == max) {
//            return new int[] {1};
        }else if(abc[1] == max) {
//            return new int[] {2};
        }else {
//            return new int[] {3};
        }      		
	}
}
