package leetcode;

import java.util.Arrays;

public class leetCode7Solution {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		
	}
	public static int reverse(int x) {
		
		int[] xrr = new int[100];
        int result = 0;
        int index = 0;
        boolean s=false;
        if(x<0) {
            x=-x;
            s=true;
        }
        int y=0;
        while(x>0) {
            xrr[y] = x%10;
            x=x/10;
            y++;
            index++;
            System.out.println(Arrays.toString(xrr));
            System.out.println("index : " +index);
        }
        for(int i=index-1; i>=0; i--){
            if(result >= (int)(Math.pow(2,31)-1) && result <= (int)(Math.pow(-2,31))){
            return 0;
            }
        	result += (int)(xrr[i]*Math.pow(10, index-i-1));
            System.out.println("result : "+result);
            if(result<0)
            	return 0;
            
        }
        
        
        if(s==true) {
        	return -result;
        }else {
        return result;
        }
    }
}
