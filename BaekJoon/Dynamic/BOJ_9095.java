package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_9095 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[cnt];
		int[] ans;
		int max = 1;
		
		for(int i=0;i<cnt;i++) {
			int ent = Integer.parseInt(br.readLine());
			arr[i]  = ent;
			if(ent > max) {
				max = ent;
			}
		}
		
		ans = new int[max+1];
		ans[1] = 1;
		ans[2] = 2;
		ans[3] = 4;
		
		for(int i=4;i<=max;i++) {
			ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
		}
		
		for(int i=0;i<cnt;i++) {
			sb.append(ans[arr[i]]).append('\n');
		}
		
		System.out.println(sb);
	}

}
