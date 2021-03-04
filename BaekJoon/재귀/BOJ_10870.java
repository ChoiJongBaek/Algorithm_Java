package BaekJoon.재귀;

import java.util.Scanner;

public class BOJ_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		System.out.println(pibo(cnt));
		
		
	}
	
	public static int pibo(int cnt) {
		
		if(cnt == 1 || cnt ==2)
			return 1;
		else if(cnt == 0)
			return 0;
		
		return pibo(cnt-1)+pibo(cnt-2);
		
	}
}
