package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_11053 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] strArr = new String[size];
		StringTokenizer st = new StringTokenizer(str);
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Integer[] cnt = new Integer[size];
		
		for(int i=0;i<size;i++) {
			func(i, arr, cnt);
		}
		
		Arrays.sort(cnt, Collections.reverseOrder());
		System.out.println(cnt[0]);
	}
	
	public static int func(int a, int[] arr, Integer[] cnt) {
		if(cnt[a] == null) {			
			cnt[a] = 1;
			
			for(int i=a-1;i>=0;i--) {
				if(arr[a] > arr[i]) {
					if(cnt[a] < cnt[i]+1) {
						cnt[a] = cnt[i]+1;
					}
				}
			}
		}
		
		return cnt[a];
	}

}
