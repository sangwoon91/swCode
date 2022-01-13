package baekJoon.level5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _3052_Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		while(sc.hasNext()) {
			set.add(sc.nextInt() % 42);
		}
		System.out.println(set.size());
	}
}
