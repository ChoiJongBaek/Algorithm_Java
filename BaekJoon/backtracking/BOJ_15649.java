package BaekJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649 {

	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[m];
        visit = new boolean[n];
        func(n,m,0);
        System.out.println(sb);
    }
	
	public static void func(int n, int m, int depth) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				func(n,m,depth+1);
				visit[i] = false;
			}
		}
	}
}
