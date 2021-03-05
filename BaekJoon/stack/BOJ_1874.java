package BaekJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num;
		Stack<Integer> stack = new Stack<Integer>();
		
		int start = 1;
		
		for(int i=0;i<cnt;i++) {
			num = Integer.parseInt(br.readLine());
			
			if(num>=start) {
				for(int j=start;j<=num;j++) {
					stack.push(j);
					sb.append('+').append('\n');
				}
				start = num + 1;
			}
			
			if(stack.peek()!=num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
		}

		System.out.println(sb);
	}
	
	/*
	 * Stack을 이용했을 때와 배열을 이용했을 때를 비교하면 메모리/시간 모두 배열이 좋다는 것을 알 수가 있다.
	 * 
	 	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num;
		int[] arr = new int[cnt];
		
		int idx = 0;
		int start = 1;
		
		for(int i=0;i<cnt;i++) {
			num = Integer.parseInt(br.readLine());
			
			if(num>=start) {
				for(int j=start;j<=num;j++) {
					arr[idx] = j;
					sb.append('+').append('\n');
					idx++;
				}
				start = num + 1;
			}
			
			if(arr[idx-1]!=num) {
				System.out.println("NO");
				return;
			}
			
			idx--;
			sb.append('-').append('\n');
		}

		System.out.println(sb);
	}
	 *
	 * 
	 */
}
