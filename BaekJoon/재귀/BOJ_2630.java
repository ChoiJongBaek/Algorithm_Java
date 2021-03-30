package BaekJoon.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2630 {
	
	static int blue = 0;
	static int white = 0;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int[][] sq;
		
		
		int len = Integer.parseInt(br.readLine());
		sq = new int[len][len];
		for(int i=0;i<len;i++){
			String[] arr = br.readLine().split(" ");
			for(int j=0;j<len;j++) {
				sq[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		func(sq, 0, 0, len);
		
		sb.append(white).append('\n').append(blue);
		System.out.println(sb);
		
	}
	
	public static void func(int[][] sq, int x, int y, int len) {
		boolean b = true;
		
		for(int i=x;i<x+len;i++) {
			for(int j=y;j<y+len;j++) {
				if(sq[x][y] != sq[i][j]) {
					b = false;
					break;
				}
			}
			if(!b) {
				break;
			}
		}
		
		if(b) {
			if(sq[x][y] == 1) {
				blue++;
			} else {
				white++;
			}
		} 
		if(!b) {
			func(sq, x, y, len/2);
			func(sq, x+len/2, y, len/2);
			func(sq, x, y+len/2, len/2);
			func(sq, x+len/2, y+len/2, len/2);
		}
	}

}
