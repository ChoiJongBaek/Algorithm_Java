package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11727 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			System.out.println(1);
			return;
		}
		if(num == 2) {
			System.out.println(3);
			return;
		}
		
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 3;
		
		for(int i=2;i<num;i++) {
			arr[i] = ((2 * arr[i-2])%10007) + (arr[i-1]%10007);
		}
		
		System.out.println(arr[num-1]%10007);
	}

}
