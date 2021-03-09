package BaekJoon.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<Integer>();
		
		if(num == 1) {
			System.out.println(1);
			return;
		}
		
		for(int i=1;i<=num;i++) {
			que.add(i);
		}
		
		while(que.size() != 2) {
			que.remove();
			int tmp = que.poll();
			que.add(tmp);
		}
		
		que.remove();
		System.out.println(que.peek());
	}
}
