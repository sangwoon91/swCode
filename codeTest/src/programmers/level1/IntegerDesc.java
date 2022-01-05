package programmers.level1;

public class IntegerDesc {

	public static void main(String[] args) {
        long answer = 0;
        long n = 118372;
        
        String number = new String(""+n);
        int[] arr = new int[number.length()];
        int[] count = new int[10];
        int[] sort = new int[number.length()];
        
        for(int i = 0; i < number.length(); i++){
            arr[i] = number.charAt(i)-48;
            count[number.charAt(i)-48]++;
        }
        
        int cnt = 0;
        for(int i = count.length-1; i >= 0 ; i--){
            cnt += count[i];
            count[i] = cnt;
        }
        
        for(int j = 0; j < arr.length; j++){
            count[arr[j]]--;
            sort[count[arr[j]]] = arr[j];
        }
        
        StringBuffer sb = new StringBuffer();
        for(int k : sort){
            sb.append(k);
        }
        
        answer = Long.parseLong(sb.toString());
        
        System.out.println(answer);		
	}
}
