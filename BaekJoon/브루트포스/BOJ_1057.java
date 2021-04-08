package BaekJoon.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1057 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num);
		int mem = Integer.parseInt(st.nextToken());
		int kim = Integer.parseInt(st.nextToken());
		int im = Integer.parseInt(st.nextToken());
		int round = 1;
		
		while(!((kim+1==im && im%2==0) || (im+1==kim && kim%2==0))){
			kim = (kim+1) / 2;
			im = (im+1) / 2;
			round++;
		}
		
		System.out.println(round);
	}

}
