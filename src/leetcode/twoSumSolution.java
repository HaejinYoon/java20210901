package leetcode;

public class twoSumSolution {

	public static void main(String[] args) {
		int[] nums = {3, 3};
		int target = 6;
		
		twoSum(nums, target);
	}
	
	
	
	
	
	
	
	public static int[] twoSum(int[] nums, int target) {
	        
	        for(int i = 0; i<nums.length-1; i++){
	            for(int j = i+1; j<nums.length; j++){
	                if(nums[i]+nums[j]==target){
	                    System.out.println(i);
	                    System.out.println(j);
	                	return new int[] {i, j};
	                }
	                
	            }
	        }
	     return nums;   
	 }
	 
}