package BaekJoon.math;

import java.util.Scanner;

public class BOJ_9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int num;
		
		for(int i=0;i<cnt;i++) {
			num = sc.nextInt();
			int n1 = num / 2;
			int n2 = num / 2;
			if(sol(n1) == true && sol(n2) == true) {
				System.out.printf("%d %d\n", n1, n2);				
			}else {
				for(int j=0;j<num/2-2;j++) {
					n1--;
					n2++;
					if(sol(n1) == true && sol(n2) == true) {
						System.out.printf("%d %d\n", n1, n2);
						break;
					}
				}
			}	
		}
	}
	
	public static boolean sol(int a) {
		boolean b = true;
		
		for(int i=2;i<a;i++) {
			if(a%i == 0) {
				return false;
			}
		}
		
		return b;
	}
}
