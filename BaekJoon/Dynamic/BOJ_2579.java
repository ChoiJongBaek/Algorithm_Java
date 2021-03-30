package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size+1];
		int[] cnt = new int[size+1];
		for(int i=1;i<=size;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		if(size == 1) {
			System.out.println(arr[1]);
			return;
		}
		
		cnt[1] = arr[1];
		
		if(size > 1) {			
			cnt[2] = arr[1] + arr[2];
		}
		
		System.out.println(func(arr, cnt, size));
	}
	
	public static int func(int[] arr, int[] cnt, int size) {
		if(size > 0 && cnt[size] == 0) {
			cnt[size] = Math.max(func(arr, cnt, size-2), func(arr, cnt, size-3)+arr[size-1]) + arr[size];
		}
		
		return cnt[size];
	}

}
