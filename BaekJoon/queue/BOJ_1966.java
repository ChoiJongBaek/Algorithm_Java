package BaekJoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<cnt;i++) {
			String num = br.readLine();
			StringTokenizer st = new StringTokenizer(num);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			ArrayList<Integer> list = new ArrayList<Integer>();
			String number = br.readLine();
			st = new StringTokenizer(number);
			for(int j=0;j<n;j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			func(m,list,sb);
			if(i == cnt-1) {
				break;
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	
	public static void func(int m, ArrayList<Integer> list, StringBuilder sb) {
		int cnt = 0;
		
		while(!list.isEmpty()) {
			boolean ans = true;
			for(int i=1;i<list.size();i++) {
				if(list.get(0) < list.get(i)) {
					int tmp = list.get(0);
					list.remove(0);
					list.add(tmp);
					ans = false;

					if(m == 0) {
						m = list.size()-1;
					} else {
						m--;
					}
					break;
				}
				
			}
			
			if(ans == true) {
				list.remove(0);
				cnt++;
				if(m == 0) {					
					break;
				} else {
					m--;
				}
			}
		}
		
		sb.append(cnt);
	}
}
