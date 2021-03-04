package BaekJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<num;i++) {
			String act = br.readLine();
			StringTokenizer st = new StringTokenizer(act);
			switch(st.nextToken()) {
				case "push" : stack.push(st.nextToken());
					break;
				case "pop" : if(stack.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(stack.pop()).append('\n');
				}
					break;
				case "size" : sb.append(stack.size()).append('\n');
					break;
				case "empty" : if(stack.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
					break;
				case "top" : if(stack.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(stack.peek()).append('\n');
				}
					break;
			}
		}
		System.out.println(sb);
	}
}
