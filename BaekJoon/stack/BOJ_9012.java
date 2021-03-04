package BaekJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0;i<cnt;i++) {
			String ans = br.readLine();
			func(ans);
		}
		System.out.println(sb);
	}
	
	public static void func(String ans) {
		Stack stack = new Stack();
		char[] arr = ans.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == '(') {
				stack.push(arr[i]);
			} else if(arr[i] == ')') {
				if(stack.isEmpty()) {
					sb.append("NO").append('\n');
					return;
				}
				if(stack.peek().equals('(')) {
					stack.pop();
				}
			}
		}
		
		if(stack.size() == 0) {
			sb.append("YES").append('\n');
		} else {
			sb.append("NO").append('\n');
		}
	}

	/*
	 * 첫번째 제출 코드
	 
	 public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0;i<cnt;i++) {
			String ans = br.readLine();
			System.out.println(func(ans));
		}
	}
	
	public static String func(String ans) {
		String boo;
		Stack stack = new Stack();
		char[] arr = ans.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == '(') {
				stack.push(arr[i]);
			} else if(arr[i] == ')') {
				if(stack.isEmpty()) {
					return "NO";
				}
				if(stack.peek().equals('(')) {
					stack.pop();
				}
			}
		}
		
		if(stack.size() == 0) {
			boo = "YES";
		} else {
			boo = "NO";
		}
		
		return boo;
	}
	 
	 *
	 */
}
