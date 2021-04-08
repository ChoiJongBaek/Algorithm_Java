package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_11722 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num);
		int cnt[] = new int[size];
		Integer res[] = new Integer[size];
		for(int i=0;i<size;i++) {
			cnt[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=size-1;i>=0;i--) {
			func(i, size, cnt, res);
		}
		
		Arrays.sort(res, Collections.reverseOrder());
		System.out.println(res[0]);
	}
	
	public static void func(int a, int size, int[] cnt, Integer[] res) {
		if(res[a] == null) {			
			res[a] = 1;
			for(int i=a+1;i<size;i++) {
				if(cnt[a]>cnt[i]) {
					if(res[a]<res[i]+1) {
						res[a] = res[i]+1;
					}
				}
			}
		}
		
	}

}
