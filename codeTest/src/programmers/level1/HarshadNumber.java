package programmers.level1;

public class HarshadNumber {
	public static void main(String[] args) {
		int x = 10;
		
	    String s = ""+x;
	    int c = 0;
	    
	    for(int i = 0; i < s.length(); i++){
	        c += s.charAt(i)-'0';
	    }
	    
	    System.out.println(x % c != 0 ? false : true);	
	}
}
