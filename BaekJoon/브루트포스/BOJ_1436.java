package BaekJoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 0;
        
       while(count != n) {
    	   if(func(num)) {
    		   count++;
    	   }
    	   num++;
       }
       
       System.out.println(num-1);
    }
    
    public static boolean func(int num) {
    	int count = 0;
    	
    	while(count != 3) {
    		if(num%10 == 6) {
    			count++;
    		} else {
    			count = 0;
    		}
    		if(num<10) {
    			break;
    		}
    		num = num / 10;
    	}
    	
    	if(count == 3)
    		return true;
    	else
    		return false;
    }
}
