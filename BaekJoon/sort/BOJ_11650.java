package BaekJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][2];
		
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			 public int compare(int[] s1, int[] s2) {
				 if(s1[0]-s2[0] == 0) {
					 return s1[1] - s2[1];
				 }
				 
				 return s1[0]-s2[0];
			 }
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
		      sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
	    }
    	System.out.println(sb);
	}
}
