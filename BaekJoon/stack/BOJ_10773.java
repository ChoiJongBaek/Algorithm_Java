package BaekJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int tot = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int idx;
		for(int i=0;i<cnt;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				stack.push(num);
			} else {
				stack.pop();
			}
		}
		
		idx = stack.size();
		
		for(int i=0;i<idx;i++) {
			tot += stack.pop();
		}
		
		System.out.println(tot);
	}

}
