package BaekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine()); // 총 인원 수
		String ti = br.readLine(); // 사람마다 걸리는 시간(문자열)
		String[] arr = ti.split(" ");
		int[] pt = new int[cnt]; // 사람마다 걸리는 시간(정수형)
		int[] time = new int[cnt];
		int tot = 0;
		
		for(int i=0;i<cnt;i++) {
			pt[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(pt);
		
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<=i;j++) {
				time[i] += pt[j];
			}
			tot += time[i];
		}
		
		System.out.println(tot);
	}

}
