package programmers.level1;

public class WaterMelon {

	public static void main(String[] args) {
		
		int n = 3;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                sb.append("��");
            }else{
                sb.append("��");
            }
        }
        System.out.println(sb.toString());		
	}
}
