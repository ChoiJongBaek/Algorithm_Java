package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[num+1];
		cnt[0] = 0; 
		cnt[1] = 0;
		
		for(int i=2;i<=num;i++) {
			cnt[i] = cnt[i-1]+1;
			if(i % 2 == 0) {
				if(cnt[i] > cnt[i/2]+1) {
					cnt[i] = cnt[i/2]+1;
				}
			}
			if(i % 3 == 0) {
				if(cnt[i] > cnt[i/3]+1) {
					cnt[i] = cnt[i/3]+1;
				}
			}
		}
		System.out.println(cnt[num]);
	}

}
