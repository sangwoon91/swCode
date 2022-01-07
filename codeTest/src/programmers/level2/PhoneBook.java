package programmers.level2;

import java.util.Arrays;

public class PhoneBook {

	public static void main(String[] args) {
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = true;
		
		if(phone_book.length < 2){
			System.out.println("false");
		}
		
		Arrays.sort(phone_book);
		
		for(int i = 1; i < phone_book.length; i++){
			if(phone_book[i].indexOf(phone_book[i-1]) == 0){
				System.out.println("fasle");
			}
		}
		
		System.out.println("true");
		
	}
}
