package BaekJoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();
		int num = Integer.parseInt(str);
		int res = 0;
		
		for(int i=num-(9*len);i<num;i++) {
			int n = i;
			int sum = i;
			while(n!=0) {
				sum += n%10;
				n /= 10;
			}
			if(sum == num) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
	}
}
