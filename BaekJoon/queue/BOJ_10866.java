package BaekJoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<cnt;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			switch (st.nextToken()) {
			case "push_front":
				list.add(0,Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				list.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(list.size()==0) {
					sb.append(-1).append(('\n'));
					break;
				} else {
					sb.append(list.get(0)).append('\n');
					list.remove(0);
					break;
				}
			case "pop_back":
				if(list.size()==0) {
					sb.append(-1).append(('\n'));
					break;
				} else {
					sb.append(list.get(list.size()-1)).append('\n');
					list.remove(list.size()-1);
					break;
				}
			case "size":
				sb.append(list.size()).append('\n');
				break;
			case "empty":
				if(list.size()==0) {
					sb.append(1).append(('\n'));
				} else {
					sb.append(0).append(('\n'));
				}
				break;
			case "front":
				if(list.size()==0) {
					sb.append(-1).append(('\n'));
				} else {
					sb.append(list.get(0)).append(('\n'));
				}
				break;
			case "back":
				if(list.size()==0) {
					sb.append(-1).append(('\n'));
				} else {
					sb.append(list.get(list.size()-1)).append(('\n'));
				}
				break;
			}
		}
		System.out.println(sb);
	}
}
