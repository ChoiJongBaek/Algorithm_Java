package BaekJoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11866 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int idx;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		idx = k-1;
		sb.append('<');
		
		while(!list.isEmpty()) {
			while(idx>=list.size())
				idx = idx - list.size();
			sb.append(list.get(idx)).append(", ");
			list.remove(idx);
			idx += (k - 1);
		}
		sb.replace(sb.length()-2, sb.length()+1, ">");
		System.out.println(sb);
	}
}
