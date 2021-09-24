package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex14LeetCode1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> num = new HashMap<>();
        Set<Integer> idx = num.keySet();
        
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(num.containsKey(nums[i])){
                num.put(nums[i], num.get(nums[i])+1);
            }else{
                num.put(nums[i], 1);
            }
        }
        
        for(Integer i : idx){
            if(num.get(i)>1){
                result+=(num.get(i)*(num.get(i)-1))/2;
            }
        }
        return result;
	}
}
