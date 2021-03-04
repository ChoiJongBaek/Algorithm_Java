package BaekJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class BOJ_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		int num = Integer.parseInt(br.readLine());
		String word;
		for(int i=0;i<num;i++) {
			word = br.readLine();
			hm.put(word, word.length());
		}

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				if(obj1.getValue().compareTo(obj2.getValue()) == 0) {
					return obj1.getKey().compareTo(obj2.getKey());
				}
				
				
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (Entry<String, Integer> entry : list) {
		      sb.append(entry.getKey()).append('\n');
	    }
    	System.out.println(sb);

	}
}
