package BaekJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[][] arr = new String[num][2];
		
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			 public int compare(String[] s1, String[] s2) {
				 return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			 }
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
		      sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
	    }
    	System.out.println(sb);
	}
}
