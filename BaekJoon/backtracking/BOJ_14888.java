package BaekJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14888 {

	public static int[] arr;
	public static int[] cnt;
	public static StringBuilder sb = new StringBuilder();
	public static int max = Integer.MIN_VALUE; // 최댓값
	public static int min = Integer.MAX_VALUE; // 최솟값

	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        cnt = new int[4];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++) {
        	cnt[i] = Integer.parseInt(st.nextToken());
        }
        
        func(arr[0],1,n);
        
        sb.append(max).append('\n').append(min);
        System.out.println(sb);
	}
	
	public static void func(int num, int idx, int n) {
		if(idx == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(cnt[i]>0) {
				cnt[i]--;
				
				switch(i) {
					case 0: func(num+arr[idx], idx+1, n);
						break;
					case 1: func(num-arr[idx], idx+1, n);
						break;
					case 2: func(num*arr[idx], idx+1, n);
						break;
					case 3: func(num/arr[idx], idx+1, n);
						break;
				}
				cnt[i]++;
			}
		}
	}
}
