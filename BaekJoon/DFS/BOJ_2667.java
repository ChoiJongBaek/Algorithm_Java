package BaekJoon.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2667 {

	public static int[] house = new int[25*25];
	public static int[] x = new int[] {0,0,-1,1};
	public static int[] y = new int[] {-1,1,-0,0};
	public static char[][] arr;
	public static boolean [][] arr2;
	public static int cnt = 0;
	public static int size;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		size = Integer.parseInt(br.readLine());
		
		arr = new char[size][size];
		arr2 = new boolean[size][size];
		
		for(int i=0;i<size;i++) {
			arr[i] = String.valueOf(br.readLine()).toCharArray();
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i][j]=='1' && !arr2[i][j]) {
					cnt++;
					dfs(i, j);
				}
			}
		}
		
		Arrays.sort(house);
		
		sb.append(cnt).append('\n');
		for(int i=25*25-cnt;i<625;i++) {
			sb.append(house[i]).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int posX, int posY) {
		arr2[posX][posY] = true;
		house[cnt]++;
		
		for(int i=0;i<4;i++){
			int afterX = posX + x[i];
			int afterY = posY + y[i];
			
			if(afterX>=0 && afterX<size && afterY>=0 && afterY<size) {
				if(!arr2[afterX][afterY] && arr[afterX][afterY]=='1') {
					dfs(afterX, afterY);
				}
			}
		}
	}

}
