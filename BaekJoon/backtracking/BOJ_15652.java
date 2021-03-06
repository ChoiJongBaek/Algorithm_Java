package BaekJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15652 {

	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[m];
        func(n,m,1,0);
        System.out.println(sb);
    }
	
	public static void func(int n, int m, int at, int depth) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=at;i<=n;i++) {
			arr[depth] = i;
			func(n, m, i, depth+1);
		}
	}
}
