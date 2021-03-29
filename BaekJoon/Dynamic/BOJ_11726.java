package BaekJoon.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		if(size == 1) {
			System.out.println(1);
			return;
		}
		if(size == 2) {
			System.out.println(2);
			return;
		}
		
		int[] arr = new int[size];
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i=2;i<size;i++) {
			arr[i] = (arr[i-1]%10007) + (arr[i-2]%10007);
		}
		
		System.out.println(arr[size-1]%10007);
		
		
	}

}
