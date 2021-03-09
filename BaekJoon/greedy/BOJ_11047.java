package BaekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
	
	// 총액에서 i번째 동전을 반복문을 통해 한번씩 다 뺌
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int idx = n-1;
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		while(arr[idx]>k) {
			idx--;
		}
		
		for(int i=idx;i>=0;i--) {
			while(k-arr[i]>=0) {
				k -= arr[i];
				cnt++;
			}
			if(k==0)
				break;
		}
		System.out.println(cnt);
	}
	
	/* i번째 동전값에 대한 총액에서의 몫을 구해서 한번에 뺌
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int idx = n-1;
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		while(arr[idx]>k) {
			idx--;
		}
		
		for(int i=idx;i>=0;i--) {
			while(k-arr[i]>=0) {
				cnt += k / arr[i];
				k %= arr[i];
			}
			if(k==0)
				break;
		}
		System.out.println(cnt);
	}
	*/

}
