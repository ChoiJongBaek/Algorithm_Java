package BaekJoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		char[][] arr = new char[h][w];
		int min = 64;
		boolean[][] b = new boolean[h][w];
		
		for(int i=0;i<h;i++) {
			arr[i] = br.readLine().toCharArray();
		}

		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(arr[i][j] == 'W') {
					b[i][j] = true;
				} else {
					b[i][j] = false;
				}
			}
		}
		
		for(int i=0;i<h-7;i++) {
			for(int j=0;j<w-7;j++) {
				min = func(i,j,arr,b, min);
			}
		}
		
		System.out.println(min);
	}
	
	public static int func(int h, int w, char[][] arr, boolean[][] b1, int minN){
	
		boolean ans = b1[h][w];
		int cnt = 0;
		int num;
		for(int i=h;i<h+8;i++) {
			for(int j=w;j<w+8;j++) {
				if(b1[i][j] != ans) {
					cnt++;
				}
				ans = !ans;
			}
			ans = !ans;
		}
		
		num = Math.min((minN<cnt?minN:cnt), (minN<64-cnt?minN:64-cnt));
		
		return num;
	}
}
